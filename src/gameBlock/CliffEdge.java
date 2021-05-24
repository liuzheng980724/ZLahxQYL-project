package gameBlock;

import javax.swing.JOptionPane;

import FinalProject.Items;
import FinalProject.ReCheck;

/**
* Game Block: Cliff Edge
* @author Qiyuan Luo
* @version 1.0
*/
public class CliffEdge {
	
	/**
	  * Start this part of game.
	  * Get item: CAMP
	  */
	public CliffEdge () {
		ReCheck warning = new ReCheck();
		warning.warning();
	    JOptionPane.showMessageDialog(null,"Hello, You found a camp."); 
	    int userFeedback = JOptionPane.showConfirmDialog(null,"Do you want pick it up? \nCamp may be helpful to you.","Permission",JOptionPane.YES_NO_OPTION);
		if (userFeedback == 0) {
			Items.Items(0, 1, 0, 0, 0);
			System.out.println("\nGreat. You got it.");
		} else {
			System.out.println("\nOkay, you are welcome to come back and take me at any time.");
		}
		
}
}