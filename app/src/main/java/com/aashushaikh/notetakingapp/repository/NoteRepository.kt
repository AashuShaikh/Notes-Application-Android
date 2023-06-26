package com.aashushaikh.notetakingapp.repository

import com.aashushaikh.notetakingapp.database.NoteDatabase
import com.aashushaikh.notetakingapp.model.Note

class NoteRepository(private val db: NoteDatabase) {
    private val dao = db.getNoteDao()

    suspend fun insertNote(note: Note) = dao.insertNote(note)

    suspend fun deleteNote(note: Note) = dao.deleteNote(note)

    suspend fun updateNote(note: Note) = dao.updateNote(note)

    fun getAllNotes() = dao.getAllNotes()

    fun searchNote(query: String?) = dao.searchNote(query)
}