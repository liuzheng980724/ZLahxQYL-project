package gameBlock;

import FinalProject.ReCheck;

/**
* Game Block: Mountain Range
* @author Ao Hua Xu
* @version 1.0
*/
public class MountainRange {
	
	/**
	  * Start this part of the game.
	  */
	public MountainRange () {
		ReCheck warning = new ReCheck();
		System.out.println("\nOkay, You can't climb this mountain because it is too high. ");
		System.out.println("\nWelcome to the next challenge.");
		System.out.println("\nOkay, welcome to the next challenge.");
		warning.needYes();
	}

}