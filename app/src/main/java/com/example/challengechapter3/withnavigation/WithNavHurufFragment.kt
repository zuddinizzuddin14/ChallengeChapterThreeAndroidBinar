package com.example.challengechapter3.withnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.challengechapter3.MainActivity
import com.example.challengechapter3.R
import com.example.challengechapter3.adapter.NavAdapter
import com.example.challengechapter3.data.Huruf
import com.example.challengechapter3.databinding.FragmentWithNavHurufBinding

class WithNavHurufFragment : Fragment() {

    private var _binding : FragmentWithNavHurufBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWithNavHurufBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val hurufList = MainActivity().data

        val adapter = NavAdapter(hurufList)

        binding.rvNavItemHuruf.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvNavItemHuruf.adapter = adapter
    }
}