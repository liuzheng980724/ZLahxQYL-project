package gameBlock;

/**
* Game Block: Rock Path
* @author Ao Hua Xu
* @version 1.0
*/

import javax.swing.JOptionPane;

import FinalProject.items;
import FinalProject.reCheck;

public class rockPath {
	
	public rockPath () {
		reCheck warning = new reCheck();
		warning.warning();
	    int userFeedback = JOptionPane.showConfirmDialog(null,"Hello, Welcome to rocky path! \nWhen you finish this road, you will see a fork in the road. \nCongratulations on completing the walk.\nOn the way, you found medicinal herb. \nDo you need to take it away?","Permission",JOptionPane.YES_NO_OPTION);
		if (userFeedback == 0) {
			items.items(0, 0, 0, 1, 0);
			System.out.println("\nGreat. You got it.");
		} else {
			System.out.println("\nOkay, Welcome next time!");
		}
	}
}
