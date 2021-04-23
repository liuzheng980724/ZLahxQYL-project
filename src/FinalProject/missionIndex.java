package FinalProject;

import javax.swing.JOptionPane;

public class missionIndex {
	static int userFeedback;
	public static int userNotAllowGame = 0;
	public static int reprintMAP = 0;
	
	public static int index(int xReal, int yReal, int reset) {
		if (reset == 1) {
			userNotAllowGame = 0;
		}
		if (reset == 2) {
			System.out.println("\nTeleport back to the previous location.");
			userNotAllowGame = 1;
			backstatus();
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
		System.out.println(userNotAllowGame); //DEBUD USE
		backstatus();
		return userNotAllowGame;
	}
	
	public static void backstatus() {
		main.getstatus(userNotAllowGame, reprintMAP);
	}
}
