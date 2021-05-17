package gameBlock;

import javax.swing.JOptionPane;

import FinalProject.items;
import FinalProject.reCheck;

public class cottage {
	
	public cottage () {
		reCheck warning = new reCheck();
		warning.warning();
	    JOptionPane.showMessageDialog(null,"Hello, You found a sword."); 
	    warning.warning();
	    int userFeedback = JOptionPane.showConfirmDialog(null,"Do you want pick it up? \nSword will increase your attack power。","Permission",JOptionPane.YES_NO_OPTION);
		if (userFeedback == 0) {
			items.items(0, 0, 1, 0, 0);
			System.out.println("\nGreat. You got it.");
		} else {
			System.out.println("\nOkay, you are welcome to come back and take me at any time.");
		}
	}

}
