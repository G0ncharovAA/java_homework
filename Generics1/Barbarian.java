package com.example.playground.Generics1;

public class Barbarian extends Warrior<Axe, RoundedShield> {

    public Barbarian(String name, int healthpoint, Axe weapon, RoundedShield shield) {
        super(name, healthpoint, weapon, shield);
    }
}
