package gameBlock;

import javax.swing.JOptionPane;

import FinalProject.items;

public class lakeShore{
	
	public static void gamestart () {
	    JOptionPane.showMessageDialog(null,"Hello, Welcome to this lake shore! \nThere are many shells here."); 
	    int userFeedback = JOptionPane.showConfirmDialog(null,"Do you want pick it up? \nShells can be used to buy tickets.","Permission",JOptionPane.YES_NO_OPTION);
		if (userFeedback == 0) {
			items.bag(1, 0, 0, 0, 0);
			System.out.println("\nGreat. You got it.");
		} else {
			System.out.println("\nOkay, you are welcome to come back and gather the shells again.");
		}
	}

}
