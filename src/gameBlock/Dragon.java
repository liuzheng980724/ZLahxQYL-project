package gameBlock;

import javax.swing.JOptionPane;

import FinalProject.Items;
import FinalProject.Main;
import FinalProject.MissionIndex;
import FinalProject.ReCheck;
import FinalProject.StageClear;
import FinalProject.GeneratedAttackValue;

/**
* Game Block: Dragon
* @author Qiyuan Luo
* @version 1.0
*/
public class Dragon {
	int dragonHP = 100;
	int hp;
	int dragonAttackPower;
	int myAttackPower;
	int [] clearStage = {0,0};
	
	/**
	  * Start this part of game.
	  * Must Battle stage.
	  */
	public Dragon () {
		ReCheck warning = new ReCheck();
		GeneratedAttackValue dragonAttack= new GeneratedAttackValue();
		GeneratedAttackValue userAttack= new GeneratedAttackValue();
		clearStage = StageClear.clearStage;
		if (clearStage[1] == 0) {
			warning.warning();
			System.out.println("Hello, warrior\nYou can't pass here\nNow you will die here."); 
			userAttack.AttackTips();
		    hp = Main.hp;
			System.out.println("\nYou are in battle\nPlease Wait...");			

			while (dragonHP > 0 & hp > 0) {
				dragonAttack.GeneratedValue(5, 0);
				userAttack.GeneratedValue(0, 1);
				dragonAttackPower = dragonAttack.attackPower;
				myAttackPower = userAttack.attackPower;
				System.out.println("In Battle");
				dragonHP = dragonHP - myAttackPower;
				hp = hp - dragonAttackPower;
				System.out.println("dragonAttackPower " + dragonAttackPower);
				System.out.println("myAttackPower " + myAttackPower);
				System.out.println("dragonHP " + dragonHP);
				System.out.println("myHP " + hp);
			}
			
			if (dragonHP > hp) {
				JOptionPane.showMessageDialog(null,"You are died\nAre you get the sword, it will help you.");
		    	
				dragonHP = 100;
				Main.refreshHP(hp);
				new MissionIndex(0, 0, 2);
			}else if (hp >= dragonHP) {
				dragonHP = 100;
			    JOptionPane.showMessageDialog(null,"You WIN the battle!\n You got a dragon egg."); 
			    int userFeedback = JOptionPane.showConfirmDialog(null,"Do you want pick it up?","Permission",JOptionPane.YES_NO_OPTION);
				if (userFeedback == 0) {
					Items.Items(0, 0, 0, 0, 1);
					System.out.println("\nGreat. You got it.");
				} else {
					System.out.println("\nOkay, you are welcome to come back and take me at any time.");
				}
				Main.refreshHP(hp);
				StageClear.statusCode(2, 1);
			    }
		} else if(clearStage[1] == 1) {
			JOptionPane.showMessageDialog(null,"A dragon egg on the ground."); 
		    int userFeedback = JOptionPane.showConfirmDialog(null,"Do you want pick it up?","Permission",JOptionPane.YES_NO_OPTION);
			if (userFeedback == 0) {
				Items.Items(0, 0, 0, 0, 1);
				System.out.println("\nGreat. You got it.");
			} else {
				System.out.println("\nOkay, you are welcome to come back and take me at any time.");
			}
		}

		}
		
}
