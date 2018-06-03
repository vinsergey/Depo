package com.example.vinsergey.depo.manager.db.Entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.ForeignKey.CASCADE
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "stations", foreignKeys = [ForeignKey(entity = RouteEntity::class,
        parentColumns = ["stationId"],
        childColumns = ["stationId"],
        onDelete = CASCADE)])
data class StationsEntity(
        @PrimaryKey
        @ColumnInfo(name = "station_id")
        var stationId: Int = 0,
        @ColumnInfo(name = "station_name")
        var stationName: String = "",
        @ColumnInfo(name = "course")
        var course: String = "",
        @ColumnInfo(name = "stop_id")
        var stopId: String = ""
)