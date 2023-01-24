package com.example.playground.Notes_decorated.model.domain;

import java.util.List;

public interface IStorage {

    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}