package gameBlock;

import java.util.Random;
import javax.swing.JOptionPane;

import FinalProject.items;
import FinalProject.main;
import FinalProject.missionIndex;
import FinalProject.statusCode;

public class forestTrail {
	static int passGame = 0;
	static int bearHP = 100;
	static int bearAttackPower;
	static int myAttackPower;
	static int hp;
	static int [] myBag = {0,0,0};
	
	public static int gamestart () {
	    JOptionPane.showMessageDialog(null,"Hello, little boy.\nYou interrupted my hibernation.\nNow i want to eat you。"); 
	    hp = main.hp;
		myBag = items.yourBag;
	    if (myBag [2] == 1) {
	    	JOptionPane.showMessageDialog(null,"You have a sword, and your attack power is locked between 10 and 20. ");
	    } else {
		    JOptionPane.showMessageDialog(null,"You don't have a sword, and your attack power is locked within 10. "); 
	    }
		System.out.println("\nYou are in battle.");
		System.out.println("\nPlease Wait...");
		while (bearHP > 0 & hp > 0) {
			creatBearAttackPower();
			creatMyAttackPower();
			System.out.println("In Battle");
			bearHP = bearHP - myAttackPower;
			hp = hp - bearAttackPower;
			System.out.println("bearAttackPower " + bearAttackPower);
			System.out.println("myAttackPower " + myAttackPower);
			System.out.println("bearHP " + bearHP);
			System.out.println("myHP " + hp);
		}
		if (bearHP > hp) {
			JOptionPane.showMessageDialog(null,"You are died.");
			bearHP = 100;
		    main.refreshHP(hp);
			missionIndex.missionIndex(0, 0, 2);
		}else if (hp >= bearHP) {
		    JOptionPane.showMessageDialog(null,"You WIN the battle!"); 
		    passGame = 1;
		    main.refreshHP(hp);
		    statusCode.statusCode(1, 1);
		}
	return passGame;
	}
	
	public static int creatBearAttackPower () {
		bearAttackPower = new Random().nextInt(10) + 1;
		return bearAttackPower;
	}
	
	public static int creatMyAttackPower () {
		if (myBag [2] == 1) {
			myAttackPower = new Random().nextInt(10) + 1;
			myAttackPower = myAttackPower + 10;
		} else {
			myAttackPower = new Random().nextInt(10) + 1;		
		}
		return myAttackPower;
	}
}
