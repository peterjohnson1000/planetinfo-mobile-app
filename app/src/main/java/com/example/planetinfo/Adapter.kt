package com.example.planetinfo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*

class Adapter(var planet:List<PlanetData>): RecyclerView.Adapter<Adapter.myViewHolder>() {
    class myViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title = view.title
        var planetimg = view.planet_img
        var galaxy = view.galaxy
        var distance = view.distance
        var gravity = view.gravity

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.view,parent,false)
        return myViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return planet.size
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        holder.title.text = planet[position].title
        holder.galaxy.text = planet[position].galaxy
        holder.distance.text = planet[position].distance + " m km"
        holder.gravity.text = planet[position].gravity + " m/s"
    }
}
