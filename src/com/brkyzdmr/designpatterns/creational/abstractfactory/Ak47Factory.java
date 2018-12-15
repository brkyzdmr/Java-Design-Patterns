package com.brkyzdmr.designpatterns.creational.abstractfactory;

public class Ak47Factory extends Factory {
    @Override
    public Magazine getMagazine() {
        return new Ak47Magazine();
    }

    @Override
    public Scope getScope() {
        return new Ak47Scope();
    }
}
