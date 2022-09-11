package com.example.challengechapter3.withnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.challengechapter3.R
import com.example.challengechapter3.adapter.NavAdapter
import com.example.challengechapter3.adapter.NavDetailAdapter
import com.example.challengechapter3.databinding.FragmentWithNavDetailHurufBinding

class WithNavDetailHurufFragment : Fragment() {

    private var _binding : FragmentWithNavDetailHurufBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWithNavDetailHurufBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val kata = arguments?.getStringArray("kata")

        val adapter = NavDetailAdapter(kata)

        binding.rvNavItemKata.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvNavItemKata.adapter = adapter
    }
}