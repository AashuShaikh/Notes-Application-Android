package com.aashushaikh.notetakingapp

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aashushaikh.notetakingapp.repository.NoteRepository

@Suppress("UNCHECKED_CAST")
class NoteViewModelFactory(val application: Application, private val noteRepository: NoteRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(NoteViewModel::class.java)){
            return NoteViewModel(application, noteRepository) as T
        }
        throw IllegalArgumentException("Unknow ViewModel class")
    }
}