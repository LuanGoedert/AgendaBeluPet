package com.example.agendabelupet.ui.newPlan

import android.os.Bundle
import android.telephony.PhoneNumberFormattingTextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.agendabelupet.R
import com.example.agendabelupet.databinding.FragmentNewPlanBinding
import com.example.agendabelupet.models.entities.ItemEntity
import com.example.agendabelupet.utils.CustomDialogsExt
import com.example.agendabelupet.utils.PlanTypeString
import com.example.agendabelupet.utils.WeekDaysString
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel


class NewPlanFragment : Fragment() {
    private lateinit var binding: FragmentNewPlanBinding
    private lateinit var customDialog : CustomDialogsExt
    private val viewModel: NewPlanViewModel by viewModel()
    private val itemByArgs: NewPlanFragmentArgs? by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewPlanBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        customDialog = CustomDialogsExt(requireActivity())

        setItemOnScreen()

        val items = WeekDaysString()
        val plans = PlanTypeString()

        val planAdapter = ArrayAdapter(requireContext(), R.layout.list_item, plans.loadPlanTypes())
        val adapter = ArrayAdapter(requireContext(), R.layout.list_item, items.loadWeekDays())

        binding.phoneText.editText?.addTextChangedListener(PhoneNumberFormattingTextWatcher("BR"))
        (binding.textWeekDay.editText as? AutoCompleteTextView)?.setAdapter(adapter)
        (binding.planText.editText as? AutoCompleteTextView)?.setAdapter(planAdapter)

        viewModel.isItemSaved.observe(viewLifecycleOwner){
            if(it){
                customDialog.defaultDialog(
                    title = R.string.text_saved,
                    image = R.drawable.icone_sucesso,
                    onPositive = {
                        viewModel._isItemSaved.postValue(false)
                        customDialog.dismissCustomFragment()
                        goToDogListFragment()
                    })
            }
        }

        binding.buttonSaveImage.setOnClickListener {
            viewModel.viewModelScope.launch {
                if (binding.editTextName.text?.isNotEmpty() == true &&
                    binding.textRaca.text?.isNotEmpty() == true &&
                    binding.textEndereco.text?.isNotEmpty() == true
                ) {
                    viewModel.saveDog(
                        ItemEntity(
                            ownerName = binding.editTextNameOwner.text.toString(),
                            phone = binding.phoneText.editText!!.text.toString(),
                            name = binding.editTextName.text.toString(),
                            race = binding.textRaca.text.toString(),
                            street = binding.textEndereco.text.toString(),
                            weekDay = binding.textWeekDay.editText!!.text.toString(),
                            plan = binding.planText.editText!!.text.toString(),
                            value = binding.valueText.editText!!.text.toString().toInt(),
                            district = binding.districtText.editText!!.text.toString() ,
                            houseNumer = binding.houseNumberText.editText!!.text.toString()
                        )
                    )
                }else{
                    customDialog.defaultDialog(
                        title = R.string.text_aloha,
                        image = R.drawable.icone_erro,
                        onPositive = {
                            customDialog.dismissCustomFragment()
                        }
                    )
                }
            }
        }

    }

    private fun goToDogListFragment(){
        val action = NewPlanFragmentDirections.actionNavigationDashboardToFragmentAgenda()
        findNavController().navigate(action)
    }

    private fun setItemOnScreen(){
        if(itemByArgs?.newPlanArgument != null){
            binding.inputOwnerName.editText?.setText(itemByArgs!!.newPlanArgument!!.ownerName)
            binding.inputName.editText?.setText(itemByArgs!!.newPlanArgument!!.name)
            binding.raca.editText?.setText(itemByArgs!!.newPlanArgument!!.race)
            binding.addressText.editText?.setText(itemByArgs!!.newPlanArgument!!.street)
            binding.districtText.editText?.setText(itemByArgs!!.newPlanArgument!!.district)
            binding.houseNumberText.editText?.setText(itemByArgs!!.newPlanArgument!!.houseNumer)
            binding.phoneText.editText?.setText(itemByArgs!!.newPlanArgument!!.phone)
            binding.textWeekDay.editText?.setText(itemByArgs!!.newPlanArgument!!.weekDay)
            binding.planText.editText?.setText(itemByArgs!!.newPlanArgument!!.plan)
            if(itemByArgs!!.newPlanArgument!!.value == 0){
                binding.valueText.editText?.setText("")
            }else {
                binding.valueText.editText?.setText(itemByArgs!!.newPlanArgument!!.value.toString())
            }
        }
    }

}