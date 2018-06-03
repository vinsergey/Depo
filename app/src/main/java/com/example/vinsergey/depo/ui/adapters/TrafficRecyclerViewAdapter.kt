package com.example.vinsergey.depo.ui.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.vinsergey.depo.ui.models.RouteModel
import java.util.*

class TrafficRecyclerViewAdapter : RecyclerView.Adapter<TrafficRecyclerViewAdapter.ViewHolder>() {

    private var data: List<RouteModel> = Collections.emptyList()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.numberRoute.text = data[position].numberRoute
        holder.startRoute.text = data[position].startRoute
        holder.endRoute.text = data[position].endRoute
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.traffic_recycler_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun setData(data: List<RouteModel>) {
        this.data = data
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val numberRoute: TextView = itemView.findViewById(R.id.number_route)
        val startRoute: TextView = itemView.findViewById(R.id.start_route)
        val endRoute: TextView = itemView.findViewById(R.id.end_route)
    }
}