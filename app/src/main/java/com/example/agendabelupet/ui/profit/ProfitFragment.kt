package com.example.agendabelupet.ui.profit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.agendabelupet.databinding.FragmentProfitBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProfitFragment : Fragment() {

    private  val viewModel: ProfitViewModel  by viewModel()

    private lateinit var binding: FragmentProfitBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfitBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.value.observe(viewLifecycleOwner){
            it?.let {
                binding.textNotifications.text = it.toString()
            }
        }
    }
}