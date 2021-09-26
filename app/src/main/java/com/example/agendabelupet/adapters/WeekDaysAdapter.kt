package com.example.agendabelupet.adapters

import android.app.Activity
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.agendabelupet.R
import com.example.agendabelupet.enums.WeekDaysEnums
import com.example.agendabelupet.models.entities.ItemEntity
import com.example.agendabelupet.models.entities.WeekDaysModel

class WeekDaysAdapter(
    activity: Activity,
    itensList: MutableList<WeekDaysModel> = mutableListOf(),
    onItemClickListener: AbstractRecyclerAdapter.onClickListener<WeekDaysModel>
) : AbstractRecyclerAdapter<WeekDaysModel, WeekDaysAdapter.ViewHolder>(
    activity,
    R.layout.agenda_item
) {

    init {
        itens = itensList
        this.onClick = onItemClickListener
    }


    override fun getViewHolder(view: View): WeekDaysAdapter.ViewHolder {
        return ViewHolder(view)
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val weekday: TextView = itemView.findViewById(R.id.week_day)
    }

    override fun abstractOnBindViewHolder(
        viewHoleder: ViewHolder,
        item: WeekDaysModel?,
        position: Int
    ) {
        viewHoleder.weekday.text = when (item?.day) {//adaptar pq o enum n pode ter sinais
            WeekDaysEnums.SEGUNDA -> "Segunda"
            WeekDaysEnums.TERCA -> "Terça"
            WeekDaysEnums.QUARTA -> "Quarta"
            WeekDaysEnums.QUINTA -> "Quinta"
            WeekDaysEnums.SEXTA -> "Sexta"
            WeekDaysEnums.SABADO -> "Sábado"
            else -> "Avulso"
        }
        viewHoleder.itemView.setOnClickListener{

        }
    }

}