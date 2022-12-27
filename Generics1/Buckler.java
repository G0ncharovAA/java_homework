package com.example.playground.Generics1;

public class Buckler extends RoundedShield {

    @Override
    public int parry() {
        return 60;
    }

    @Override
    public int defence() {
        return 15;
    }

    @Override
    public String toString() {
        return "Баклер: "+super.toString();
    }
}
