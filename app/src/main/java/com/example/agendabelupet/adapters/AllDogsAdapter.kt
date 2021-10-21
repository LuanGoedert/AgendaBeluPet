package com.example.agendabelupet.adapters

import android.app.Activity
import android.graphics.Color
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat.getColor
import androidx.recyclerview.widget.RecyclerView
import com.example.agendabelupet.R
import com.example.agendabelupet.models.entities.ItemEntity
import org.w3c.dom.Text

class AllDogsAdapter(
    activity: Activity,
    itensList: MutableList<ItemEntity>? = mutableListOf(),
    onItemClickListener: AbstractRecyclerAdapter.onClickListener<ItemEntity>
) : AbstractRecyclerAdapter<ItemEntity, AllDogsAdapter.ViewHolder>(
    activity,
    R.layout.collected_items
) {

    init {
        if (itensList != null) {
            itens = itensList
        }
        this.onClick = onItemClickListener

    }

    override fun getViewHolder(view: View): AllDogsAdapter.ViewHolder {
        return ViewHolder(view)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val petName: TextView = itemView.findViewById(R.id.card_pet_name_collected)
        val weekDay : TextView = itemView.findViewById(R.id.text_weekday_collected)
        val collected : TextView = itemView.findViewById(R.id.text_collected)
    }

    override fun abstractOnBindViewHolder(
        viewHolder: ViewHolder,
        item: ItemEntity?,
        position: Int
    ) {
        viewHolder.petName.text = item!!.name
        viewHolder.weekDay.text = item.weekDay.toString()
        if(item.collected){
            viewHolder.collected.setTextColor(Color.parseColor("#41AE19"))
            viewHolder.collected.text = "Coletado"
        }else {
            viewHolder.collected.setTextColor(Color.parseColor("#FF0000"))
            viewHolder.collected.text = "Não coletado"
        }

    }

}