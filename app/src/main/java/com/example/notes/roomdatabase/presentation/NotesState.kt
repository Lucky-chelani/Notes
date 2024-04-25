package com.example.notes.roomdatabase.presentation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.notes.roomdatabase.data.Note

data class NotesState(
    val notes : List<Note> =  emptyList(),
    val title : MutableState<String> = mutableStateOf(""),
    val description : MutableState<String> = mutableStateOf("")
)