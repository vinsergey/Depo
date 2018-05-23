package com.example.vinsergey.depo.manager.db.Entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "route")
data class RouteEntity(
        @PrimaryKey
        @ColumnInfo(name = "number")
        var number: String = "",
        @ColumnInfo(name = "type")
        var type: String = "",
        @ColumnInfo(name = "f_l_station")
        var first_last_station: String = "",
        @ColumnInfo(name = "station_name")
        var station_name: String = ""
)