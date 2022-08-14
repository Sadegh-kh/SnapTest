package com.example.snaptest.activityMain

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.snaptest.databinding.FragmentClubBinding

class FragmentClub:Fragment() {
    lateinit var binding: FragmentClubBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentClubBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
}