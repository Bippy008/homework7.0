package com.company;

public class Medic extends Hero{

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил способность " + SuperAbilitiesTypes.SUPER_HEALING.getType());
    }
}
