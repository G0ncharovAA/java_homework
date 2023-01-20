package com.example.playground.Notes.di;

import com.example.playground.Notes.controllers.NoteController;
import com.example.playground.Notes.model.FileStorage;
import com.example.playground.Notes.model.IMapper;
import com.example.playground.Notes.model.INoteController;
import com.example.playground.Notes.model.IRepository;
import com.example.playground.Notes.model.IStorage;
import com.example.playground.Notes.model.IValidator;
import com.example.playground.Notes.model.MapperIml;
import com.example.playground.Notes.model.RepositoryImpl;
import com.example.playground.Notes.views.NoteView;

public class Module {

    public static IStorage provideStorage() {
        return new FileStorage("notes.txt");
    }

    public static IMapper provideMapper() {
        return new MapperIml();
    }

    public static IValidator provideValidator() {
        return new MapperIml();
    }

    public static IRepository provideRepository(
            IStorage storage,
            IMapper mapper
    ) {
        return new RepositoryImpl(mapper, storage);
    }

    public static INoteController provideNoteController(
            IRepository repository,
            IValidator validator
    ) {
        return new NoteController(repository, validator);
    }

    public static NoteView provideView(
            INoteController controller
    ) {
        return new NoteView(controller);
    }
}
