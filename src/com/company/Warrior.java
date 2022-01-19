package com.company;

public class Warrior extends Hero{

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил способность " + SuperAbilitiesTypes.CRITICAL_DAMAGE.getType());
    }
}
