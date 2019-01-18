package net.jerickson.javajam.weapon;

import net.jerickson.javajam.weapon.classes.Weapon;

public class PoisonApple extends Weapon {

	public PoisonApple() {
		super(4, 2);
	}

	public String toString() {
		return "a Pulverizing PoisonApple";
	}

	public DamageType getDamageType() {
		return DamageType.BASHING;
	}
}
