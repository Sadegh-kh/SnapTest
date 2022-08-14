package com.example.snaptest.activityMain


import android.os.Bundle
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.MotionEventCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.snaptest.R
import com.example.snaptest.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initUi()

    }

    private fun initUi() {
        initActionBar()

    }

    private fun initActionBar() {
        binding.viewPagerActivityMain.adapter=ViewpagerFragmentsAdapter(this)
        binding.viewPagerActivityMain.offscreenPageLimit=1
        binding.viewPagerActivityMain.isUserInputEnabled=false

        val tapMediator= TabLayoutMediator(binding.tabActivityMain,
            binding.viewPagerActivityMain,
            object : TabLayoutMediator.TabConfigurationStrategy{
                override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
                    when(position){

                        0->{tab.text="خانه"
                            tab.icon=getDrawable(R.drawable.ic_green_home)}

                        1->{tab.text="۱۰۲۸۰ امتیاز"
                            tab.icon=getDrawable(R.drawable.ic_club)}

                        2->{tab.text="تخفیف‌ها"
                            tab.icon=getDrawable(R.drawable.ic_green_voucher)
                        }
                    }

                }
            })
        tapMediator.attach()

    }
}

