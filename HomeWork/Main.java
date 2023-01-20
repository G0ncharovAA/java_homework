package com.example.playground.HomeWork;

public class Main {

    private static IView view = new View();

    public static void main(String[] args) {
        User user = new User("Bob");
        IPersister persister = new Persister(user);
        view.print(user.report());
        view.print(persister.save());
    }
}