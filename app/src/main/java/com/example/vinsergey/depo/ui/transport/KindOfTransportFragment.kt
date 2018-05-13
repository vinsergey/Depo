package com.example.vinsergey.depo.ui.transport

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.vinsergey.depo.R
import com.example.vinsergey.depo.ui.transport.trafficfragments.BusFragment
import com.example.vinsergey.depo.ui.transport.trafficfragments.TramFragment
import com.example.vinsergey.depo.ui.transport.trafficfragments.TrolleybusFragment

class KindOfTransportFragment : Fragment() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_kind_of_transport, container, false)

        tabLayout = view.findViewById(R.id.tabs)
        viewPager = view.findViewById(R.id.viewpager)
        val adapter = ViewPagerAdapter(this.fragmentManager!!)
        adapter.addFragment(TramFragment(), resources.getString(R.string.text_tram))
        adapter.addFragment(TrolleybusFragment(), resources.getString(R.string.text_trolleybus))
        adapter.addFragment(BusFragment(), resources.getString(R.string.text_bus))
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)

        return view
    }
}