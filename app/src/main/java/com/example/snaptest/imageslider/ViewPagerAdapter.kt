package com.example.snaptest.imageslider

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager.widget.PagerAdapter
import com.example.snaptest.R
import java.util.*
import kotlin.collections.ArrayList

class ViewPagerAdapter(private val context: Context , private val imageList: ArrayList<Int>):PagerAdapter() {
    override fun getCount(): Int {
        return imageList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object` as ConstraintLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val mainLayoutInflater=context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val itemView=mainLayoutInflater.inflate(R.layout.item_image_slider,container,false)

        val imageView= itemView.findViewById<ImageView>(R.id.imageSlider)

        imageView.setImageResource(imageList[position])

        Objects.requireNonNull(container).addView(itemView)

        return itemView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as ConstraintLayout)
    }
}