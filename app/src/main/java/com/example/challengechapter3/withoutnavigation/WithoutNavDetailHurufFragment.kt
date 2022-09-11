package com.example.challengechapter3.withoutnavigation

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.challengechapter3.R
import com.example.challengechapter3.adapter.KataAdapter
import com.example.challengechapter3.adapter.MyDetailAdapter
import com.example.challengechapter3.data.Communicator

class WithoutNavDetailHurufFragment :
    Fragment() {

    private lateinit var adapter: MyDetailAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_without_nav_huruf, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val kata = arguments?.getStringArray("kata")

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rvItemHurufFragment)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = MyDetailAdapter(kata) {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.google.com/search?q=$it")
            startActivity(intent)
        }
    }
}