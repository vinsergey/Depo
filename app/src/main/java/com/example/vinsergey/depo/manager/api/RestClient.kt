package com.example.vinsergey.depo.manager.api

import android.util.Log
import com.google.firebase.database.*

class RestClient {
    lateinit var g: List<String>
    private val mDataBase: DatabaseReference = FirebaseDatabase.getInstance().reference
    internal var listener: ValueEventListener = object : ValueEventListener {
        override fun onDataChange(dataSnapshot: DataSnapshot) {
            val t: GenericTypeIndicator<List<String>> = GenericTypeIndicator()
            g = dataSnapshot.child("routes").getValue(t)!!
            Log.d("MyLog", g.toString())
        }

        override fun onCancelled(databaseError: DatabaseError) {

        }
    }
}