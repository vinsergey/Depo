package com.example.vinsergey.depo.manager.db.Entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "route")
data class RouteEntity(
        @PrimaryKey
        @ColumnInfo(name = "route_id")
        var routeId: Int = 0,
        @ColumnInfo(name = "number")
        var number: String = "",
        @ColumnInfo(name = "type")
        var type: String = "",
        @ColumnInfo(name = "first_station")
        var firstStation: String = "",
        @ColumnInfo(name = "last_station")
        var lastStation: String = "",
        @ColumnInfo(name = "station_id")
        var stationId: String = ""
)