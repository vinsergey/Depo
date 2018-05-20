package com.example.vinsergey.depo.ui.fragments.transport

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.vinsergey.depo.R
import com.example.vinsergey.depo.databinding.FragmentKindOfTransportBinding
import com.example.vinsergey.depo.ui.adapters.ViewPagerAdapter
import com.example.vinsergey.depo.ui.fragments.transport.trafficfragments.BusFragment
import com.example.vinsergey.depo.ui.fragments.transport.trafficfragments.TramFragment
import com.example.vinsergey.depo.ui.fragments.transport.trafficfragments.TrolleybusFragment

class KindOfTransportFragment : Fragment() {

    private lateinit var binding: FragmentKindOfTransportBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_kind_of_transport, container, false)

        val adapter = ViewPagerAdapter(this.fragmentManager!!)
        adapter.addFragment(TramFragment(), resources.getString(R.string.text_tram))
        adapter.addFragment(TrolleybusFragment(), resources.getString(R.string.text_trolleybus))
        adapter.addFragment(BusFragment(), resources.getString(R.string.text_bus))
        binding.viewpager.adapter = adapter
        binding.tabs.setupWithViewPager(binding.viewpager)

        return binding.root
    }
}