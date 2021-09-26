package com.example.agendabelupet.ui.collected

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.agendabelupet.R
import com.example.agendabelupet.databinding.FragmentCollectedItemsBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class CollectedItemsFragment : Fragment() {

    private lateinit var binding : FragmentCollectedItemsBinding

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


    }
}