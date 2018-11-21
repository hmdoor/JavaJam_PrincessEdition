package net.jerickson.javajam.old;

import net.jerickson.javajam.combatant.classes.Fighter;
import net.jerickson.javajam.weapon.DamageType;

public class Jesus extends Fighter{

	public Jesus() {
		super(150, 5);
	}
	   @Override
	    public int takeDamage(int damage, DamageType type) {
	        // Jesus knew he was gonna die
	        if(type.equals(DamageType.KISS)) {
	            damage *= 2;
	        }

	        return super.takeDamage(damage, type);
	    }

	    public String toString() {
	        return "Jesus";
	    }
	}

