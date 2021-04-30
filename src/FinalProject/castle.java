package FinalProject;

import javax.swing.JOptionPane;

public class castle {
	static int [] myBag = {0,0,0};
	public static void gamesend() {
		Inventory.returnBag();
		int userFeedback = JOptionPane.showConfirmDialog(null,"Welcome! castle. \nDo you want go inside?","Permission",JOptionPane.YES_NO_OPTION);
		if (userFeedback==0) {
		System.out.println("Congratulations. You win!");
		
		}
		
	}
	
}
