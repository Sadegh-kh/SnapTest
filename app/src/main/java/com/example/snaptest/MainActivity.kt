package com.example.snaptest


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.snaptest.databinding.ActivityMainBinding
import com.example.snaptest.imageslider.ViewPagerAdapter

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val imagList=ArrayList<Int>()
        imagList.add(R.drawable.img_slider1)
        imagList.add(R.drawable.img_slider2)
        imagList.add(R.drawable.img_slider3)
        imagList.add(R.drawable.img_slider4)
        imagList.add(R.drawable.img_slider5)
        imagList.add(R.drawable.img_slider6)

//        binding.slider.imageSlider.setImageList(imagList,ScaleTypes.FIT)

        binding.viewPagerMain.adapter=ViewPagerAdapter(this,imagList)
    }
}