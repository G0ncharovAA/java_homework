package com.example.playground.HomeWork;

public class User implements Reportable, Persistable {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String report() {
        return "Report for user: " + name;
    }

    @Override
    public String save() {
        return name;
    }
}