package FinalProject;

/*
 * This is all game block INDEX file. NEED X Y
 */
import javax.swing.JOptionPane;

import gameBlock.*;

public class missionIndex {
	int userFeedback;
	int clearStage[] = {0,0};
	int myBag[] = {0,0,0,0,0};
	
	public missionIndex(int xReal, int yReal, int reset) {
		reCheck warning = new reCheck();
		myBag = items.yourBag;
		clearStage = statusCode.clearStage;
		int location = yReal*10 + xReal;
		if (reset == 1) {
			main.keepGoingORnot(0);
		}
		if (reset == 2) {
			System.out.println("\nTeleport back to the previous location.");
			main.keepGoingORnot(1);
		}
		
		switch (location) {
			case  11: 
				if (myBag [1] == 0) {
					System.out.println("\nStart transferring");
					new cliff_edge();
				}
				break;
			case 13:
				System.out.println("\nStart transferring");
				new dungeon();
				break;
			case 14:
				if (clearStage [1] == 0 || myBag[4] == 0) {
					if (xReal == 4 & yReal == 1 & reset == 0) {
						System.out.println("\nStart transferring");
						new dragon();
					}
				}
				break;
			case 15:
				System.out.println("\nStart transferring");
				new castle();
				break;
			case 32:
				warning.warning();
				userFeedback = JOptionPane.showConfirmDialog(null,"Welcome! River Crossing. \nDo you start entering the level?","Permission",JOptionPane.YES_NO_OPTION);
				if (userFeedback == 0) {
					System.out.println("\nStart transferring");
					new riverCrossing();
				} else {
					System.out.println("\nTeleport back to the previous location.");
					main.keepGoingORnot(1);
				}
				break;
			case 34:
				if (clearStage [0] == 0) {
					warning.warning();
					userFeedback = JOptionPane.showConfirmDialog(null,"Welcome! Forest Trail. \nDo you start entering the level?","Permission",JOptionPane.YES_NO_OPTION);
					if (userFeedback == 0) {
						System.out.println("\nStart transferring");
						new forestTrail();
					}
					else {
						System.out.println("\nTeleport back to the previous location.");
						main.keepGoingORnot(1);
					}
				}
				break;
			case 44:
				if (myBag [2] == 0) {
					warning.warning();
					userFeedback = JOptionPane.showConfirmDialog(null,"Welcome! Cottage. \nDo you start entering the level?","Permission",JOptionPane.YES_NO_OPTION);
					if (userFeedback == 0) {
						System.out.println("\nStart transferring");
						new cottage();
					}
					else {
						System.out.println("\nTeleport back to the previous location.");
						main.keepGoingORnot(1);
					}
				}
				break;
			case 53:
				if (myBag [0] == 0) {
					System.out.println("\nStart transferring");
					new lakeShore();
				}
				break;
			case 54:
				if (myBag [3] == 0) {
					System.out.println("\nStart transferring");
					new rockPath();	
				}
				break;
			case 55:
				System.out.println("\nStart transferring");
				new mountainRange();
				break;
		}
	}
	
}
