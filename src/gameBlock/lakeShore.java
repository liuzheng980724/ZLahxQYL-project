package gameBlock;

import javax.swing.JOptionPane;

import FinalProject.items;
import FinalProject.reCheck;

/**
* Game Block: Lake Shore
* @author Ao Hua Xu
* @version 1.0
*/
public class lakeShore{
	
	/**
	  * Start this part of game.
	  * Get item: Shell
	  */
	public lakeShore () {
		reCheck warning = new reCheck();
		warning.warning();
	    int userFeedback = JOptionPane.showConfirmDialog(null,"Hello, Welcome to this lake shore! \nThere are many shells here.\nDo you want pick it up? \nShells can be used to buy tickets.","Permission",JOptionPane.YES_NO_OPTION);
		if (userFeedback == 0) {
			items.items(1, 0, 0, 0, 0);
			System.out.println("\nGreat. You got it.");
		} else {
			System.out.println("\nOkay, you are welcome to come back and gather the shells again.");
		}
	}

}
