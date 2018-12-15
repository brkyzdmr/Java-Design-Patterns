package com.brkyzdmr.designpatterns.creational.abstractfactory;

public class M4a1Factory extends Factory {

    @Override
    public Magazine getMagazine() {
        return new M4a1Magazine();
    }

    @Override
    public Scope getScope() {
        return new M4a1Scope();
    }
}
