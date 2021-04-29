package FinalProject;

import javax.swing.JOptionPane;

public class lakeShore{
	
	public static void gamestart () {
	    JOptionPane.showMessageDialog(null,"Hello, Welcome to this lake shore! \nThere are many shells here."); 
	    int userFeedback = JOptionPane.showConfirmDialog(null,"Do you want pick it up? \nSword will increase your attack power¡£","Permission",JOptionPane.YES_NO_OPTION);
		if (userFeedback == 0) {
			Inventory.bag(0, 0, 1);
			System.out.println("\nGreat. You got it.");
		} else {
			System.out.println("\nOkay, you are welcome to come back and gather the sheels again.");
		}
	}

}
