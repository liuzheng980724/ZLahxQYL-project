package gameBlock;

import javax.swing.JOptionPane;

import FinalProject.items;

public class cottage {
	
	public static void gamestart () {
	    JOptionPane.showMessageDialog(null,"Hello, You found a sword."); 
	    int userFeedback = JOptionPane.showConfirmDialog(null,"Do you want pick it up? \nSword will increase your attack power。","Permission",JOptionPane.YES_NO_OPTION);
		if (userFeedback == 0) {
			items.bag(0, 0, 1, 0, 0);
			System.out.println("\nGreat. You got it.");
		} else {
			System.out.println("\nOkay, you are welcome to come back and take me at any time.");
		}
	}

}
