package FinalProject;

import javax.swing.JOptionPane;

public class riverCrossing {
	
	static int [] myBag = {0,0,0};

	public static void gamestart() {
		Inventory.returnBag();
		int userFeedback = JOptionPane.showConfirmDialog(null,"Welcome! River Crossing. \nDo you want use boat to Cross the river?","Permission",JOptionPane.YES_NO_OPTION);
		if (userFeedback == 0) {
			System.out.println("\nGreat. Use boat we need you have shell.");
			if (myBag [0] == 1) {
				System.out.println("\nGreat. You have shell, now you can keep going.");
			}
			else {
				System.out.println("\nHey. We cannot find you have shell. We cannont help you.");
				missionIndex.index(0, 0, 2);
			}
		}
		else {
			System.out.println("\nOkay, respect your choice.");	
			System.out.println("See you next time.");	
			missionIndex.index(0, 0, 2);
		}
	}
	
	 public static int[] yourBag (int[] getBag) {
		 myBag = getBag;
		return myBag;
	 }

}