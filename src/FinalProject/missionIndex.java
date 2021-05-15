package FinalProject;

import javax.swing.JOptionPane;

import gameBlock.*;

public class missionIndex {
	static int userFeedback;
	public static int userNotAllowGame = 0;
	public static int clearStage[] = {0,0};
	public static int myBag[] = {0,0,0,0,0};
	
	public static int missionIndex(int xReal, int yReal, int reset) {
		myBag = items.yourBag;
		clearStage = statusCode.clearStage;
		int location = yReal*10 + xReal;
		if (reset == 1) {
			userNotAllowGame = 0;
		}
		if (reset == 2) {
			System.out.println("\nTeleport back to the previous location.");
			userNotAllowGame = 1;
			return userNotAllowGame;
		}
		
		switch (location) {
			case  11: 
				if (myBag [1] == 0) {
					System.out.println("\nStart transferring");
					cliff_edge.camp();
				}
				break;
			case 13:
				System.out.println("\nStart transferring");
				dungeon.gamestart();
				break;
			case 14:
				if (clearStage [1] == 0) {
					if (xReal == 4 & yReal == 1 & reset == 0) {
						System.out.println("\nStart transferring");
						dragon.gamestart();
					}
				}
				break;
			case 15:
				System.out.println("\nStart transferring");
				castle.gamesend();
				break;
			case 22:
				System.out.println("\nStart transferring");
				cobblestone.gamestart();
				break;
			case 32:
				userFeedback = JOptionPane.showConfirmDialog(null,"Welcome! River Crossing. \nDo you start entering the level?","Permission",JOptionPane.YES_NO_OPTION);
				if (userFeedback == 0) {
					System.out.println("\nStart transferring");
					riverCrossing.gamestart();
				} else {
					System.out.println("\nTeleport back to the previous location.");
					userNotAllowGame = 1;
				}
				break;
			case 34:
				if (clearStage [0] == 0) {
					userFeedback = JOptionPane.showConfirmDialog(null,"Welcome! Forest Trail. \nDo you start entering the level?","Permission",JOptionPane.YES_NO_OPTION);
					if (userFeedback == 0) {
						System.out.println("\nStart transferring");
						forestTrail.gamestart();
					}
					else {
						System.out.println("\nTeleport back to the previous location.");
						userNotAllowGame = 1;
					}
				}
				break;
			case 44:
				if (myBag [2] == 0) {
					userFeedback = JOptionPane.showConfirmDialog(null,"Welcome! Cottage. \nDo you start entering the level?","Permission",JOptionPane.YES_NO_OPTION);
					if (userFeedback == 0) {
						System.out.println("\nStart transferring");
						cottage.gamestart();
					}
					else {
						System.out.println("\nTeleport back to the previous location.");
						userNotAllowGame = 1;
					}
				}
				break;
			case 53:
				if (myBag [0] == 0) {
					System.out.println("\nStart transferring");
					lakeShore.gamestart();
				}
				break;
			case 54:
				if (myBag [3] == 0) {
					System.out.println("\nStart transferring");
					rockPath.gamestart();	
				}
				break;
			case 55:
				System.out.println("\nStart transferring");
				mountainRange.gamestart();
				break;
		}
		return userNotAllowGame;
	}
	
}
