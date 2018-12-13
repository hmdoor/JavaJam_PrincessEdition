package net.jerickson.javajam.combatant;

import net.jerickson.javajam.combatant.classes.Fighter;
import net.jerickson.javajam.weapon.DamageType;

public class Merida extends Fighter{
		
		public Merida() {
			super(130, 9);
		}
		   @Override
		    public int takeDamage(int damage, DamageType type) {
		        // Pride is this princess's downfall which turned her mother into a bear
			   	// therefore, her greatest weakness's are Disney animal side kicks
		        if(type.equals(DamageType.FURRY)) {
		            damage *= 2;
		        }

		        return super.takeDamage(damage, type);
		    }

		    public String toString() {
		        return "Merida";
		    }
}
