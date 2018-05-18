package com.example.vinsergey.depo.manager.db.models

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "routes")
data class RouteEntity (
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name="route_id")
        var id: Long = 0,
        @ColumnInfo(name = "route_number")
        var number: Int? = null,
        @ColumnInfo(name = "type")
        var type: String? = null
)