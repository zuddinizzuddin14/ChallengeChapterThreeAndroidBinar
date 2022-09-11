package com.example.challengechapter3.adapter

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.challengechapter3.R
import com.example.challengechapter3.data.Huruf

class MyDetailAdapter(
    private val kataList: Array<String>?,
    val listener: (String) -> Unit) :
    RecyclerView.Adapter<MyDetailAdapter.MyDetailViewHolder>() {

    class MyDetailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val btnItemHuruf = itemView.findViewById<Button>(R.id.btnItemHuruf)

        fun bindView(kata: String, listener: (String) -> Unit) {
            btnItemHuruf.text = kata

            btnItemHuruf.setOnClickListener {
                listener(kata)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyDetailViewHolder {
        return MyDetailViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_huruf, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyDetailViewHolder, position: Int) {
        holder.bindView(kataList!![position], listener)
    }

    override fun getItemCount(): Int = kataList!!.size
}