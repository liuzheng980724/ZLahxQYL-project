package gameBlock;

import javax.swing.JOptionPane;

import FinalProject.Main;
import FinalProject.MissionIndex;
import FinalProject.ReCheck;
import FinalProject.StageClear;
import FinalProject.GeneratedAttackValue;

/**
* Game Block: Forest Trail
* @author Zheng Liu
* @version 1.1
*/
public class ForestTrail {
	int bearHP = 100;
	int bearAttackPower;
	int myAttackPower;
	int hp;
	
	/**
	  * Start this part of game.
	  * Must Battle stage.
	  */
	public ForestTrail () {
		ReCheck warning = new ReCheck();
		GeneratedAttackValue bearAttack= new GeneratedAttackValue();
		GeneratedAttackValue userAttack= new GeneratedAttackValue();
		System.out.println("Hello, little boy.\nYou interrupted my hibernation.\nNow I want to eat you。"); 
		userAttack.AttackTips();
	    hp = Main.hp;
		System.out.println("You are in battle.\nPlease Wait...");

		while (bearHP > 0 & hp > 0) {
			bearAttack.GeneratedValue(0, 0);
			userAttack.GeneratedValue(0, 1);
			bearAttackPower = bearAttack.attackPower;
			myAttackPower = userAttack.attackPower;
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
		    Main.refreshHP(hp);
		    StageClear.statusCode(1, 1);
		} else {
			warning.warning();
			JOptionPane.showMessageDialog(null,"You are died.");
			bearHP = 100;
			Main.refreshHP(hp);
			new MissionIndex(0, 0, 2);
		}
	}
	
}
