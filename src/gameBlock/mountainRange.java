package gameBlock;

import javax.swing.JOptionPane;

import FinalProject.reCheck;


/**
* Game Block: Mountain Range
* @author Ao Hua Xu
* @version 1.0
*/
public class mountainRange {
	
	/**
	  * Start this part of game.
	  */
	public mountainRange () {
		reCheck warning = new reCheck();
		warning.warning();
	    int userFeedback = JOptionPane.showConfirmDialog(null,"Hello, You found a Mountain Range.\nDo you want to challenge this Mountain Range? ","Permission",JOptionPane.YES_NO_OPTION);
		if (userFeedback == 0) {
			System.out.println("\nOkay, You can't climb this mountain because it is too high. ");
			System.out.println("\nWelcome to the next challenge.");
		} else {
			System.out.println("\nOkay, welcome to the next challenge.");
		}
	}

}