package FinalProject;

import java.util.Random;

import javax.swing.JOptionPane;

public class dragon {
	static int passGame = 0;
	static int dragonHP = 100;
	static int myHP = 100;
	static int dragonAttackPower;
	static int myAttackPower;
	static int [] myBag = {0,0,0};
	
	public static int gamestart () {
	    JOptionPane.showMessageDialog(null,"Hello, warrior."); 
	    JOptionPane.showMessageDialog(null,"You can't pass here."); 
	    JOptionPane.showMessageDialog(null,"Now you will die here."); 
	    Inventory.returnBag();
	    if (myBag [2] == 1) {
	    	JOptionPane.showMessageDialog(null,"You have a sword, and your attack power is locked between 10 and 20. ");
	    } else {
		    JOptionPane.showMessageDialog(null,"You don't have a sword, and your attack power is locked within 10. "); 
	    }
		System.out.println("\nYou are in battle.");
		System.out.println("\nPlease Wait...");
		while (dragonHP > 0 & myHP > 0) {
			creatdragonAttackPower();
			creatMyAttackPower();
			System.out.println("In Battle");
			dragonHP = dragonHP - myAttackPower;
			myHP = myHP - dragonAttackPower;
			System.out.println("dragonAttackPower " + dragonAttackPower);
			System.out.println("myAttackPower " + myAttackPower);
			System.out.println("dragonHP " + dragonHP);
			System.out.println("myHP " + myHP);
		}
		if (dragonHP > myHP) {
			JOptionPane.showMessageDialog(null,"You are died.");
			myHP = 100;
			dragonHP = 100;
			missionIndex.index(0, 0, 2);
		}else if (myHP >= dragonHP) {
		    JOptionPane.showMessageDialog(null,"You WIN the battle!"); 
		    passGame = 1;
		    statusCode.statusCode(1, 1);
		}
		

		public static int creatdragonAttackPower () {
			dragonAttackPower = new Random().nextInt(10) + 1;
			return dragonAttackPower;
		}

}