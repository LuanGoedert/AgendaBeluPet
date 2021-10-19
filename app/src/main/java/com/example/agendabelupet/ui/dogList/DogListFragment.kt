package com.example.agendabelupet.ui.dogList

import android.os.Bundle
import android.telephony.PhoneNumberUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.agendabelupet.R
import com.example.agendabelupet.databinding.FragmentDogListBinding
import com.example.agendabelupet.models.entities.ItemEntity
import com.example.agendabelupet.utils.CustomDialogsExt
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.text.SimpleDateFormat
import java.util.*

class DogListFragment : Fragment() {
    private val viewModel: DogListViewModel by viewModel()

    private lateinit var binding: FragmentDogListBinding

    private lateinit var customDialogsExt: CustomDialogsExt

    private val args: DogListFragmentArgs by navArgs()
    val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDogListBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        customDialogsExt = CustomDialogsExt(requireActivity())

        binding.textPetOwner.text = getString(R.string.text_owner, args.itemEntity.ownerName)
        binding.textPetName.text = getString(R.string.text_pet_name, args.itemEntity.name)
        binding.textPetRace.text = getString(R.string.text_race, args.itemEntity.race)
        binding.textPetWeekDay.text = getString(R.string.text_day, args.itemEntity.weekDay)
        binding.textPlan.text = getString(R.string.text_plan, args.itemEntity.planType)
        binding.textPhone.text = getString(
            R.string.text_phone_number,
            PhoneNumberUtils.formatNumber(args.itemEntity.phone, "BR")
        )
        binding.textPlanValue.text =
            getString(R.string.text_plan_value, args.itemEntity.value.toString())
        binding.textPetDistrict.text = getString(R.string.text_district, args.itemEntity.district)
        binding.textPetStreet.text = getString(R.string.text_sreet, args.itemEntity.street)
        binding.textPetHouseNumber.text = getString(R.string.text_n, args.itemEntity.houseNumber)

        binding.buttonCollect.isChecked = args.itemEntity.collected


        binding.buttonEditPlan.setOnClickListener {
            navigateToEditFragment(args.itemEntity)
        }

        binding.buttonCollect.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                viewModel.viewModelScope.launch {

                    viewModel.markItemAsCollected(args.itemEntity, args.itemEntity.dataQuinzenal) }
                    .invokeOnCompletion {
                        val title = if (args.itemEntity.planType == "Avulso") {
                            R.string.text_item_avulso
                        } else {
                            R.string.text_item_collected
                        }
                        customDialogsExt.defaultDialog(
                            title = title,
                            image = R.drawable.icone_sucesso
                        ) {
                            if (args.itemEntity.planType == "Avulso") {
                                viewModel.viewModelScope.launch { viewModel.deleteLoosePlan(args.itemEntity.id) }
                                    .invokeOnCompletion {
                                        customDialogsExt.dismissCustomFragment()
                                        navigateToAgendaFragment()
                                        return@invokeOnCompletion
                                    }
                            }
                            if (args.itemEntity.planType == "Quinzenal") {
                                val c = Calendar.getInstance()
                                c.add(Calendar.DATE, 14)
                                val date = Date(c.timeInMillis)
                                viewModel.viewModelScope.launch {
                                    viewModel.updateBiWeeklyPlan(
                                        sdf.format(
                                            date
                                        ), args.itemEntity.id
                                    )
                                }
                            }
                            viewModel.viewModelScope.launch {
                                val itemToUpdate = viewModel.getItemFromRepoById(args.itemEntity.id)
                                viewModel.updateToCollected(
                                    itemToUpdate,
                                    itemToUpdate.ownerName,
                                    itemToUpdate.phone
                                )

                            }
                            customDialogsExt.dismissCustomFragment()
                            navigateToAgendaFragment()
                        }
                    }
            } else {
                viewModel.viewModelScope.launch { viewModel.markItemAsNotCollected(args.itemEntity.id) }
                    .invokeOnCompletion {
                        customDialogsExt.defaultDialog(
                            title = R.string.text_item_not_collected,
                            image = R.drawable.icone_sucesso
                        ) {
                            viewModel.viewModelScope.launch {
                                val itemToUpdate = viewModel.getItemFromRepoById(args.itemEntity.id)
                                viewModel.updateToCollected(
                                    itemToUpdate,
                                    itemToUpdate.ownerName,
                                    itemToUpdate.phone
                                )

                            }
                            customDialogsExt.dismissCustomFragment()
                            navigateToAgendaFragment()
                        }
                    }
            }

        }

    }

    private fun navigateToEditFragment(itemEntity: ItemEntity?) {
        val action = DogListFragmentDirections.actionDogListFragmentToNewPlanFragment(itemEntity)
        findNavController().navigate(action)
    }

    private fun navigateToAgendaFragment() {
        val action = DogListFragmentDirections.actionGlobalFragmentAgenda()
        findNavController().navigate(action)
    }
}