package gameBlock;

import javax.swing.JOptionPane;

import FinalProject.items;

public class cliff_edge {
	
	public static void camp () {
	    JOptionPane.showMessageDialog(null,"Hello, You found a camp."); 
	    int userFeedback = JOptionPane.showConfirmDialog(null,"Do you want pick it up? \nCamp may be helpful to you.","Permission",JOptionPane.YES_NO_OPTION);
		if (userFeedback == 0) {
			items.bag(0, 1, 0);
			System.out.println("\nGreat. You got it.");
		} else {
			System.out.println("\nOkay, you are welcome to come back and take me at any time.");
		}
		
}
}