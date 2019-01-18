package net.jerickson.javajam;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import net.jerickson.javajam.combatant.Ariel;
import net.jerickson.javajam.combatant.Belle;
import net.jerickson.javajam.combatant.Cinderella;
import net.jerickson.javajam.combatant.Elsa;
import net.jerickson.javajam.combatant.Fightable;
import net.jerickson.javajam.combatant.Jasmine;
import net.jerickson.javajam.combatant.Merida;
import net.jerickson.javajam.combatant.Mulan;
import net.jerickson.javajam.combatant.Pocahontas;
import net.jerickson.javajam.combatant.Rapunzel;
import net.jerickson.javajam.weapon.FlamingArrow;
import net.jerickson.javajam.weapon.FryingPan;
import net.jerickson.javajam.weapon.GlassSlipperShiv;
import net.jerickson.javajam.weapon.GrandmotherWillowBranch;
import net.jerickson.javajam.weapon.IceStorm;
import net.jerickson.javajam.weapon.KingTritonsTrident;
import net.jerickson.javajam.weapon.PoisonApple;
import net.jerickson.javajam.weapon.RajahFang;
import net.jerickson.javajam.weapon.RoseThorn;
import net.jerickson.javajam.weapon.Strikable;
import net.jerickson.javajam.weapon.SwordOfShanYu;

/**
 * FightingPit
 */
public class FightingPit {

    private static Fightable[] fighterOptions = {
        new Mulan(),
        new Elsa(),
        new Merida(),
        new Rapunzel(),
        new Pocahontas(),
        new Jasmine(),
        new Ariel(),
        new Belle(),
        new SnowWhite(),
        new Cinderella()
    };

    private static Strikable[] weaponOptions = {
        new SwordOfShanYu(),
        new IceStorm(),
        new FlamingArrow(),
        new FryingPan(),
        new GrandmotherWillowBranch(),
        new RajahFang(),
        new KingTritonsTrident(),
        new RoseThorn(),
        new PoisonApple(),
        new GlassSlipperShiv()
    };

    Scanner input;

    public FightingPit() {
        input = new Scanner(System.in);
    }

    public void run() {
        printGreeting();

        Fightable fighterOne = askUserForFighter();
        Strikable fighterOnesWeapon = askUserForWeapon();
        fighterOne.setWeapon(fighterOnesWeapon);

        System.out.println("Who dare be against this dazzling diva?!");
        System.out.println();

        Fightable fighterTwo = askUserForFighter();
        Strikable fighterTwosWeapon = askUserForWeapon();
        fighterTwo.setWeapon(fighterTwosWeapon);

        fight(fighterOne, fighterTwo);
    }

	private void fight(Fightable fighterOne, Fightable fighterTwo) {
        System.out.println("The carnage BEGINS!!!!!!!");
        System.out.println();

        while( !fighterOne.isDead() && !fighterTwo.isDead()) {
            try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				
            }
            
            System.out.println(fighterOne + " strikes with " + fighterOne.getWeapon());
            int damageDealt = fighterOne.dealDamage();
            System.out.println("A hit of " + damageDealt + " points!");
            int actualDamage = fighterTwo.takeDamage(damageDealt, fighterOne.getDamageType());
            if(actualDamage < damageDealt){
                System.out.println("But what moves! " + fighterTwo + " only took " + actualDamage);
            } else {
                System.out.println("Ouch! " + fighterTwo + " actually took " + actualDamage + " from that hit!");
            }
            System.out.println();

            try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				
            }
            
            System.out.println(fighterTwo + " strikes back with " + fighterTwo.getWeapon());
            damageDealt = fighterTwo.dealDamage();
            System.out.println("That took off " + damageDealt + " points!");
            actualDamage = fighterOne.takeDamage(damageDealt, fighterTwo.getDamageType());
            if(actualDamage < damageDealt){
                System.out.println("Amazing dodge! " + fighterOne + " only took " + actualDamage);
            } else {
                System.out.println("Crushing! " + fighterOne + " actually took " + actualDamage + " from that one!");
            }
            System.out.println();

            System.out.println("That leaves " + fighterOne + " with " + fighterOne.getHealth() +
                " and " + fighterTwo + " with " + fighterTwo.getHealth());
            System.out.println();
        }

        Fightable winner, loser;
        if(fighterOne.isDead()) {
            winner = fighterTwo;
            loser = fighterOne;
        } else {
            winner = fighterOne;
            loser = fighterTwo;
        }

        System.out.println("That means that " + loser + " is out of the fight!");
        System.out.println("The winner is " + winner.toString().toUpperCase() + "!");

        System.out.println();
	}

	private Fightable askUserForFighter() {
        while(true) {
            System.out.println();
            System.out.println("Pick your princess!");
            
            for(int i = 0; i < fighterOptions.length; i++) {
                System.out.println("" + i + ": " + fighterOptions[i]);
            }

            System.out.println("Who will you choose? ");
            String choice = input.nextLine();
            int index;
            try {
                index = Integer.parseInt(choice);
            } catch (NumberFormatException ex) {
                index = -1;
            }
            if(index >= 0 && index < fighterOptions.length) {
                return fighterOptions[index];
            } else {
                System.out.println("What are you? Daft? Pick a pretty princess!");
            }
        }
    }
    
    private Strikable askUserForWeapon() {
        while(true) {
            System.out.println();
            System.out.println("Choose a weapon!");
            
            for(int i = 0; i < weaponOptions.length; i++) {
                System.out.println("" + i + ": " + weaponOptions[i]);
            }

            System.out.println("What will they fight with? ");
            String choice = input.nextLine();
            int index;
            try {
                index = Integer.parseInt(choice);
            } catch (NumberFormatException ex) {
                index = -1;
            }
            if(index >= 0 && index < weaponOptions.length) {
                return weaponOptions[index];
            } else {
                System.out.println("What are you? Daft? Pick an instrument of destruction!");
            }
        }
	}

	private void printGreeting() {
        System.out.println("Welcome to the combat castle!");
        System.out.println("Today we'll see our favorite princesses duke it out to prove, once and for all, \n" 
        		+ "who is the fiercest and most fabulous Disney Princess.");
        System.out.println("Who will be our duleing divas today?");
        System.out.println();
    }
    
}