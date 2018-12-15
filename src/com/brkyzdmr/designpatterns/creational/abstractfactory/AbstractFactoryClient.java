package com.brkyzdmr.designpatterns.creational.abstractfactory;

import java.util.Scanner;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String weaponType = sc.nextLine().toLowerCase();

        Factory factory;
    try {
        factory = Factory.getFactory(weaponType);
        Magazine magazine = factory.getMagazine();
        magazine.test();

        Scope scope = factory.getScope();
        scope.test();
    } catch (Factory.UnknownWeaponException e) {
        System.out.println("Unknown weapon exception!");
    }
    }
}
