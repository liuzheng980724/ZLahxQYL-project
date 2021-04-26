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
	 public static int myBag[] = {0,0,0};
	 
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
					if (line == 0 & b == 0) {
						System.out.print("|CLIFF'S  EDGE|");
					}else if (line == 0 & b == 4) {
						System.out.print("| ITEM:  CAMP |");
					}else {
					System.out.print("|             |");
					}
				}

				for (int c = 0;c < gridFinal-1;c++ ) {
					if(b==2 & line==yReal-1 & haveDraw == 0 & c == xReal-2) {
						System.out.print("You Are Here!|");
					}
					else {
						if (c == 0 & line == 0 & b == 0) {
							System.out.print("COBSTONE PATH|");
						}else if (c == 1 & line == 0 & b == 0) {
							System.out.print("DARK  DUNGEON|");
						}else if (c == 1 & line == 0 & b == 4) {
							System.out.print(" NEED CAMP!! |");
						}else if (c == 2 & line == 0 & b == 0) {
							System.out.print("   DRAGON!   |");
						}else if (c == 2 & line == 0 & b == 4) {
							System.out.print(" MUST DEFEAT |");
						}else if (c == 3 & line == 0 & b == 0) {
							System.out.print("   CASTLE!   |");
						}else if (c == 3 & line == 0 & b == 4) {
							System.out.print(" (WIN POINT) |");
						}else if (c == 0 & line == 1 & b == 0) {
							System.out.print("GRASSY  PLAIN|");
						}else if (c == 1 & line == 1 & b == 0) {
							System.out.print(" RIVER CROSS |");
						}else if (c == 1 & line == 1 & b == 4) {
							System.out.print(" NEED  SHELL |");
						}else if (c == 1 & line == 2 & b == 0) {
							System.out.print("ENCHANT WOODS|");
						}else if (c == 1 & line == 2 & b == 4) {
							System.out.print("(START POINT)|");
						}else if (c == 2 & line == 2 & b == 0) {
							System.out.print("FOREST  TRAIL|");
						}else if (c == 2 & line == 2 & b == 4) {
							System.out.print("   BEAR!!!   |");
						}else if (c == 2 & line == 3 & b == 0) {
							System.out.print("   COTTAGE   |");
						}else if (c == 2 & line == 3 & b == 4) {
							System.out.print(" ITEM: SWORD |");
						}else if (c == 2 & line == 4 & b == 0) {
							System.out.print(" ROCKY  PATH |");
						}else if (c == 1 & line == 4 & b == 0) {
							System.out.print(" LAKE  SHORE |");
						}else if (c == 1 & line == 4 & b == 4) {
							System.out.print(" ITEM: SHELL |");
						}else if (c == 3 & line == 4 & b == 0) {
							System.out.print("MOUNTAINRANGE|");
						}else if (c == 3 & line == 4 & b == 4) {
							System.out.print(" IMPASSABLE! |");
						}else{						
						System.out.print("             |");
						}
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
		String shellGet, campGet, swordGet;
		if (myBag[0]==1) {
			shellGet = "You have it";			
		}
		else {
			shellGet = "You haven't gotten";			
		}
		
		if (myBag[1]==1) {
			campGet = "You have it";			
		}
		else {
			campGet = "You haven't gotten";			
		}
		
		if (myBag[2]==1) {
			swordGet = "You have it";			
		}
		else {
			swordGet = "You haven't gotten";			
		}
		
		System.out.println("\n-----------------------------------------------------");
		System.out.println("                      My Bag");
		System.out.println("-----------------------------------------------------");

		System.out.println("ITEM: SHELL " + shellGet);
		System.out.println("ITEM: SWORD " + swordGet);
		System.out.println("ITEM: CAMP  " + campGet);
		System.out.println("-----------------------------------------------------");
		//System.out.println("setreprintMAP=" + setreprintMAP);	//DEBUG USE
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
	
	 public static int[] yourBag (int[] getBag) {
		 myBag = getBag;
		return myBag;
	 }
}
