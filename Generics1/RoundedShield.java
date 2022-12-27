package com.example.playground.Generics1;

public abstract class RoundedShield implements Shield {
    public abstract int parry();

    @Override
    public String toString() {
        return String.format("Защита %d  вероятность парирования %d", defence(), parry());
    }
}
