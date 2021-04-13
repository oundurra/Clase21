package com.example.clase21

import android.app.Application
import androidx.room.Room

class MyTaskApp:Application() {
    companion object {
        lateinit var database: TasksDatabase
    }

    override fun onCreate() {
        super.onCreate()
        MyTaskApp.database =  Room.databaseBuilder(this, TasksDatabase::class.java, "tasks-db").build()
    }
}