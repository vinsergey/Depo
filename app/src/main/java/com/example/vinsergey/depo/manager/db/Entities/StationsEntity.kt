package com.example.vinsergey.depo.manager.db.Entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.ForeignKey.CASCADE
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "stations", foreignKeys = [ForeignKey(entity = RouteEntity::class,
        parentColumns = ["station_name"],
        childColumns = ["station_name"],
        onDelete = CASCADE)])
data class StationsEntity(
        @PrimaryKey
        @ColumnInfo(name = "station_name")
        var stationName: String = "",
        @ColumnInfo(name = "course")
        var course: String = "",
        @ColumnInfo(name = "stop_id")
        var stopId: String = ""
)