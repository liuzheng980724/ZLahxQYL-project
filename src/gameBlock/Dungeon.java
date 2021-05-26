package gameBlock;

import javax.swing.JOptionPane;

import FinalProject.Items;
import FinalProject.MissionIndex;
import FinalProject.ReCheck;

/**
* Game Block: Dungeon
* @author Qiyuan Luo
* @version 1.0
*/
public class Dungeon {
	int [] myBag = {0,0,0,0,0};
	
	/**
	  * Start this part of the game.
	  * Need item: CAMP. If not not allow pass.
	  */
	public Dungeon () {
		ReCheck warning = new ReCheck();
		warning.warning();
	int userFeedback = JOptionPane.showConfirmDialog(null,"Welcome! Dark Dungeon. \nDo you want go inside?","Permission",JOptionPane.YES_NO_OPTION);
	if (userFeedback == 0) {
		myBag = Items.yourBag;
		System.out.println("\nGreat. Go Dark Dungeon we need you have camp.");
		if (myBag [1] == 1) {
			System.out.println("\nGreat. You have camp, now you can keep going.");
		}
		else {
			System.out.println("\nHey. We cannot find your camp. We cannont help you.");
			warning.needYes();
			new MissionIndex(0, 0, 2);
		}
	}
	else {
		System.out.println("\nOkay, respect your choice.\nSee you next time.");	
			
		new MissionIndex(0, 0, 2);
	}
	}
 }
