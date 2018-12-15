package com.brkyzdmr.designpatterns.creational.abstractfactory;

public class M4a1Scope implements Scope {

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
        M4a1Scope s = new M4a1Scope();
        s.zoom();
        s.zoom();
    }
}
