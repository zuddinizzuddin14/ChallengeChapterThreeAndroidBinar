package com.example.challengechapter3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class KataAdapter(
    private val context: Context,
    private val kata: Huruf?,
    val listener: (String) -> Unit
) : RecyclerView.Adapter<KataAdapter.KataViewHolder>() {

    class KataViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val btnItemHuruf = view.findViewById<Button>(R.id.btnItemHuruf)

        fun bindView(kata: String, listener: (String) -> Unit) {
            btnItemHuruf.text = kata
            btnItemHuruf.setOnClickListener {
                listener(kata)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KataViewHolder {
        return KataViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_huruf, parent, false)
        )
    }

    override fun onBindViewHolder(holder: KataViewHolder, position: Int) {
        holder.bindView(kata!!.detailKata[position], listener)
    }

    override fun getItemCount(): Int = kata!!.detailKata.size
}