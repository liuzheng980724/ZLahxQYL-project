package FinalProject;

import javax.swing.JOptionPane;

import gameBlock.*;

/**
* Index all Block Game.
* @author Zheng Liu
* @version 1.1
*/
public class MissionIndex {
	int userFeedback;
	int clearStage[] = {0,0};
	int myBag[] = {0,0,0,0,0};
	
	/**
	  * This method is INDEX all game block.
	  * According to the coordinates of the current user to the correct Game Block.
	  * @param xReal User coordinate X axis.
	  * @param yReal User coordinate Y axis.
	  * @param reset Activate the user to return to the previous point.
	  */
	public MissionIndex(int xReal, int yReal, int reset) {
		ReCheck warning = new ReCheck();
		myBag = Items.yourBag;
		clearStage = StageClear.clearStage;
		int location = yReal*10 + xReal;
		if (reset == 1) {
			Main.keepGoingORnot(0);
		}
		if (reset == 2) {
			System.out.println("\nTeleport back to the previous location.");
			Main.keepGoingORnot(1);
		}
		
		switch (location) {
			case 11: 
				if (myBag [1] == 0) {
					new Scene(location);
				}
				break;
			case 13:
				System.out.println("\nStart transferring");
				new Dungeon();
				break;
			case 14:
				if (clearStage [1] == 0 || myBag[4] == 0) {
					new Scene(location);
				}
				break;
			case 15:
				System.out.println("\nStart transferring");
				new Castle();
				break;
			case 32:
				warning.warning();
				userFeedback = JOptionPane.showConfirmDialog(null,"Welcome! River Crossing. \nDo you start entering the level?","Permission",JOptionPane.YES_NO_OPTION);
				if (userFeedback == 0) {
					System.out.println("\nStart transferring");
					new RiverCrossing();
				} else {
					System.out.println("\nTeleport back to the previous location.");
					Main.keepGoingORnot(1);
				}
				break;
			case 34:
				if (clearStage [0] == 0) {
					new Scene(location);
				}
				break;
			case 44:
				if (myBag [2] == 0) {
					new Scene(location);
				}
				break;
			case 53:
				if (myBag [0] == 0) {
					new Scene(location);
				}
				break;
			case 54:
				if (myBag [3] == 0) {
					new Scene(location);
				}
				break;
			case 55:
				System.out.println("\nStart transferring");
				new MountainRange();
				break;
		}
	}
	
}
