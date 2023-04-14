package com.clinton.noteapp.data

import android.os.Parcel
import android.os.Parcelable
import androidx.room.*
import kotlinx.coroutines.flow.Flow
import com.clinton.noteapp.model.NoteEntity as NoteEntity1

@Dao
interface NoteDao {
    @Query("select * from noteentity")
    fun getAllFlow(): Flow<List<NoteEntity1>>

    @Insert
    fun insert(note: NoteEntity1)

    @Update
    fun update(note: NoteEntity1)

    @Delete
    fun delete(note: NoteEntity1)

}


