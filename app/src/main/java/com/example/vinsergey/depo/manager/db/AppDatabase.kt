package com.example.vinsergey.depo.manager.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context

@Database(entities = [RouteEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun routeDao() : RouteDao

    companion object {
        var INSTANCE : AppDatabase? = null
        fun getInstance(context : Context) : AppDatabase? {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class) {
                    INSTANCE = Room
                            .databaseBuilder(context.applicationContext,
                                    AppDatabase::class.java, "route.db")
                            .build()
                }
            }
            return INSTANCE
        }
    }
}