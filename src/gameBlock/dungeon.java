package gameBlock;

import javax.swing.JOptionPane;

import FinalProject.items;
import FinalProject.missionIndex;

public class dungeon {
	static int [] myBag = {0,0,0};
	
	public static void gamestart () {
	int userFeedback = JOptionPane.showConfirmDialog(null,"Welcome! Dark Dungeon. \nDo you want go inside?","Permission",JOptionPane.YES_NO_OPTION);
	if (userFeedback == 0) {
		myBag = items.yourBag;
		System.out.println("\nGreat. Go Dark Dungeon we need you have camp.");
		if (myBag [1] == 1) {
			System.out.println("\nGreat. You have camp, now you can keep going.");
		}
		else {
			System.out.println("\nHey. We cannot find your camp. We cannont help you.");
			missionIndex.missionIndex(0, 0, 2);
		}
	}
	else {
		System.out.println("\nOkay, respect your choice.");	
		System.out.println("See you next time.");	
		missionIndex.missionIndex(0, 0, 2);
	}
	}
 }
