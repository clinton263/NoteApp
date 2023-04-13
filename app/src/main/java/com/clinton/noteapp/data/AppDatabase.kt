package com.clinton.noteapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.clinton.noteapp.model.NoteEntity

@Database(entities = [NoteEntity::class], version = 2)

abstract class AppDatabase : RoomDatabase(){
    abstract fun noteDao():NoteDao

    companion object{
        private var instance:AppDatabase? = null
        fun getInstance(context: Context): AppDatabase {
            if (instance == null)
                instance = Room.databaseBuilder(context, AppDatabase::class.java, name = "notedb")
                    .fallbackToDestructiveMigration()
                    .build()


        }

    }
}

