package com.example.midterm_mobileprogramming

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListGoalAdapter(private val listGoal: ArrayList<Goal>) : RecyclerView.Adapter<ListGoalAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listGoal.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name) = listGoal[position]
        holder.tvName.text = name
    }

}