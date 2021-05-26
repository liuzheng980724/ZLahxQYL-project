package FinalProject;

import javax.swing.JOptionPane;

/**
* Mix some GameBlocks in one javaFile.
* CHAT Content Provider: Ao Hua Xu and Qiyuan Luo
* Only Mix Battle needs block and Item gets block.
* Include GameBlock: CliffEdge, Dragon, ForestTrail, Cottage, LakeShore, and RockPath.
* Sorry about I decide to mix our codes in one javaFile only by myself.
* Group members work on other projects.
* @author Zheng Liu
* @version 1.0
*/
public class Scene {
	
	  String title = null;
	  String announcement = null;
	  String levelName = null;
	  String npcName = null;
	  String itemName = null;
	  String itemDescription = null;
	  int battleLevel = 0;
	  int locationBuffer;
	  int hp = 0;
	  int npcHp = 100;
	  int npcAttackPower;
	  int myAttackPower;
	  int npcDifficult = 0;
	  int haveItem = 0;
	  int [] clearStage = {0,0};

	/**
	 * This method is the main part of this javaFile.
	 * Config the game part.
	 * SHOW WELCOME.
	 * Start Game.
	 * @param location Where user in the map.
	 */
	public Scene (int location) {
		this.locationBuffer = location;
		mainConfig();
		welcomeTips();
		inGaming();
	}
	
	/**
	 * Config the game part. What we need.
	 */
	public void mainConfig () {
		clearStage = StageClear.clearStage;
		switch (locationBuffer) {
		case  11: 
			levelName = "Cliff Edge";
			announcement = "";
			battleLevel = 0;
			npcName = "";
			npcDifficult = 0;
			haveItem = 1;
			itemName = "Camp ";
			itemDescription = "may be helpful to you";
			break;
		case 14:
			levelName = "Dragon";
			announcement = "Hello, warrior\nYou can't pass here\nNow you will die here. ";
			if (clearStage[1] == 0) {
				battleLevel = 1;
			} else if (clearStage[1] == 1) {
				battleLevel = 0;
			}
			npcName = "Dragon";
			npcDifficult = 5;
			haveItem = 1;
			itemName = "EGG ";
			itemDescription = "is your reward";
			break;
		case 34:
			levelName = "Forest Trail";
			announcement = "Hello, little boy.\nYou interrupted my hibernation.\nNow I want to eat you。";
			battleLevel = 1;
			npcName = "Bear";
			npcDifficult = 0;
			haveItem = 0;
			itemName = "";
			itemDescription = "";
			break;
		case 44:
			levelName = "Cottage";
			announcement = "";
			battleLevel = 0;
			npcName = "";
			npcDifficult = 0;
			haveItem = 1;
			itemName = "Sword ";
			itemDescription = "will increase your attack power";
			break;
		case 53:
			levelName = "Lake Shore";
			announcement = "";
			battleLevel = 0;
			npcName = "";
			npcDifficult = 0;
			haveItem = 1;
			itemName = "Shell ";
			itemDescription = "can be used to buy tickets";
			break;
		case 54:
			levelName = "Rock Path";
			announcement = "";
			battleLevel = 0;
			npcName = "";
			npcDifficult = 0;
			haveItem = 1;
			itemName = "Herb ";
			itemDescription = "can treat you";
			break;
	}
	}
	
	/**
	 * Show welcome and tips do you want in.
	 */
	public void welcomeTips () {
		ReCheck warning = new ReCheck();
		warning.warning();
		int userFeedback = JOptionPane.showConfirmDialog(null,"Welcome! " + levelName + ". \nDo you start entering the level?","Permission",JOptionPane.YES_NO_OPTION);
		if (userFeedback == 0) {
			System.out.println("\nStart transferring");
		} else {
			System.out.println("\nTeleport back to the previous location.");
			Main.keepGoingORnot(1);
			Main.backPreviousPoint();
			Main.inGame();
		}
	}
	
	/**
	 * Part game thing. Need battle or get item or both.
	 */
	public void inGaming () {
		ReCheck warning = new ReCheck();
		if (announcement != null & npcName != null) {
			System.out.println(npcName + ": " + announcement);
		} else if (announcement != null & npcName == null) {
			System.out.println("Announcement: " + announcement);
		}
		
		if (battleLevel == 1) {
			GeneratedAttackValue npcAttack= new GeneratedAttackValue();
			GeneratedAttackValue userAttack= new GeneratedAttackValue();
			userAttack.AttackTips();
		    hp = Main.hp;
			System.out.println("You are in battle.\nPlease Wait...");
			while (npcHp > 0 & hp > 0) {
				npcAttack.GeneratedValue(npcDifficult, 0);
				userAttack.GeneratedValue(0, 1);
				npcAttackPower = npcAttack.attackPower;
				myAttackPower = userAttack.attackPower;
				System.out.println("In Battle");
				npcHp = npcHp - myAttackPower;
				hp = hp - npcAttackPower;
				System.out.println(npcName + " AttackPower " + npcAttackPower);
				System.out.println("myAttackPower " + myAttackPower);
				System.out.println(npcName + " HP " + npcHp);
				System.out.println("myHP " + hp);
			}
			
			if (hp >= npcHp & hp > 0) {
				warning.warning();
				JOptionPane.showMessageDialog(null,"You are WIN!!");
				npcHp = 100;
			    Main.refreshHP(hp);
			    switch (locationBuffer) {
			    case 14:
					StageClear.statusCode(2, 1);
			    	break; 
			    case 34:
			    	StageClear.statusCode(1, 1);
			    	break;
			    }    
			} else {
				warning.warning();
				JOptionPane.showMessageDialog(null,"You are died.");
				npcHp = 100;
				Main.refreshHP(hp);
				new MissionIndex(0, 0, 2);
			}
		}
		
		if (haveItem == 1) {
			getItem();
		}
	}
	
	/**
	 * Pick up items part.
	 */
	public void getItem () {
		ReCheck warning = new ReCheck();
		warning.warning();
	    JOptionPane.showMessageDialog(null,"Hello, You found a " + itemName + "."); 
	    warning.warning();
	    int userFeedback = JOptionPane.showConfirmDialog(null,"Do you want pick it up? " + "\n" + itemName + itemDescription + ".","Permission",JOptionPane.YES_NO_OPTION);
		if (userFeedback == 0) {
			switch (locationBuffer) {
			case 11:
				Items.Items(0, 1, 0, 0, 0);
				break;
			case 14:
				Items.Items(0, 0, 0, 0, 1);
				break;
			case 44:
				Items.Items(0, 0, 1, 0, 0);
				break;
			case 53:
				Items.Items(1, 0, 0, 0, 0);
				break;
			case 54:
				Items.Items(0, 0, 0, 1, 0);
				break;
			}
			System.out.println("\nGreat. You got it.");
		} else {
			System.out.println("\nOkay, you are welcome to come back and take me at any time.");
		}
	}
}
