package com.example.agendabelupet.ui.profit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.agendabelupet.databinding.FragmentProfitBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProfitFragment : Fragment() {

    private  val profitViewModel: ProfitViewModel  by viewModel()

    private lateinit var binding: FragmentProfitBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfitBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = profitViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }
}