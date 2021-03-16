package net.pengtul.rzhungergames.game.classes;

import net.pengtul.rzhungergames.game.weapons.DamageType;
import org.bukkit.entity.Player;

public interface Classes {
    ClassTypes getClassType();
    int getAbilityCooldown();
    int getCurrentAbilityCooldown();
    void doClassAbility();
    int getClassUltimateCooldown();
    int getCurrentUltimateCooldown();
    void doClassUltimate();
    float calculateTakenDamage(float damage);
    float calculateRegeneration(float toHeal);
    float calculateDealtDamage(DamageType damageType, float damage);

}
