package com.example.agendabelupet.ui.collected

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.agendabelupet.R
import com.example.agendabelupet.adapters.AbstractRecyclerAdapter
import com.example.agendabelupet.adapters.AllDogsAdapter
import com.example.agendabelupet.adapters.DogListAdapter
import com.example.agendabelupet.databinding.FragmentCollectedItemsBinding
import com.example.agendabelupet.models.entities.ItemEntity
import com.example.agendabelupet.ui.agenda.AgendaFragmentDirections
import com.example.agendabelupet.ui.agenda.AgendaFragmentDirections.actionFragmentAgendaToDogListFragment
import com.example.agendabelupet.utils.CollectedList
import com.example.agendabelupet.utils.CustomDialogsExt
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.util.*

class CollectedItemsFragment : Fragment() {

    private lateinit var binding: FragmentCollectedItemsBinding
    private lateinit var adapter: AllDogsAdapter

    private lateinit var customDialogsExt: CustomDialogsExt

    private val viewModel: CollectedItemsViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCollectedItemsBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val collectedItems = CollectedList()
        customDialogsExt = CustomDialogsExt(requireActivity())

        val adapter =
            ArrayAdapter(requireContext(), R.layout.list_item, collectedItems.getOptionsCollected())

        (binding.selectCollected.editText as AutoCompleteTextView)?.setAdapter(adapter)

        viewModel.getListItemsCollected("todos")

        viewModel.loadingProgressBar.observe(viewLifecycleOwner) {
            it?.let {
                if (it) {
                    customDialogsExt.startProgressBar()
                } else {
                    customDialogsExt.dismissCustomFragment()
                }
            }
        }

        binding.selectCollected.editText?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable) {
                viewModel.viewModelScope.launch {
                    viewModel.getListItemsCollected(
                        binding.selectCollected.editText?.text?.toString()!!
                            .toLowerCase(Locale.getDefault())
                    )
                }
            }
        })

        viewModel.listItemsCollected.observe(viewLifecycleOwner) {
            it?.let {
                iniciarecyclerView(it.toMutableList())
            }
        }
    }


    private fun iniciarecyclerView(listaItens: MutableList<ItemEntity>?) {
        adapter = AllDogsAdapter(
            requireActivity(),
            listaItens,
            onItemClickListener = object : AbstractRecyclerAdapter.onClickListener<ItemEntity> {
                override fun onItemCLickListener(view: View?, item: ItemEntity, position: Int) {
                    navigateToScreen(item)
                }
            }
        )
        val linearLayoutManager = LinearLayoutManager(requireContext())
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.recyclerCollected.adapter = adapter
        binding.recyclerCollected.layoutManager = linearLayoutManager
        adapter.notifyDataSetChanged()
    }

    private fun navigateToScreen(item: ItemEntity) {
        val action =
            CollectedItemsFragmentDirections.actionCollectedItemsFragmentToDogListFragment(item)
        findNavController().navigate(action)
    }


}