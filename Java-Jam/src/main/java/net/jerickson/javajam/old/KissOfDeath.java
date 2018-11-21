package net.jerickson.javajam.old;
import net.jerickson.javajam.weapon.DamageType;
import net.jerickson.javajam.weapon.classes.Weapon;

public class KissOfDeath extends Weapon{
	
	 public KissOfDeath() {
	        super(8, 1);
	    }

	    public String toString() {
	        return "The Betrayal, kiss of death";
	    }

	    public DamageType getDamageType() {
	        return DamageType.KISS;
	    }

}
