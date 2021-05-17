package FinalProject;

import javax.swing.JOptionPane;

public class prohibitedArea {
	public static void prohibitedArea(int x, int y) {
		if (x <= 5 & x > 0 & y <= 5 & y > 0) {
			if ((x == 1 & y == 2)|(x == 4 & y == 2)|(x == 5 & y == 2)|(x == 1 & y == 3)|(x == 3 & y == 2)|(x == 5 & y == 3)|(x == 1 & y == 4)|(x == 2 & y == 4)|(x == 3 & y == 4)|(x == 5 & y == 4)|(x == 1 & y == 5)|(x == 2 & y == 5)) {
				reCheck.warning();
				JOptionPane.showMessageDialog(null,"x="+x+", y="+y+" is prohibited block!");
				missionIndex.missionIndex(0, 0, 2);
			}
		} else {
			reCheck.warning();
			JOptionPane.showMessageDialog(null,"Exceed the map size!");
			missionIndex.missionIndex(0, 0, 2);
		}
	}
}
