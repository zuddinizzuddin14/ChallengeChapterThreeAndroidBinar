//package com.example.challengechapter3
//
//import android.content.Intent
//import android.net.Uri
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import com.example.challengechapter3.adapter.KataAdapter
//import com.example.challengechapter3.data.Huruf
//
//class DetailActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_detail)
//
//        val kata = intent.getParcelableExtra<Huruf>(MainActivity.INTENT_PARCELABLE)
//
//        val recyclerView = findViewById<RecyclerView>(R.id.rvItemHuruf)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.setHasFixedSize(true)
//        recyclerView.adapter = KataAdapter(this, kata) {
//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.data = Uri.parse("https://www.google.com/search?q=$it")
//            startActivity(intent)
//        }
//    }
//}