package com.example.agendabelupet.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.example.agendabelupet.models.entities.WeekDaysModel

abstract class AbstractRecyclerAdapter<T, K : RecyclerView.ViewHolder>(
    private val context: Context,
    @LayoutRes private var layout: Int? = null,
    var onClick: onClickListener<T>? = null
) : RecyclerView.Adapter<K>() {

    var itens = mutableListOf<T>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    abstract fun getViewHolder(view: View): K

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): K {
        val context = parent.context
        val infalter = LayoutInflater.from(context)
        val contactView = infalter.inflate(layout!!, parent, false)
        return getViewHolder(contactView)
    }

    abstract fun abstractOnBindViewHolder(viewHoleder: K, item: T?, position: Int)
    override fun onBindViewHolder(holder: K, position: Int) {
        val item = itens[position]
        abstractOnBindViewHolder(holder, item, position)
        holder.itemView.setOnClickListener {
            onClick?.onItemCLickListener(
                holder.itemView,
                item,
                position
            )
        }
    }

    override fun getItemCount(): Int {
        return itens.size
    }

    interface onClickListener<T> {
    fun onItemCLickListener(view: View?, item: T, position: Int)
}
}