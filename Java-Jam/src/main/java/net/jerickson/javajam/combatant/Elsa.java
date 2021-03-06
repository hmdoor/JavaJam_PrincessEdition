package net.jerickson.javajam.combatant;
import net.jerickson.javajam.combatant.classes.Fighter;
import net.jerickson.javajam.weapon.DamageType;

public class Elsa extends Fighter{
	
	public Elsa() {
		super(140, 10);
	}
	   @Override
	    public int takeDamage(int damage, DamageType type) {
	        // The only way to fight ice is with fire. A flaming arrow can melt the heart
		   	// and powers of it's greatest adversary
	        if(type.equals(DamageType.FIRE)) {
	            damage *= 2;
	        }

	        return super.takeDamage(damage, type);
	    }

	    public String toString() {
	        return "Elsa";
	    }

}
