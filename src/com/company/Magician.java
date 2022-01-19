package com.company;

public class Magician extends Hero{

    @Override
    public void applySuperAbility() {
        System.out.println("Magician применил способность " + SuperAbilitiesTypes.EXTRA_SPELL.getType());
    }
}
