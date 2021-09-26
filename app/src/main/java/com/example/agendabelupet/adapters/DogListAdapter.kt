package com.example.agendabelupet.adapters

import android.app.Activity
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.agendabelupet.R
import com.example.agendabelupet.models.entities.ItemEntity


class DogListAdapter(
    activity: Activity,
    itensList: MutableList<ItemEntity>? = mutableListOf(),
    onItemClickListener: AbstractRecyclerAdapter.onClickListener<ItemEntity>
) : AbstractRecyclerAdapter<ItemEntity, DogListAdapter.ViewHolder>(
    activity,
    R.layout.fragment_item_information
) {

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
        viewHolder.petHouseNumber.text = "Nº ${item.houseNumer}"
    }

}