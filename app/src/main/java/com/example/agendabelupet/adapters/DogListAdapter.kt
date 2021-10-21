package com.example.agendabelupet.adapters

import android.app.Activity
import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.agendabelupet.R
import com.example.agendabelupet.models.entities.ItemEntity
import com.google.type.DateTime
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
        viewHolder.petDistrict.text = "Bairro : ${item.district}"
        viewHolder.petHouseNumber.text = "Nº ${item.houseNumber}"
        val c = Calendar.getInstance()
        val weekDay = c.get(Calendar.DAY_OF_WEEK)
        val dataNow = sdf.format(Date())
        if (item.dataQuinzenal == "") {
            if ((item.weekDay == "Segunda" && weekDay == Calendar.MONDAY) ||
                (item.weekDay == "Terça" && weekDay == Calendar.TUESDAY) ||
                (item.weekDay == "Quarta" && weekDay == Calendar.WEDNESDAY) ||
                (item.weekDay == "Quinta" && weekDay == Calendar.THURSDAY) ||
                (item.weekDay == "Sexta" && weekDay == Calendar.FRIDAY) ||
                (item.weekDay == "Sábado" && weekDay == Calendar.SATURDAY)
            ) {
                viewHolder.nextDay.setTextColor(ContextCompat.getColor(context, R.color.green))
                viewHolder.nextDay.text = "Próxima coleta : Hoje"
            } else {
                viewHolder.nextDay.setTextColor(ContextCompat.getColor(context, R.color.purple_500))
                viewHolder.nextDay.text = "Semanal"
            }
        } else {

            if (dataNow == item.dataQuinzenal) {
                viewHolder.nextDay.setTextColor(ContextCompat.getColor(context, R.color.green))
                viewHolder.nextDay.text = "Próxima coleta : Hoje"
            } else {
                viewHolder.nextDay.setTextColor(ContextCompat.getColor(context, R.color.purple_500))
                viewHolder.nextDay.text = "Póxima coleta : ${item.dataQuinzenal}"
            }
        }
    }
}