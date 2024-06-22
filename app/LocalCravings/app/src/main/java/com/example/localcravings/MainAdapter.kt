package com.example.localcravings

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(val restaurants: List<Restaurant>, val selectionHandler: (Restaurant) -> Unit) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val restaurantHour: TextView
        val restaurantPic: ImageView
        val restaurantName: TextView

        init {
            restaurantHour = view.findViewById(R.id.restaurantHours)
            restaurantPic = view.findViewById(R.id.restaurantImage)
            restaurantName = view.findViewById(R.id.restaurantName)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.restaurant_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: MainAdapter.ViewHolder, position: Int) {
        val place: Restaurant = restaurants.get(position)
        holder.itemView.setOnClickListener{
            selectionHandler(place)
        }
    }

    override fun getItemCount(): Int = restaurants.size
}