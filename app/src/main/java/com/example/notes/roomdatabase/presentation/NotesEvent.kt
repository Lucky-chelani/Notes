package com.example.notes.roomdatabase.presentation

import com.example.notes.roomdatabase.data.Note

sealed interface NotesEvent {
    object  SortNotes: NotesEvent
    data class DeleteNotes(
        val note: Note
    ) : NotesEvent
    data class SaveNotes(
        val title: String,
        val description: String

    ) : NotesEvent
}