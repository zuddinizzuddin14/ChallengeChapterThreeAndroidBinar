package com.example.challengechapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hurufList = listOf<Huruf>(
            Huruf('A', arrayOf("Anak", "Ayam", "Angkasa")),
            Huruf('B', arrayOf("Benar", "Bersih", "Baju", "Binatang")),
            Huruf('C', arrayOf("Cinta", "Cilok", "Ciputat", "Celana")),
            Huruf('D', arrayOf("Daun", "Drakor", "Dilema")),
            Huruf('E', arrayOf("Ebi", "Elang", "Entah")),
            Huruf('F', arrayOf("Formula 1", "Fanta", "Figuran")),
            Huruf('G', arrayOf("Gempa", "Gagasan", "Gamelan")),
            Huruf('H', arrayOf("Hantu", "Hapus", "Hutang")),
            Huruf('I', arrayOf("Ikan", "Ilmu", "Indah", "Ijazah"))
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rvItemHuruf)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = HurufAdapter(this, hurufList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }

}
