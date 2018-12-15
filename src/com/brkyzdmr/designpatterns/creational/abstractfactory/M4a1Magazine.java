package com.brkyzdmr.designpatterns.creational.abstractfactory;

public class M4a1Magazine implements Magazine {

    private static byte capasity = 30;
    private static byte currentAmmo = 30;
    @Override
    public void reload() {
        currentAmmo = 30;
        System.out.println("Reloading... Current Ammo: " + currentAmmo);
    }

    @Override
    public void fire() {
        if(currentAmmo == 0) {
            System.out.println("Click click... Out of ammo!");
        } else {
            currentAmmo--;
            System.out.println("Fire! Ammo: " + currentAmmo);
        }
    }

    @Override
    public void test() {
        M4a1Magazine m = new M4a1Magazine();
        m.fire();
        m.reload();
    }
}
