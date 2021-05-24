package gameBlock;

import javax.swing.JOptionPane;

import FinalProject.Items;
import FinalProject.MissionIndex;
import FinalProject.ReCheck;

/**
* Game Block: River Crossing
* @author Zheng Liu
* @version 1.1
*/
public class RiverCrossing {
	
	int [] myBag = {0,0,0,0,0};
	
	/**
	  * Start this part of game.
	  * Need item: Shell. If not not allow pass.
	  */
	public RiverCrossing() {
		ReCheck warning = new ReCheck();
		myBag = Items.yourBag;
		warning.warning();
		int userFeedback = JOptionPane.showConfirmDialog(null,"Welcome! River Crossing. \nDo you want use boat to Cross the river?","Permission",JOptionPane.YES_NO_OPTION);
		if (userFeedback == 0) {
			System.out.println("\nGreat. Use boat we need you have shell.");
			if (myBag [0] == 1) {
				System.out.println("\nGreat. You have shell, now you can keep going.");
			}
			else {
				System.out.println("\nHey. We cannot find you have shell. We cannont help you. You have to back now.");
				warning.needYes();
				new MissionIndex(0, 0, 2);
			}
		}
		else {
			System.out.println("\nOkay, respect your choice.");	
			System.out.println("See you next time.");	
			new MissionIndex(0, 0, 2);
		}
	}
}
