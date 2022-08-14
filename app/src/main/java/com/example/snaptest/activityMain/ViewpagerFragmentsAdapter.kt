package com.example.snaptest.activityMain

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


class ViewpagerFragmentsAdapter(fragmentActivity:FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{
                FragmentHome()
            }
            1->{
                FragmentClub()
            }
            2->{
                FragmentVoucher()
            }
            else->{
                Fragment()
            }
        }
    }
}