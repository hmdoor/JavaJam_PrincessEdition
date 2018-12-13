package net.jerickson.javajam.weapon;

import net.jerickson.javajam.weapon.classes.Weapon;

public class FryingPan extends Weapon{
	
	public FryingPan( ) {
		super(6,1);
	}
	
	public String toString() {
		return "the frying pan of doom";
	}

	public DamageType getDamageType() {
		return DamageType.BASHING;
	}

}
