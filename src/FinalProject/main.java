package FinalProject;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class main {
	
	 private static boolean youWin = false;
	 static int maploadDone = 0;
	 static int xReal=0;
	 static int yReal=0;
	 
	public static void main (String[] args) {
		xReal=3;
		yReal=3;
	    JFrame f = new JFrame();  
	    JOptionPane.showMessageDialog(f,"Hello, Let's Start the Game."); 
		System.out.println("MAP Start");
	    drawMap(xReal,yReal);
	    if (maploadDone == 1) {
	    	JOptionPane.showMessageDialog(f,"The game has started, now please pay attention to the map output from the console."); 
	    }
	    else {
	    	JOptionPane.showMessageDialog(f,"ERROR!!! MAP cannot Load."); 
	    }
		System.out.println("\nMAP END");
	    while (youWin == true) {
	    	navigationPannel();
	    	drawMap(xReal,yReal);
	    }
    	JOptionPane.showMessageDialog(f,"Congratulations! ! you win! !"); 
	}
	
	public static int drawMap (int xReal, int yReal) {
		int gridFinal = 5;
		int totalLine = 5;
		int haveDraw = 0;
		System.out.print("|-------------|");
		for (int a = 0;a < gridFinal-1;a++ ) {
			System.out.print("-------------|");
		}
		for (int line = 0;line < totalLine;line++ ) {
			for (int b = 0;b < gridFinal;b++ ) {
				System.out.print("\n");
				
				if(b==2 & line==yReal-1 & xReal == 1) {
					System.out.print("|You Are Here!|");
					haveDraw = 1;
				}
				else {
					System.out.print("|             |");
				}

				for (int c = 0;c < gridFinal-1;c++ ) {
					if(b==2 & line==yReal-1 & haveDraw == 0 & c == xReal-2) {
						System.out.print("You Are Here!|");
					}
					else {
						System.out.print("             |");
					}
				}
			}					
			System.out.print("\n");
			System.out.print("|-------------|");
			for (int d = 0;d < gridFinal-1;d++ ) {
				System.out.print("-------------|");
			}		
		}
		return maploadDone = 1;
	}
	
	public static void navigationPannel() {
        Scanner input=new Scanner(System.in);
        System.out.println("\nEnter 1 to North");
        System.out.println("Enter 2 to South");
        System.out.println("Enter 3 to West");
        System.out.println("Enter 4 to West");
        System.out.println("INPUT YOUR CHOOSE:");
        int userInput = input.nextInt();
        int navigation = userInput;
        switch (navigation) {
		case 1:
			yReal--;
			break;
		case 2:
			yReal++;
			break;
		case 3:
			xReal--;
			break;
		case 4:
			xReal++;
			break;
		}
        input.close();
		System.out.println("yReal=" + yReal);
		System.out.println("xReal=" + xReal);
	}
	
}
