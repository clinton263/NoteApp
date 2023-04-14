package com.clinton.noteapp.data.repository

import android.provider.ContactsContract.CommonDataKinds.Note
import com.clinton.noteapp.data.NoteDao
import com.clinton.noteapp.model.NoteEntity
import kotlinx.coroutines.flow.Flow

class NoteRepository (
    private val noteDao: NoteDao
        ){
    fun getAllFlow(): Flow<List<NoteEntity>> {
        return noteDao.getAllFlow()
        fun insert (note: NoteEntity) =noteDao.insert(note = note)
        fun update(note: NoteEntity) =noteDao.update(note = note)
        fun delete (note : NoteEntity) =noteDao.delete(note = note)

    }



}