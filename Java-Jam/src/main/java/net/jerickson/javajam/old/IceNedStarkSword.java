package net.jerickson.javajam.old;

import net.jerickson.javajam.weapon.DamageType;
import net.jerickson.javajam.weapon.classes.Weapon;

/**
 * IceNedStarkSword
 */
public class IceNedStarkSword extends Weapon {
    
    public IceNedStarkSword() {
        super(8, 1);
    }

    public String toString() {
        return "Ice, the Sword of Ned Stark";
    }

    public DamageType getDamageType() {
        return DamageType.ICE;
    }
}