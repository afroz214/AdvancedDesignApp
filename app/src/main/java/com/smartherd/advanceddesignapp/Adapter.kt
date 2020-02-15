package com.smartherd.advanceddesignapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter (data:ArrayList<Custom_class>, var context:Context) : RecyclerView.Adapter<Adapter.ViewHolder> (){

    var data:List<Custom_class>

    init {
        this.data = data
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var title: TextView
        var image: ImageView

        init {
            title = itemView.findViewById(R.id.text_item)
            image = itemView.findViewById(R.id.image_item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layout = LayoutInflater.from(context).inflate(R.layout.item_custom, parent, false)
        return ViewHolder(layout)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.title.text = data[position].title
        holder.image.setImageResource(data[position].image)
    }
}