package eu.tutorials.motivation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import eu.tutorials.motivation.R
import eu.tutorials.motivation.model.Motivation

class MotivationAdapter(private val dataSet: List<Motivation>) : RecyclerView.Adapter<MotivationViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MotivationViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MotivationViewHolder(view)
    }

    override fun onBindViewHolder(holder: MotivationViewHolder, position: Int) {
        holder.imageView.setImageResource(dataSet[position].picture)
        holder.textView.text = dataSet[position].message
    }

    override fun getItemCount() = dataSet.size
}

class MotivationViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val imageView: ImageView = view.findViewById(R.id.imageView)
    val textView: TextView = view.findViewById(R.id.textView)
}