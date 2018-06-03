package com.example.vinsergey.depo.manager.db.Entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.ForeignKey.CASCADE
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "times", foreignKeys = [ForeignKey(entity = StationsEntity::class,
        parentColumns = ["stopId"],
        childColumns = ["stopId"],
        onDelete = CASCADE)])
data class TimesEntity(
        @PrimaryKey
        @ColumnInfo(name = "stop_id")
        var stopId: String = "",
        @ColumnInfo(name = "time")
        var time: String = ""
)