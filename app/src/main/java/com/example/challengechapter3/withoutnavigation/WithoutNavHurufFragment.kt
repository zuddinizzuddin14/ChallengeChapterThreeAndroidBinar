package com.example.challengechapter3.withoutnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.challengechapter3.data.Communicator
import com.example.challengechapter3.adapter.MyAdapter
import com.example.challengechapter3.R
import com.example.challengechapter3.data.Huruf

class WithoutNavHurufFragment :
    Fragment(),
    Communicator {

    private lateinit var adapter: MyAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_without_nav_huruf, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rvItemHurufFragment)
        recyclerView.layoutManager = layoutManager
        adapter = MyAdapter(hurufList, this@WithoutNavHurufFragment)
        recyclerView.adapter = adapter
    }

    override fun passData(kata: Array<String>) {
        val bundle = Bundle()
        bundle.putStringArray("kata", kata)

        val transaction = this.parentFragmentManager.beginTransaction()
        val nextFragment = WithoutNavDetailHurufFragment()

        nextFragment.arguments = bundle

        transaction.replace(R.id.containerFragment, nextFragment)
            .addToBackStack(null)
            .commit()
    }
}