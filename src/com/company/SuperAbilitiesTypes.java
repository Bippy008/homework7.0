package com.company;

public enum SuperAbilitiesTypes {
    CRITICAL_DAMAGE("Critical Damage"),
    EXTRA_SPELL("Extra Spell"),
    SUPER_HEALING("Super Healing");
    private String type;

    SuperAbilitiesTypes(String type) { this.type = type; }

    public String getType() {
        return type;
    }
}
