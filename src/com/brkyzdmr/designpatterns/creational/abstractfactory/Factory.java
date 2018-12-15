package com.brkyzdmr.designpatterns.creational.abstractfactory;

public abstract class Factory {
    // Singleton implementations
    private static Factory m4a1Factory = null;
    private static Factory ak47Factory = null;
    // Abstract methods
    public abstract Magazine getMagazine();
    public abstract Scope getScope();

    public static Factory getFactory(String weaponType) throws UnknownWeaponException {
        if(weaponType == null) {
            return null;
        }

        Factory factory = null;

        switch (weaponType) {
            case "m4a1":
                if(m4a1Factory == null) {
                    m4a1Factory = new M4a1Factory();
                }
                factory = m4a1Factory;
                break;
            case "ak47":
                if(ak47Factory == null) {
                    ak47Factory = new Ak47Factory();
                }
                factory = ak47Factory;
                break;
            default:
                System.out.println("Unknown weapon!");
        }
        return factory;
    }

    public static class UnknownWeaponException extends Exception {
        // Unknown Weapon Exception implementations
    }
}
