package com.example.playground.Generics1;

public abstract class Bow implements Weapon {
    public abstract int range();

    @Override
    public String toString() {
        return String.format("Радиус поражения %d  величина урона %d",range(),damage());
    }
}
