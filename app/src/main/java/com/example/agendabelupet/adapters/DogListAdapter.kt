package com.example.agendabelupet.adapters

import android.app.Activity
import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.agendabelupet.R
import com.example.agendabelupet.models.entities.ItemEntity
import org.w3c.dom.Text
import java.text.SimpleDateFormat
import java.util.*


class DogListAdapter(
   private val  context: Context,
    activity: Activity,
    itensList: MutableList<ItemEntity>? = mutableListOf(),
    onItemClickListener: AbstractRecyclerAdapter.onClickListener<ItemEntity>
) : AbstractRecyclerAdapter<ItemEntity, DogListAdapter.ViewHolder>(
    activity,
    R.layout.fragment_item_information
) {

    val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())

    init {
        if (itensList != null) {
            itens = itensList
        }
        this.onClick = onItemClickListener

    }

    override fun getViewHolder(view: View): DogListAdapter.ViewHolder {
        return ViewHolder(view)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val petName: TextView = itemView.findViewById(R.id.card_pet_name)
        val petRace: TextView = itemView.findViewById(R.id.card_raca)
        val petStreet: TextView = itemView.findViewById(R.id.pet_street)
        val petDistrict: TextView = itemView.findViewById(R.id.pet_district)
        val petHouseNumber: TextView = itemView.findViewById(R.id.text_house_number_card)
        val nextDay : TextView = itemView.findViewById(R.id.proximo_dia)
    }

    override fun abstractOnBindViewHolder(
        viewHolder: ViewHolder,
        item: ItemEntity?,
        position: Int
    ) {
        viewHolder.petStreet.text =  "Rua: ${item!!.street}"
        viewHolder.petName.text = item.name
        viewHolder.petRace.text = "Raça :${item.race}"
        viewHolder.petDistrict.text = "Bairro : ${item.district}"
        viewHolder.petHouseNumber.text = "Nº ${item.houseNumber}"
        if(item.dataQuinzenal != ""){
            val c = Calendar.getInstance()
            c.time = sdf.parse(item.dataQuinzenal)
             c.add(Calendar.DATE, 14)
            val data = Date(c.timeInMillis)
            if(data.time.equals(Calendar.getInstance().time) && data.month == Calendar.MONTH){
                viewHolder.nextDay.setTextColor(ContextCompat.getColor(context, R.color.green))
                viewHolder.nextDay.text = "Póxima coleta : Hoje"
                notifyDataSetChanged()
            }
//
            viewHolder.nextDay.text = "Póxima coleta :${sdf.format(data)}"
        }else {
            viewHolder.nextDay.setTextColor(ContextCompat.getColor(context, R.color.green))
            viewHolder.nextDay.text = "Póxima coleta : Hoje"
        }
    }

}