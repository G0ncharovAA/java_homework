package com.example.playground.Notes.di;

import com.example.playground.Notes.model.INoteController;
import com.example.playground.Notes.model.IRepository;
import com.example.playground.Notes.model.IStorage;
import com.example.playground.Notes.views.NoteView;

public class Component {

    public IStorage storage;
    public IRepository repository;
    public INoteController noteController;
    public NoteView noteView;

    public Component() {

        storage = Module.provideStorage();
        repository = Module.provideRepository(storage, Module.provideMapper());
        noteController = Module.provideNoteController(repository, Module.provideValidator());
        noteView = Module.provideView(noteController);
    }
}
