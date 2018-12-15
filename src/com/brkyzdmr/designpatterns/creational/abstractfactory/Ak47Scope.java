package com.brkyzdmr.designpatterns.creational.abstractfactory;

public class Ak47Scope implements Scope {
    private static boolean isZoomed = false;

    @Override
    public void zoom() {
        if(isZoomed) {
            System.out.println("Zoom out.");
            isZoomed = false;
        } else {
            System.out.println("Zoom in.");
            isZoomed = true;
        }
    }

    @Override
    public void test() {
        Ak47Scope s = new Ak47Scope();
        s.zoom();
        s.zoom();
    }
}
