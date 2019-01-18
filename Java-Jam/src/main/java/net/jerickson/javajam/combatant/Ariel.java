package net.jerickson.javajam.combatant;

import net.jerickson.javajam.combatant.classes.Rogue;

public class Ariel extends Rogue {
	
	public Ariel() {
		//health, damage modifier (added to damage their weapon dealt)
		super(50, 6);
	}

	
	//This is what prints when you select Ariel
	public String toString() {
		return "Ariel";
	}
}
