package net.jerickson.javajam.weapon;

import net.jerickson.javajam.weapon.classes.Weapon;

public class SwordOfShanYu extends Weapon{
    
    public SwordOfShanYu() {
        super(8, 1);
    }

    public String toString() {
        return "The Sword of Shan Yu";
    }

    public DamageType getDamageType() {
        return DamageType.SLASHING;
    }
}