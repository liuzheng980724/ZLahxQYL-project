package gameBlock;

import javax.swing.JOptionPane;

import FinalProject.reCheck;

public class mountainRange {
	
	public static void gamestart () {
		reCheck.warning();
	    int userFeedback = JOptionPane.showConfirmDialog(null,"Hello, You found a Mountain Range./nDo you want to challenge this Mountain Range? ","Permission",JOptionPane.YES_NO_OPTION);
		if (userFeedback == 0) {
			System.out.println("\nOkay, You can't climb this mountain because it is too high. ");
			System.out.println("\nWelcome to the next challenge.");
		} else {
			System.out.println("\nOkay, welcome to the next challenge.");
		}
	}

}