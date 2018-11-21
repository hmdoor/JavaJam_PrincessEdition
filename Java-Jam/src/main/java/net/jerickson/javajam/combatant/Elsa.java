package net.jerickson.javajam.combatant;
import net.jerickson.javajam.combatant.classes.Fighter;
import net.jerickson.javajam.weapon.DamageType;

public class Elsa extends Fighter{
	
	public Elsa() {
		super(150, 10);
	}
	   @Override
	    public int takeDamage(int damage, DamageType type) {
	        // Shan Yu, the ruthless leader of the Hun army and the only one to harm Mulan
	        if(type.equals(DamageType.SLASHING)) {
	            damage *= 2;
	        }

	        return super.takeDamage(damage, type);
	    }

	    public String toString() {
	        return "Mulan";
	    }

}
