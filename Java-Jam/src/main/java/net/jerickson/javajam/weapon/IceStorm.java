package net.jerickson.javajam.weapon;

import net.jerickson.javajam.weapon.classes.Weapon;

public class IceStorm extends Weapon{

		public IceStorm() {
			super(5, 2);
		}

		public String toString() {
			return "a flurry of frozen fractals";
		}

		public DamageType getDamageType() {
			return DamageType.ICE;
		}
	}

