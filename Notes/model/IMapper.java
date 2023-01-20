package com.example.playground.Notes.model;

public interface IMapper {

    String map(Note note);

    Note map(String line);
}
