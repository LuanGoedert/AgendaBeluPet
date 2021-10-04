package com.example.agendabelupet.ui.agenda

import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.activity.addCallback
import androidx.core.net.toFile
import androidx.fragment.app.Fragment
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.agendabelupet.R
import com.example.agendabelupet.adapters.AbstractRecyclerAdapter
import com.example.agendabelupet.adapters.DogListAdapter
import com.example.agendabelupet.databinding.FragmentAgendaBinding
import com.example.agendabelupet.models.entities.ItemEntity
import com.example.agendabelupet.ui.dogList.DogListFragmentArgs
import com.example.agendabelupet.utils.CustomDialogsExt
import com.example.agendabelupet.utils.WeekDaysString
import com.google.android.material.navigation.NavigationView
import com.squareup.picasso.Picasso
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlinx.android.synthetic.main.nav_header_main.*
import java.io.File


class AgendaFragment : Fragment() {

    private val viewModel: AgendaViewModel by viewModel()

    private lateinit var abstractRecyclerAdapter: DogListAdapter

    private lateinit var binding: FragmentAgendaBinding

    private lateinit var navController: NavController


    private lateinit var customDialogsExt: CustomDialogsExt

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAgendaBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = NavController(requireContext())



        activity?.findViewById<TextView>(R.id.text_toolbar_main)?.text =
            getString(R.string.text_agenda)

        val items = WeekDaysString()
        val adapter = ArrayAdapter(requireContext(), R.layout.list_item, items.loadWeekDays())

        viewModel.weekDay.observe(viewLifecycleOwner) {
            it?.let {
                viewModel.viewModelScope.launch { viewModel.getDogsFromDatabase(it) }
            }
        }

        (binding.selectWeekDay.editText as? AutoCompleteTextView)?.setAdapter(adapter)

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            return@addCallback
        }

        customDialogsExt = CustomDialogsExt(requireActivity())





        viewModel.itensFromDb.observe(viewLifecycleOwner) {
            it?.let {
                iniciaRecyclerView(it.toMutableList())
            }
        }

        binding.button.setOnClickListener {
            viewModel.initLoading().invokeOnCompletion {
                navigateToNewPlanFragment(ItemEntity())
            }
        }

        viewModel.loadingScreen.observe(viewLifecycleOwner) {
            it?.let {
                if (it) {
                    customDialogsExt.startProgressBar()
                } else {
                    customDialogsExt.dismissCustomFragment()
                }
            }
        }

        binding.selectWeekDay.editText?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable) {
                viewModel.viewModelScope.launch { viewModel.getDogsFromDatabase(binding.selectWeekDay.editText?.text?.toString()!!) }
            }
        })
    }


    private fun iniciaRecyclerView(listaItens: MutableList<ItemEntity>?) {
        abstractRecyclerAdapter = DogListAdapter(
            requireActivity(), listaItens,
            onItemClickListener = object : AbstractRecyclerAdapter.onClickListener<ItemEntity> {
                override fun onItemCLickListener(view: View?, item: ItemEntity, position: Int) {
                    navigateToScreen(item)
                }
            }
        )
        val linearLayoutManager = LinearLayoutManager(requireContext())
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.recyclerWeek.adapter = abstractRecyclerAdapter
        binding.recyclerWeek.layoutManager = linearLayoutManager
        abstractRecyclerAdapter.notifyDataSetChanged()
    }

    private fun navigateToScreen(item: ItemEntity) {
        val action = AgendaFragmentDirections.actionFragmentAgendaToDogListFragment(item)
        findNavController().navigate(action)
    }

    private fun navigateToNewPlanFragment(item: ItemEntity) {
        val action = AgendaFragmentDirections.actionGlobalNewPlanFragment(item)
        findNavController().navigate(action)
    }

    private fun doNothing(view: View) {}

    override fun onDestroyView() {
        viewModel.stopLoading()
        customDialogsExt.dismissCustomFragment()
        super.onDestroyView()
    }
}