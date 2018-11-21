package net.jerickson.javajam.old;

import net.jerickson.javajam.weapon.DamageType;
import net.jerickson.javajam.weapon.classes.Weapon;

public class MasterSword extends Weapon {

    public MasterSword() {
        super(8, 2);
    }

    public String toString() {
        return "The Master Sword";
    }

    public DamageType getDamageType() {
        return DamageType.SLASHING;
    }
}