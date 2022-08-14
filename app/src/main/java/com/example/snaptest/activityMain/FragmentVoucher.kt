package com.example.snaptest.activityMain

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.snaptest.databinding.FragmentVoucherBinding

class FragmentVoucher:Fragment() {
    lateinit var binding: FragmentVoucherBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentVoucherBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
}