package gameBlock;

import javax.swing.JOptionPane;

import FinalProject.items;
import FinalProject.reCheck;

/**
* Game Block: Cliff Edge
* @author Qiyuan Luo
* @version 1.0
*/
public class cliff_edge {
	
	/**
	  * Start this part of game.
	  * Get item: CAMP
	  */
	public cliff_edge () {
		reCheck warning = new reCheck();
		warning.warning();
	    JOptionPane.showMessageDialog(null,"Hello, You found a camp."); 
	    int userFeedback = JOptionPane.showConfirmDialog(null,"Do you want pick it up? \nCamp may be helpful to you.","Permission",JOptionPane.YES_NO_OPTION);
		if (userFeedback == 0) {
			items.items(0, 1, 0, 0, 0);
			System.out.println("\nGreat. You got it.");
		} else {
			System.out.println("\nOkay, you are welcome to come back and take me at any time.");
		}
		
}
}