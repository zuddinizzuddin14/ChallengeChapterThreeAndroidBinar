package com.example.challengechapter3.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.challengechapter3.R
import com.example.challengechapter3.data.Huruf

class NavAdapter(
    private val hurufList: List<Huruf>) :
    RecyclerView.Adapter<NavAdapter.NavAdapterViewHolder>() {

    class NavAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val btnItemHuruf = itemView.findViewById<Button>(R.id.btnItemHuruf)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NavAdapterViewHolder {
        return NavAdapterViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_huruf, parent, false)
        )
    }

    override fun onBindViewHolder(holder: NavAdapterViewHolder, position: Int) {
        val huruf = hurufList[position]

        val mBundle = Bundle()
        mBundle.putStringArray("kata", huruf.detailKata)

        with(holder) {
            btnItemHuruf.text = huruf.isiHuruf.toString()
            btnItemHuruf.setOnClickListener {
                itemView.findNavController().navigate(R.id.action_withNavHurufFragment_to_withNavDetailHurufFragment, mBundle)
            }
        }

    }

    override fun getItemCount(): Int = hurufList.size
}