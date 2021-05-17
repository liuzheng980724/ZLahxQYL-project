package gameBlock;

/**
* Game Block: Forest Trail
* @author Zheng Liu
* @version 1.1
*/

import java.util.Random;
import javax.swing.JOptionPane;

import FinalProject.items;
import FinalProject.main;
import FinalProject.missionIndex;
import FinalProject.reCheck;
import FinalProject.statusCode;

public class forestTrail {
	int bearHP = 100;
	int bearAttackPower;
	int myAttackPower;
	int hp;
	int [] myBag = {0,0,0,0,0};
	
	public forestTrail () {
		reCheck warning = new reCheck();
		System.out.println("Hello, little boy.\nYou interrupted my hibernation.\nNow i want to eat you。"); 
	    hp = main.hp;
		myBag = items.yourBag;
	    if (myBag [2] == 1) {
	    	System.out.println("TIPS: You have a sword, and your attack power is locked between 10 and 20. ");
	    } else {
	    	System.out.println("TIPS: You don't have a sword, and your attack power is locked within 10. "); 
	    }
	    warning.needYes();
		System.out.println("\nYou are in battle.");
		System.out.println("\nPlease Wait...");
		System.out.println("bearHP " + bearHP);
		System.out.println("myHP " + hp);
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
		if (hp >= bearHP & hp > 0) {
			warning.warning();
			JOptionPane.showMessageDialog(null,"You are WIN!!");
		    bearHP = 100;
		    main.refreshHP(hp);
		    statusCode.statusCode(1, 1);
		} else {
			warning.warning();
			JOptionPane.showMessageDialog(null,"You are died.");
			bearHP = 100;
		    main.refreshHP(hp);
			new missionIndex(0, 0, 2);
		}
	}
	
	int creatBearAttackPower () {
		bearAttackPower = new Random().nextInt(10) + 1;
		return bearAttackPower;
	}
	
	int creatMyAttackPower () {
		if (myBag [2] == 1) {
			myAttackPower = new Random().nextInt(10) + 1;
			myAttackPower = myAttackPower + 10;
		} else {
			myAttackPower = new Random().nextInt(10) + 1;		
		}
		return myAttackPower;
	}
}
