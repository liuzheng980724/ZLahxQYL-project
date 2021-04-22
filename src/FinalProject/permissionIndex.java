package FinalProject;

import javax.swing.JOptionPane;

public class permissionIndex {
	static int userFeedback;
	public static int userNotAllowGame = 0;
	public static int reprintMAP = 0;
	
	public static int index(int xReal, int yReal, int resetUNAG, int resetPMAP) {
		if (resetUNAG == 1) {
			userNotAllowGame = 0;
			if (resetPMAP == 1) {
				reprintMAP = 0;
			}
		}
		if (xReal == 3 & yReal == 2 & resetUNAG == 0) {
			userFeedback = JOptionPane.showConfirmDialog(null,"Welcome! River Crossing. \nDo you start entering the level?","Permission",JOptionPane.YES_NO_OPTION);
			if (userFeedback == 0) {
				System.out.println("\nStart transferring");
				riverCrossing.gamestart();
			}
			else {
				System.out.println("\nTeleport back to the previous location.");
				userNotAllowGame = 1;
				reprintMAP = 1;
			}
		}
		System.out.println(userNotAllowGame); //DEBUD USE
		backstatus();
		return userNotAllowGame;
	}
	
	public static void backstatus() {
		main.getstatus(userNotAllowGame, reprintMAP);
	}
}
