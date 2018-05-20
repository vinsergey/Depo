package com.example.vinsergey.depo.manager.db

import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "route")
data class RouteEntity (
       @PrimaryKey
       var id : Long = 0
)