package gameBlock;

import java.util.Random;

import javax.swing.JOptionPane;

import FinalProject.items;
import FinalProject.main;
import FinalProject.missionIndex;
import FinalProject.reCheck;
import FinalProject.statusCode;

public class dragon {
	static int passGame = 0;
	static int dragonHP = 100;
	static int hp;
	static int dragonAttackPower;
	static int myAttackPower;
	static int [] myBag = {0,0,0,0,0};
	static int [] clearStage = {0,0};
	
	public static void gamestart () {
		clearStage = statusCode.clearStage;
		if (clearStage[1] == 0) {
			reCheck.warning();
		    JOptionPane.showMessageDialog(null,"Hello, warrior\nYou can't pass here\nNow you will die here."); 
		    
		    hp = main.hp;
		    myBag = items.yourBag;
		    if (myBag [2] == 1) {
		    	reCheck.warning();
		    	JOptionPane.showMessageDialog(null,"You have a sword, and your attack power is locked between 10 and 20. ");
		    } else {
		    	reCheck.warning();
			    JOptionPane.showMessageDialog(null,"You don't have a sword, and your attack power is locked within 10. "); 
		    }
			System.out.println("\nYou are in battle\nPlease Wait...");
			
			while (dragonHP > 0 & hp > 0) {
				creatdragonAttackPower();
				creatMyAttackPower();
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
				main.refreshHP(hp);
				missionIndex.missionIndex(0, 0, 2);
			}else if (hp >= dragonHP) {
				dragonHP = 100;
			    JOptionPane.showMessageDialog(null,"You WIN the battle!\n You got a dragon egg."); 
			    int userFeedback = JOptionPane.showConfirmDialog(null,"Do you want pick it up?","Permission",JOptionPane.YES_NO_OPTION);
				if (userFeedback == 0) {
					items.bag(0, 0, 0, 0, 1);
					System.out.println("\nGreat. You got it.");
				} else {
					System.out.println("\nOkay, you are welcome to come back and take me at any time.");
				}
			    passGame = 1;
			    main.refreshHP(hp);
			    statusCode.statusCode(2, 1);
			    }
		} else if(clearStage[1] == 1) {
			JOptionPane.showMessageDialog(null,"A dragon egg on the ground."); 
		    int userFeedback = JOptionPane.showConfirmDialog(null,"Do you want pick it up?","Permission",JOptionPane.YES_NO_OPTION);
			if (userFeedback == 0) {
				items.bag(0, 0, 0, 0, 1);
				System.out.println("\nGreat. You got it.");
			} else {
				System.out.println("\nOkay, you are welcome to come back and take me at any time.");
			}
		}

		}
		
		public static int creatdragonAttackPower () {
			dragonAttackPower = new Random().nextInt(10) + 6;
			return dragonAttackPower;
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
