package gameBlock;

import javax.swing.JOptionPane;

public class mountainRange {
	
	public static void gamestart () {
	    JOptionPane.showMessageDialog(null,"Hello, You found a Mountain Range."); 
	    int userFeedback = JOptionPane.showConfirmDialog(null,"Do you want to challenge this Mountain Range? ","Permission",JOptionPane.YES_NO_OPTION);
		if (userFeedback == 0) {
			System.out.println("\nOkay, You can't climb this mountain because it is too high. ");
			System.out.println("\nWelcome to the next challenge.");
		} else {
			System.out.println("\nOkay, welcome to the next challenge.");
		}
	}

}