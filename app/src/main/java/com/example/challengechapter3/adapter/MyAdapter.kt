package com.example.challengechapter3.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.challengechapter3.data.Communicator
import com.example.challengechapter3.R
import com.example.challengechapter3.data.Huruf

class MyAdapter(
    private val hurufList: List<Huruf>,
    private val listener: Communicator) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(
        itemView: View
        ) :
        RecyclerView.ViewHolder(itemView) {
        val btnItemHuruf = itemView.findViewById<Button>(R.id.btnItemHuruf)

        fun bindView(huruf: Huruf) {
            btnItemHuruf.text = huruf.isiHuruf.toString()

            btnItemHuruf.setOnClickListener {
                val position = bindingAdapterPosition
                val detailKata = hurufList[position].detailKata
                listener.passData(detailKata)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_huruf, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindView(hurufList[position])
    }

    override fun getItemCount(): Int = hurufList.size
}