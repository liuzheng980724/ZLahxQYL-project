package FinalProject;

import javax.swing.JOptionPane;

import gameBlock.*;

public class missionIndex {
	static int userFeedback;
	public static int userNotAllowGame = 0;
	public static int clearStage[] = {0,0};
	public static int myBag[] = {0,0,0};
	
	public static int missionIndex(int xReal, int yReal, int reset) {
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
		switch (xReal) {
			case 1:
				switch (yReal) {
					case 1:
						System.out.println("\nStart transferring");
						cliff_edge.camp();
						break;
					case 2:
						
						break;
					case 3:
						
						break;
					case 4:
						
						break;
					case 5:
						
						break;
				}
				break;
			case 2:
				switch (yReal) {
				case 1:
					
					break;
				case 2:
					System.out.println("\nStart transferring");
					cobblestone.gamestart();
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				}
				break;
			case 3:
				switch (yReal) {
				case 1:
					System.out.println("\nStart transferring");
					dungeon.gamestart();
					break;
				case 2:
					userFeedback = JOptionPane.showConfirmDialog(null,"Welcome! River Crossing. \nDo you start entering the level?","Permission",JOptionPane.YES_NO_OPTION);
					if (userFeedback == 0) {
						System.out.println("\nStart transferring");
						riverCrossing.gamestart();
					}
					else {
						System.out.println("\nTeleport back to the previous location.");
						userNotAllowGame = 1;
					}
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					if (myBag [0] == 0) {
						System.out.println("\nStart transferring");
						lakeShore.gamestart();
					}
					break;
				}
				break;
			case 4:
				switch (yReal) {
				case 1:
					if (clearStage [1] == 0) {
						if (xReal == 4 & yReal == 1 & reset == 0) {
							System.out.println("\nStart transferring");
							dragon.gamestart();
						}
					}
					break;
				case 2:
					
					break;
				case 3:
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
				case 4:
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
				case 5:
					if (myBag [3] == 0) {
						System.out.println("\nStart transferring");
						rockPath.gamestart();	
					}
					break;
				}
				break;
			case 5:
				switch (yReal) {
				case 1:
					System.out.println("\nStart transferring");
					castle.gamesend();
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					System.out.println("\nStart transferring");
					mountainRange.gamestart();
					break;
				}
				break;
		}
		return userNotAllowGame;
	}
	
}
