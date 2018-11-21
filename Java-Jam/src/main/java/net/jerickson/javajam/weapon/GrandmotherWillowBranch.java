package net.jerickson.javajam.weapon;

import net.jerickson.javajam.weapon.classes.Weapon;

public class GrandmotherWillowBranch extends Weapon{
    
    public GrandmotherWillowBranch() {
        super(6, 2);
    }

    public String toString() {
        return "a whip from Grandmother Willow's branch";
    }

    public DamageType getDamageType() {
        return DamageType.WHIP;
    }
}


