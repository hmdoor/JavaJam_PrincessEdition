package net.jerickson.javajam.weapon;

import net.jerickson.javajam.weapon.classes.Weapon;

public class RajahFang extends Weapon{
	
    public RajahFang() {
        super(4, 3);
    }

    public String toString() {
        return "Rajah's Fearsome Fangs";
    }

    public DamageType getDamageType() {
        return DamageType.FURRY;
    }
}


