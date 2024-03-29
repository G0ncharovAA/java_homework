package com.example.playground.Notes_decorated.model.domain;

import com.example.playground.Notes_decorated.model.domain.entity.Note;

import java.util.List;

public interface INoteController {

    void saveNote(Note note) throws Exception;

    Note readNote(String noteId) throws Exception;

    List<Note> readList();

    void updateNote(String noteId, Note newNote) throws Exception;

    void deleteNote(String noteId) throws Exception;

    void idPresenceValidation(String noteId) throws Exception;
}