package net.jerickson.javajam.combatant.classes;

import net.jerickson.javajam.weapon.DamageType;

public class Healer extends Fighter{

	    public Healer(int health, int damageModifier) {
	        super(health, damageModifier);
	    }
	  
	    public int takeDamage(int damage, DamageType type) {
	    	 // healers have a special ability to get knocked down, but get back up again
	        // In fact, if damage delt is greater than or equal to 12,
	        if(damage >= 12) {
	        	
	        	// they get 7 points added back to their health
	            return super.takeDamage(damage - 7, type);
	        }

	    	// otherwise they just take regular damage
			return super.takeDamage(damage, type);
		}
}
