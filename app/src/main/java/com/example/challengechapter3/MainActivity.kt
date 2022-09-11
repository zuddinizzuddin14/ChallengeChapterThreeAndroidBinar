package com.example.challengechapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.challengechapter3.data.Huruf
import com.example.challengechapter3.withoutnavigation.WithoutNavDetailHurufFragment
import com.example.challengechapter3.withoutnavigation.WithoutNavHurufFragment

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    val data = listOf<Huruf>(
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.navContainer) as NavHostFragment

        navController = navHostFragment.navController
        setupActionBarWithNavController(navController)
    }
}
