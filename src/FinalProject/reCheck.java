package FinalProject;

/*
 * SOME TIPS for JOPT
 */
import java.util.Scanner;

public class reCheck {

	public reCheck () {
        while(true){
        	Scanner areYouReady = new Scanner(System.in); 
    		System.out.println("-----------------------------------------------------------");
        	System.out.println("Do You Understand? (Enter y or Y to continue)");
        	String input = areYouReady.nextLine();
        	if(input.equals("y") || input.equals("Y")){
        		System.out.println("GOOD");
        		break;
        	}
        }
    }
   
	public static void warning () {
		System.out.println("-----------------------------------------------------------");
		System.out.println("                          Warning!!");  
		System.out.println("-----------------------------------------------------------");
		System.out.println("Here we have a pop-up window. \nIf you do not see that it may be blocked by other windows, \ntry to minimize other windows.\nYou will not allow to continue without closing the window.");
		System.out.println("-----------------------------------------------------------");
	}
}
