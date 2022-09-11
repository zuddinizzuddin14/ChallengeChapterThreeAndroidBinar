package com.example.challengechapter3.adapter

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.challengechapter3.R

class NavDetailAdapter(private val kata: Array<String>?)
    : RecyclerView.Adapter<NavDetailAdapter.NavDetailAdapterViewHolder>() {

    class NavDetailAdapterViewHolder(itemView: View)
        : RecyclerView.ViewHolder(itemView) {
        val btnItemHuruf = itemView.findViewById<Button>(R.id.btnItemHuruf)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NavDetailAdapterViewHolder {
        return NavDetailAdapterViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_huruf, parent, false)
        )
    }

    override fun onBindViewHolder(holder: NavDetailAdapterViewHolder, position: Int) {
        val kata = kata!![position]

        with(holder) {
            btnItemHuruf.text = kata

            btnItemHuruf.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://www.google.com/search?q=$kata")
                itemView.context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int = kata!!.size

}