package FinalProject;

import javax.swing.JOptionPane;

import gameBlock.*;

public class missionIndex {
	static int userFeedback;
	public static int userNotAllowGame = 0;
	public static int clearStage[] = {0,0};
	public static int myBag[] = {0,0,0};
	
	public static int index(int xReal, int yReal, int reset) {
		myBag = items.yourBag;
		clearStage = statusCode.clearStage;
		if (reset == 1) {
			userNotAllowGame = 0;
		}
		if (reset == 2) {
			System.out.println("\nTeleport back to the previous location.");
			userNotAllowGame = 1;
			return userNotAllowGame;
		}
		if (xReal == 3 & yReal == 2 & reset == 0) {
			userFeedback = JOptionPane.showConfirmDialog(null,"Welcome! River Crossing. \nDo you start entering the level?","Permission",JOptionPane.YES_NO_OPTION);
			if (userFeedback == 0) {
				System.out.println("\nStart transferring");
				riverCrossing.gamestart();
			}
			else {
				System.out.println("\nTeleport back to the previous location.");
				userNotAllowGame = 1;
			}
		}
		
		if (xReal == 4 & yReal == 3 & reset == 0) {
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
		}
		if (xReal == 4 & yReal == 4 & reset == 0) {
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
		}
		if (xReal == 2 & yReal == 1 & reset == 0) {
				System.out.println("\nStart transferring");
				cobblestone.gamestart();
		}
		if (xReal == 1 & yReal == 1 & reset == 0) {
			System.out.println("\nStart transferring");
			cliff_edge.camp();
		}
		if (xReal == 3 & yReal == 1 & reset == 0) {
			System.out.println("\nStart transferring");
			dungeon.gamestart();
		}
		if (xReal == 3 & yReal == 5 & reset == 0) {
			System.out.println("\nStart transferring");
			lakeShore.gamestart();
		}
		if (clearStage [1] == 0) {
			if (xReal == 4 & yReal == 1 & reset == 0) {
				System.out.println("\nStart transferring");
				dragon.gamestart();
			}
		}
		if (xReal == 4 & yReal == 5 & reset == 0) {
			System.out.println("\nStart transferring");
			rockPath.gamestart();
		}
		if (xReal == 5 & yReal == 1 & reset == 0) {
			System.out.println("\nStart transferring");
			castle.gamesend();
		}
		if (xReal == 5 & yReal == 5 & reset == 0) {
			System.out.println("\nStart transferring");
			mountainRange.gamestart();
		}
		//System.out.println(userNotAllowGame); //DEBUD USE
		return userNotAllowGame;
	}
	
}
