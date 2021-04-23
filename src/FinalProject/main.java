package FinalProject;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class main {
	
	 private static boolean youWin = false;
	 static int maploadDone = 0;
	 static int xReal=0;
	 static int yReal=0;
	 static int setuserNotAllowGame = 0;
	 static int setreprintMAP = 0;
	 static int [] inputBuffer = {0,0,0,0};
	 
	public static void main (String[] args) {
		xReal=3;
		yReal=3;
	    JFrame f = new JFrame();
	    JOptionPane.showMessageDialog(f,"Hello, Let's Start the Game."); 
	    JOptionPane.showMessageDialog(f,"The game has started, now please pay attention to the map output from the console."); 
	    while (youWin == false) {
	    	missionIndex.index(xReal, yReal, 0);
	    	backPreviousPoint();
	    	drawMap(xReal,yReal);
	    	navigationPannel();
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
		System.out.println("setreprintMAP=" + setreprintMAP);	//DEBUG USE
        Scanner input=new Scanner(System.in);
        System.out.println("\nEnter 1 to North");
        System.out.println("Enter 2 to South");
        System.out.println("Enter 3 to West");
        System.out.println("Enter 4 to East");
        System.out.println("INPUT YOUR CHOOSE:");
        int userInput = input.nextInt();
        int navigation = userInput;
        switch (navigation) {
		case 1:
			yReal--;
			inputBuffer[0] = 1;
			break;
		case 2:
			yReal++;
			inputBuffer[1] = 1;
			break;
		case 3:
			xReal--;
			inputBuffer[2] = 1;
			break;
		case 4:
			xReal++;
			inputBuffer[3] = 1;
			break;
		}
		System.out.println("yReal=" + yReal);	//DEBUD USE
		System.out.println("xReal=" + xReal);	//DEBUD USE
	}
	
	public static void getstatus (int userNotAllowGame, int reprintMAP) {
		setuserNotAllowGame = userNotAllowGame;
		setreprintMAP = reprintMAP;	
	}
	
	public static void backPreviousPoint() {
		if (setuserNotAllowGame == 1) {	
			if (inputBuffer[0] == 1) {
				yReal++;
			}
			if (inputBuffer[1] == 1) {
				yReal--;
			}
			if (inputBuffer[2] == 1) {
				xReal++;
			}
			if (inputBuffer[3] == 1) {
				xReal--;
			}
		}
		inputBuffer [0] = 0;
		inputBuffer [1] = 0;
		inputBuffer [2] = 0;
		inputBuffer [3] = 0;
		missionIndex.index(xReal,yReal,1);
	}
}
