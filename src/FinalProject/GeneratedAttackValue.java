package FinalProject;

import java.util.Random;

/**
* Generate all attack value in this Game
* @author Zheng Liu
* @version 1.1
*/
public class GeneratedAttackValue {
	
	int [] myBag = {0,0,0,0,0};
	/**
	 *  attackPower Used to another place this is the attack power.
	 */
	public int attackPower = 0;
	
	/**
	 * This method is only a tips to user.
	 * Are you have a Sword?
	 */
	public void AttackTips () { 
		myBag = Items.yourBag;
		ReCheck warning = new ReCheck();
	    if (myBag [2] == 1) {
	    	System.out.println("TIPS: You have a sword, and your attack power is locked between 10 and 20. ");
	    } else {
	    	System.out.println("TIPS: You don't have a sword, and your attack power is locked within 10. "); 
	    }
	    warning.needYes();
	}
	
	/**
	  * This method is Generate attack value.
	  * @param difficult If the NpcOrUser input is NPC this value is addition attack power.
	  * @param NpcOrUser If the value = 0 mean this is NPC, if the value = 1 mean this is USER.
	  * @return attackPower Return the random number for the attack power.
	  */
	public int GeneratedValue (int difficult, int NpcOrUser) {
		myBag = Items.yourBag;
		if (NpcOrUser == 1 & myBag [2] == 1) {
			attackPower = new Random().nextInt(10) + 11;
		} else if (NpcOrUser == 1 & myBag [2] == 0) {
			attackPower = new Random().nextInt(10) + 1;
		} else if (NpcOrUser == 0) {
			attackPower = new Random().nextInt(10) + 1 + difficult;
		}	
		return attackPower;
	}
}
