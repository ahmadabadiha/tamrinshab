package com.example.tamrinshab.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.tamrinshab.R
import com.example.tamrinshab.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment(): Fragment(R.layout.fragment_home) {
    private var _binding: FragmentHomeBinding? = null
    private  val binding get() = _binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHomeBinding.bind(view)
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}