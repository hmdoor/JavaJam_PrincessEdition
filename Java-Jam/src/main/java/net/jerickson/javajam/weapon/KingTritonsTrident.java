package net.jerickson.javajam.weapon;

import net.jerickson.javajam.weapon.classes.Weapon;

public class KingTritonsTrident extends Weapon {

	public KingTritonsTrident() {
		super(6, 2);
	}

	public String toString() {
		return "King Triton's Trident";
	}

	public DamageType getDamageType() {
		return DamageType.MAGIC;
	}

}
