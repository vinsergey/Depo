package com.example.vinsergey.depo.ui.transport

import android.os.Bundle
import android.support.design.widget.AppBarLayout
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.vinsergey.depo.R

class KindOfTransportFragment : Fragment() {

    private lateinit var tabLayout: TabLayout
    private lateinit var appBarLayout: AppBarLayout
    private lateinit var viewPager: ViewPager

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_kind_of_transport, container, false)

        tabLayout.findViewById<TabLayout>(R.id.tabs)
        viewPager.findViewById<ViewPager>(R.id.viewpager)
        val adapter = ViewPagerAdapter(this.fragmentManager!!)
        adapter.addFragment(TramFragment, "Трамвай")
        adapter.addFragment(TrolleybusFragment, "Тролейбус")
        adapter.addFragment(BusFragment, "Автобус")

        return view
    }
}