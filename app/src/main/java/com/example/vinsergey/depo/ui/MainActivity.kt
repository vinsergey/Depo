package com.example.vinsergey.depo.ui

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.vinsergey.depo.R
import com.example.vinsergey.depo.databinding.ActivityMainBinding
import com.example.vinsergey.depo.ui.fragments.transport.KindOfTransportFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_activity_container, KindOfTransportFragment())
                .commit()
    }
}
