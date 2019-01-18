package net.jerickson.javajam.weapon;

import net.jerickson.javajam.weapon.classes.Weapon;

public class RoseThorn extends Weapon{
	
	public RoseThorn() {
		super(5, 2);
	}

	public String toString() {
		return "a Razor Sharp Rose Thorn";
	}

	public DamageType getDamageType() {
		return DamageType.SLASHING;
	}

}


