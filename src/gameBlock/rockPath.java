package gameBlock;

import javax.swing.JOptionPane;

import FinalProject.items;

public class rockPath {
	
	public static void gamestart () {
	    JOptionPane.showMessageDialog(null,"Hello, Welcome to rocky path! \nWhen you finish this road, you will see a fork in the road."); 
	    int userFeedback = JOptionPane.showConfirmDialog(null,"Congratulations on completing the walk.\nOn the way, you found medicinal herb. \nDo you need to take it away?","Permission",JOptionPane.YES_NO_OPTION);
		if (userFeedback == 0) {
			items.bag(0, 0, 1);
			System.out.println("\nGreat. You got it.");
		} else {
			System.out.println("\nOkay, Welcome next time!");
		}
	}

}
