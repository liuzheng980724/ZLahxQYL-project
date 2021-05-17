package gameBlock;

/**
* Game Block: River Crossing
* @author Zheng Liu
* @version 1.1
*/

import javax.swing.JOptionPane;

import FinalProject.items;
import FinalProject.missionIndex;
import FinalProject.reCheck;

public class riverCrossing {
	
	int [] myBag = {0,0,0,0,0};

	public riverCrossing() {
		reCheck warning = new reCheck();
		myBag = items.yourBag;
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
				new missionIndex(0, 0, 2);
			}
		}
		else {
			System.out.println("\nOkay, respect your choice.");	
			System.out.println("See you next time.");	
			new missionIndex(0, 0, 2);
		}
	}
}
