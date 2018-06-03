package com.example.vinsergey.depo.manager.db

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.example.vinsergey.depo.manager.db.Entities.RouteEntity
import com.example.vinsergey.depo.manager.db.Entities.StationsEntity
import com.example.vinsergey.depo.manager.db.Entities.TimesEntity

@Dao
interface RouteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(route: List<RouteEntity>)

    @Query("SELECT number, first_station, last_station FROM route WHERE type = :type")
    fun getNumberRoute(type: String): List<RouteEntity>

    @Query("SELECT station_name FROM stations WHERE station_name = :stationName AND course = :course")
    fun getAllStations(stationName: String, course: String): List<StationsEntity>

    @Query("SELECT time FROM times WHERE stop_id = :stopId")
    fun getAllTimes(stopId: String): List<TimesEntity>
}