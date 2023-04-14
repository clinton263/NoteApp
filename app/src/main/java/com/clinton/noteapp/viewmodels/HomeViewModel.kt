package com.clinton.noteapp.viewmodels

import android.os.Parcel
import android.os.Parcelable
import androidx.lifecycle.ViewModel
import com.clinton.noteapp.data.repository.NoteRepository
import com.clinton.noteapp.model.NoteEntity
import kotlinx.coroutines.flow.Flow

interface  HomeViewModel{
      val noteListFlow: Flow<List<NoteEntity>>
      fun addNote(note: NoteEntity)
      fun updateNote(note: NoteEntity)
      fun deleteNote(note: NoteEntity)
  }

class  HomeViewModel
constructor(
    private  val noteRepository: NoteRepository
): ViewModel(),
