package com.example.agendabelupet.ui.profit

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.viewModelScope
import com.example.agendabelupet.R
import com.example.agendabelupet.databinding.FragmentProfitBinding
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProfitFragment : Fragment() {

    private val viewModel: ProfitViewModel by viewModel()

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




        val pieChart = binding.barTeste
        pieChart.isClickable = false
        val description = Description()
        description.text = "Valores mensais"
        description.textSize = 20f
        description.textColor = R.color.light_blue
        pieChart.description = description

        viewModel.valor.observe(viewLifecycleOwner){
            it?.let {
                if(it){
                    val pieDataset = PieDataSet(viewModel.listaFinal.value, "(Avulsos não Inclusos)")

                    pieDataset.valueTextSize = 25f
//                    pieChart.setUsePercentValues(true)
                    pieDataset.colors = listOf(
                        Color.rgb(30, 136, 229), Color.rgb(179, 136, 225)
                    )
                    pieDataset.notifyDataSetChanged()
                    val pieData = PieData(pieDataset)
                    pieChart.animateXY(1000, 1000)
                    pieChart.isRotationEnabled = false
                    pieDataset.notifyDataSetChanged()
                    pieChart.data = pieData
                }
            }
        }
    }
}