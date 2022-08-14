package com.example.snaptest.activityMain

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.snaptest.R
import com.example.snaptest.databinding.FragmentHomeBinding
import com.example.snaptest.imageslider.ViewPagerImageSliderAdapter

class FragmentHome:Fragment() {
    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentHomeBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val imageList= arrayListOf<Int>(
            R.drawable.img_slider1,
            R.drawable.img_slider2,
            R.drawable.img_slider3,
            R.drawable.img_slider4,
            R.drawable.img_slider5,
            R.drawable.img_slider6,
        )
        binding.viewPagerImageSlider.adapter=ViewPagerImageSliderAdapter(requireContext(),imageList)
    }
}