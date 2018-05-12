package com.example.vinsergey.depo.ui.transport

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {


    private val fragmentList: List<Fragment> = ArrayList()
    private val fragmentListTitles: List<String> = ArrayList()

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentListTitles.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentListTitles[position]
    }

    fun addFragment(fragment: Fragment, title: String) {
        fragmentList + fragment
        fragmentListTitles + title
    }
}