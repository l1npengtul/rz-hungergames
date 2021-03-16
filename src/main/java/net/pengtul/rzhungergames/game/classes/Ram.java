package net.pengtul.rzhungergames.game.classes;

import net.pengtul.rzhungergames.game.weapons.DamageType;

public class Ram implements Classes {
    @Override
    public ClassTypes getClassType() {
        return ClassTypes.Ram;
    }

    @Override
    public int getAbilityCooldown() {
        return 0;
    }

    @Override
    public int getCurrentAbilityCooldown() {
        return 0;
    }

    @Override
    public void doClassAbility() {

    }

    @Override
    public int getClassUltimateCooldown() {
        return 0;
    }

    @Override
    public int getCurrentUltimateCooldown() {
        return 0;
    }

    @Override
    public void doClassUltimate() {

    }

    @Override
    public float calculateTakenDamage(float damage) {
        return 0;
    }

    @Override
    public float calculateRegeneration(float toHeal) {
        return 0;
    }

    @Override
    public float calculateDealtDamage(DamageType damageType, float damage) {
        return 0;
    }
}
