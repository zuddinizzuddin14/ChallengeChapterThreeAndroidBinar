package com.example.challengechapter3.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.challengechapter3.R
import com.example.challengechapter3.data.Huruf

class HurufAdapter(
    private val context: Context,
    private val huruf: List<Huruf>,
    val listener: (Huruf) -> Unit
) : RecyclerView.Adapter<HurufAdapter.HurufViewHolder>() {
    class HurufViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val btnItemHuruf = view.findViewById<Button>(R.id.btnItemHuruf)

        fun bindView(huruf: Huruf, listener: (Huruf) -> Unit) {
            btnItemHuruf.text = huruf.isiHuruf.toString()
            btnItemHuruf.setOnClickListener {
                listener(huruf)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HurufViewHolder {
        return HurufViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_huruf, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HurufViewHolder, position: Int) {
        holder.bindView(huruf[position], listener)
    }

    override fun getItemCount(): Int = huruf.size

}