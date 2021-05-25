package FinalProject;

import java.util.Scanner;

/**
* NOT IMPORTANT TIPS.
* @author Zheng Liu
* @version 1.1
*/
public class ReCheck {
	
	   /**
	   * This method is need user input y to know user finish the read.
	   */
	public void needYes () {
    	Scanner areYouReady = new Scanner(System.in); 
        while(true){
    		System.out.println("-----------------------------------------------------------");
        	System.out.println("Do You Understand? (Enter y or Y to continue)");
        	String input = areYouReady.next();
        	if(input.equals("y") || input.equals("Y")){
        		System.out.println("GOOD");
        		break;
        	} else {
        		System.out.println("Wrong Input");
        	}
        }
    }
   
	   /**
	   * This method is show warning in Console when have a pop-up windows.
	   */
	public void warning () {
		System.out.println("-----------------------------------------------------------");
		System.out.println("                          Warning!!");  
		System.out.println("-----------------------------------------------------------");
		System.out.println("Here we have a pop-up window. \nIf you do not see that it may be blocked by other windows, \ntry to minimize other windows.\nYou will not allow to continue without closing the window.");
		System.out.println("-----------------------------------------------------------");
	}
}