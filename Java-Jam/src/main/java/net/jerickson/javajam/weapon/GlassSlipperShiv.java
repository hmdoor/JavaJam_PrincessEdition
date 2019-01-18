package net.jerickson.javajam.weapon;

import net.jerickson.javajam.weapon.classes.Weapon;

public class GlassSlipperShiv extends Weapon{
	
	public GlassSlipperShiv() {
		super(6, 2);
	}

	public String toString() {
		return "a Glass Slipper Shiv";
	}

	public DamageType getDamageType() {
		return DamageType.SLASHING;
	}

}


