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
import java.util.concurrent.TimeUnit


class DogListAdapter(
    private val context: Context,
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
        val nextDay: TextView = itemView.findViewById(R.id.proximo_dia)
    }

    override fun abstractOnBindViewHolder(
        viewHolder: ViewHolder,
        item: ItemEntity?,
        position: Int
    ) {
        viewHolder.petStreet.text = "Rua: ${item!!.street}"
        viewHolder.petName.text = item.name
        viewHolder.petRace.text = "Raça :${item.race}"
        viewHolder.petDistrict.text = "Bairro : ${item.district}"
        viewHolder.petHouseNumber.text = "Nº ${item.houseNumber}"
        val c = Calendar.getInstance()
        if (item.dataQuinzenal != "") {
            val diaTeste = sdf.parse(item.dataQuinzenal)
            val diff = System.currentTimeMillis() - diaTeste.time
            val diffDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)
            when {
                diffDays.toInt() in 0..1 -> {
                    viewHolder.nextDay.setTextColor(ContextCompat.getColor(context, R.color.green))
                    viewHolder.nextDay.text = "Póximo coleta: hoje}"
                }
                diffDays.toInt() < 14 -> {
                    val data = Date(diaTeste.time)
                    viewHolder.nextDay.setTextColor(ContextCompat.getColor(context, R.color.purple_500))
                    viewHolder.nextDay.text = "Póximo dia :${sdf.format(data)}"
                }
                else -> {
                    c.add(Calendar.DATE, 14)
                    val data = Date(c.timeInMillis)
                    viewHolder.nextDay.setTextColor(ContextCompat.getColor(context, R.color.purple_500))
                    viewHolder.nextDay.text = "Póximo dia :${sdf.format(data)}"
                }
            }
        } else {
            val weekDay = c.get(Calendar.DAY_OF_WEEK)
            if ((item.weekDay == "Segunda" && weekDay == Calendar.MONDAY) ||
                (item.weekDay == "Terça" && weekDay == Calendar.TUESDAY) ||
                (item.weekDay == "Quarta" && weekDay == Calendar.THURSDAY) ||
                (item.weekDay == "Quinta" && weekDay == Calendar.WEDNESDAY) ||
                (item.weekDay == "Sexta" && weekDay == Calendar.FRIDAY) ||
                (item.weekDay == "Sábado" && weekDay == Calendar.SATURDAY)
            ) {
                viewHolder.nextDay.setTextColor(ContextCompat.getColor(context, R.color.green))
                viewHolder.nextDay.text = "Póxima coleta : Hoje"
            } else {
                viewHolder.nextDay.setTextColor(ContextCompat.getColor(context, R.color.purple_500))
                viewHolder.nextDay.text = "Semanal"
            }

        }
    }

}