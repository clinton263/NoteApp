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
@HiltViewModel
class  HomeViewModel
constructor(
    private  val noteRepository: NoteRepository,
): ViewModel(), HomeViewModelAbstract{
    override  val noteListFlow:Flow<List<NoteEntity>> = noteRepository.getAllFlow()

     override fun addNote(note: NoteEntity) = noteRepository.insert(note =note)

    override fun updateNote(note: NoteEntity) = noteRepository.update(note =note)

    override fun deleteNote(note: NoteEntity) = noteRepository.delete(note =note)




}
