package com.example.vinsergey.depo

import android.app.Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        val one = Tram()
        one.name = "1"
        one.test = "test"
        one.test2 = "sdsdw"

        val two = Tram()
        two.name = "2"
        two.test = "testw"
        two.test2 = "sdsdwww"

        val list: ArrayList<Tram> = ArrayList()
        list.add(one)
        list.add(two)

        //todo save tram to bd (list)
    }

    class Tram {
        var name = ""
        var test = ""
        var test2 = ""
    }
}