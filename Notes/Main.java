package com.example.playground.Notes;

import com.example.playground.Notes.di.Component;

public class Main {

    private static final Component appComponent = new Component();

    public static void main(String[] args) {

        appComponent.noteView.run();
    }
}
