package net.jerickson.javajam.combatant.classes;

import net.jerickson.javajam.weapon.DamageType;

/**
 * Rogue extends Fighter
 */
public class Rogue extends Fighter {

	public Rogue(int health, int damageModifier) {
		super(health, damageModifier);
	}

	public int takeDamage(int damage, DamageType type) {
		// Slippery Rouges can dodge a lot of damage
		// In fact, they dodge all big hits over 17
		if (damage >= 17) {
			return 0;
		}
		if (damage <= 14) {
			// And they even take half damage of small hits
			return super.takeDamage(damage / 2, type);
		}
		// otherwise they just take regular damage
		return super.takeDamage(damage, type);
	}
}
