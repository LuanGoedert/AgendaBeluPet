package com.example.agendabelupet.ui.settings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.viewModelScope
import com.example.agendabelupet.R
import com.example.agendabelupet.databinding.FragmentSettingsBinding
import com.example.agendabelupet.utils.CustomDialogsExt
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class SettingsFragment : Fragment() {

    private lateinit var binding: FragmentSettingsBinding
    private val viewModel: SettingsViewModel by viewModel()

    private lateinit var customDialogsExt: CustomDialogsExt

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSettingsBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        customDialogsExt = CustomDialogsExt(requireActivity())

        viewModel.loadingProgressBar.observe(viewLifecycleOwner) {
            it?.let {
                if (it) {
                    customDialogsExt.startProgressBar()
                } else {
                    customDialogsExt.dismissCustomFragment()
                }
            }
        }

        viewModel.showSuccesOnGetDb.observe(viewLifecycleOwner) {
            it?.let {
                if (it) {
                    customDialogsExt.defaultDialog(
                        title = R.string.text_sucess_on_sync,
                        image = R.drawable.icone_sucesso,
                        isCancelable = false,
                        onPositive = {
                            customDialogsExt.dismissCustomFragment()
                        }
                    )
                } else {
                    customDialogsExt.defaultDialog(
                        title = R.string.text_error_on_sync,
                        image = R.drawable.icone_erro,
                        isCancelable = false,
                        onPositive = {
                            customDialogsExt.dismissCustomFragment()
                        }
                    )
                }
            }
        }

        viewModel.showSuccesOndeleteAccount.observe(viewLifecycleOwner) {
            it?.let {
                if (it) {
                    customDialogsExt.defaultDialog(
                        title = R.string.text_succes_delete_account,
                        image = R.drawable.icone_sucesso,
                        isCancelable = false,
                        onPositive = {
                            customDialogsExt.dismissCustomFragment()
                            viewModel.closeApp(requireActivity())
                        }
                    )
                } else {
                    customDialogsExt.defaultDialog(
                        title = R.string.text_error_on_delete_account,
                        image = R.drawable.icone_erro,
                        isCancelable = false,
                        onPositive = {
                            customDialogsExt.dismissCustomFragment()
                        }
                    )
                }
            }
        }

        binding.buttonSetItemsCollected.setOnClickListener {
            viewModel.initLoading()
            viewModel.setItemsCOllected(true).invokeOnCompletion {
                viewModel.stopLoading()
                viewModel.successOnGetItemFromFireBase.value = true
            }
        }


        binding.buttonSetItemsNotCollected.setOnClickListener {
            viewModel.initLoading()
            viewModel.setItemsCOllected(false).invokeOnCompletion {
                viewModel.stopLoading()
                viewModel.successOnGetItemFromFireBase.value = true
            }
        }

        binding.excludeAccount.setOnClickListener {
            customDialogsExt.defaultDialogTwoOptions(
                message = R.string.text_delete_account,
                image = R.drawable.ic_exit,
                isCancelable = false,
                onPositive = {
                    customDialogsExt.dismissCustomFragment()
                    viewModel.initLoading().invokeOnCompletion {
                        viewModel.deleteUSerAccount()
                    }
                    viewModel.stopLoading()
                },
                onNegative = {
                    customDialogsExt.dismissCustomFragment()
                }
            )

        }

        binding.buttonLogoff.setOnClickListener {
            customDialogsExt.defaultDialogTwoOptions(
                message = R.string.text_logoff,
                image = R.drawable.ic_exit,
                isCancelable = false,
                onPositive = {
                    viewModel.initLoading().invokeOnCompletion {
                        viewModel.deleteAllDb(deleteUserDbEither = true).invokeOnCompletion {
                            viewModel.stopLoading()

                        }
                    }
                    customDialogsExt.dismissCustomFragment()
                    viewModel.closeApp(requireActivity())
                },
                onNegative = {
                    customDialogsExt.dismissCustomFragment()
                }
            )
        }

        binding.buttonGetItemsFromFirestore.setOnClickListener {
            viewModel.viewModelScope.launch {
                customDialogsExt.defaultDialogTwoOptions(
                    title = R.string.text_synchronize,
                    message = R.string.text_confirmationn_firebase,
                    image = R.drawable.icone_alerta,
                    isCancelable = false,
                    onPositive = {
                        customDialogsExt.dismissCustomFragment()
                        viewModel.initLoading().invokeOnCompletion {
                            viewModel.deleteAllDb(false).invokeOnCompletion {
                                viewModel.getItemsFirebase(
                                    viewModel.user.value?.userEmail.toString()
                                )
                            }
                        }
                    },
                    onNegative = {
                        customDialogsExt.dismissCustomFragment()
                    }
                )
            }
        }
    }

}