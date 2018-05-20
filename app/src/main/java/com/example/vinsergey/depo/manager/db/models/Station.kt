package com.example.vinsergey.depo.manager.db.models

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.ForeignKey.CASCADE
import android.arch.persistence.room.PrimaryKey
import com.example.vinsergey.depo.manager.db.RouteEntity


@Entity(tableName = "station", foreignKeys = [(ForeignKey(entity = RouteEntity::class,
        parentColumns = [("route_id")],
        childColumns = [("route_id")],
        onDelete = CASCADE))])
data class Station (
        @PrimaryKey(autoGenerate = true)
        var id: Long = 0,
        @ColumnInfo(name = "station_name")
        var stationName: String? = null,
        @ColumnInfo(name = "route_id")
        var routeId: Long
)