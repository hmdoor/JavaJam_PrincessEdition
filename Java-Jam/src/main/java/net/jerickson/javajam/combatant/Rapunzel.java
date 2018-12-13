package net.jerickson.javajam.combatant;

import net.jerickson.javajam.combatant.classes.Fighter;
import net.jerickson.javajam.weapon.DamageType;

public class Rapunzel extends Fighter{
	
	public Rapunzel() {
		super(120,9);
	}
	   @Override
	    public int takeDamage(int damage, DamageType type) {
	        // This princess holds her powers in her hair
		   	// therefore, anything sharp that could cut it will be her downfall
	        if(type.equals(DamageType.SLASHING)) {
	            damage *= 2;
	        }

	        return super.takeDamage(damage, type);
	    }

	    public String toString() {
	        return "Rapunzel";
	    }

}
