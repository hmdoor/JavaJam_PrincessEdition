package net.jerickson.javajam.weapon;

import net.jerickson.javajam.weapon.classes.Weapon;

public class FlamingArrow extends Weapon {

	public FlamingArrow() {
		super(8, 1);
	}

	public String toString() {
		return "a swift shot from a flaming arrow";
	}

	public DamageType getDamageType() {
		return DamageType.FIRE;
	}
}
