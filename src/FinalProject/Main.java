package FinalProject;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
* This is the whole project start.
* @author Zheng Liu
* @version 1.1
*/
public class Main {
	
	/**
	 * @serialField youWin inGame WIN flag.
	 */
	 public static boolean youWin = false;
	 static boolean failure = true;
	 static int xReal=0;
	 static int yReal=0;
	 static int setuserNotAllowGame = 0;
	 /**
	 * @serialField hp refreshHP YourHP, Sync from Game Block.
	 */
	 public static int hp;
	 static int [] inputBuffer = {0,0,0,0};
	 static int myBag[] = {0,0,0,0,0};
	 static String npcChat;
	 
	 /**
	   * This method is main.
	   * If not failure will in the loop.
	   * @param args Main Output.
	   */
	 public static void main (String[] args) {
		JFrame f = new JFrame();
		Scanner getUser = new Scanner(System.in);
		ReCheck warning = new ReCheck();
		
		while (failure == true) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("                 Welcome ZLahxQYL Game!!!!");  
			System.out.println("-----------------------------------------------------------");
			System.out.println("Are You Ready?");
			System.out.println("1. Start Game!");
			System.out.println("2. Log Out!");
			System.out.println("-----------------------------------------------------------");
			System.out.println("INPUT YOUR CHOOSE:");
			int gameStartInput = getUser.nextInt();
			if (gameStartInput == 1) {
				xReal=3;
				yReal=3;
				hp = 100;
				failure = false;
				System.out.println("Let's Start the Game.\nThe game has started, now please pay attention to the map output from the console."); 
				warning.needYes();
				inGame();
			} else {
				failure = false;
			}
		}
		
		if (youWin == true) {
			warning.warning();
	    	JOptionPane.showMessageDialog(f,"Congratulations! ! you win! !"); 
			System.out.println("Good Job!!");
		}
		warning.warning();
		JOptionPane.showMessageDialog(f,"See You! !"); 
		System.out.println("BYE BYE");
		System.exit(0);
	}
	
	/**
	  * This method is when you are in the Game.
	  * If fail you will go to the main menu.
	  * If not will in the loop (no result Like no WIN/Fail).
	  */
	public static void inGame() { //IN Game
		ReCheck warning = new ReCheck();
	    while (youWin == false & failure == false) {
	    	if (failure == false) {
	    		new MissionIndex(xReal, yReal, 0);
		    	backPreviousPoint();
		    	drawMap(xReal,yReal);
		    	navigationPannel();
	    	} else {
	    		warning.warning();
		    	JOptionPane.showMessageDialog(null,"You are DIE!!!\nYou will back Game Center, now."); 
	    	}

	    }
	    
	    if (failure == true) {
	    	warning.warning();
	    	JOptionPane.showMessageDialog(null,"You are DIE!!!\nYou will back Game Center, now."); 
	    }
	}
	
	/**
	  * This method is Draw MAP.
	  * All items input 9 means reset BAG. (Use it when you Died)
	  * @param xReal Map coordinate X-axis.
	  * @param yReal Map coordinate Y-axis.
	  */
	public static void drawMap (int xReal, int yReal) {	//DRAW MAP
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
						}else if (c == 0 & line == 2 & b == 0) {
							System.out.print(" RIVER CROSS |");
						}else if (c == 0 & line == 2 & b == 4) {
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
						}else if (c == 2 & line == 4 & b == 4) {
							System.out.print(" ITEM:  HERB |");
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

	}
	
	/**
	  * This method is NavigationPanel (Control+SHOW HP+SHOW NPC CHAT+Show items' status).
	  * Use input 1-4 to move your location (xReal and yReal)
	  * HP LINE 1#=2 HP
	  * inputBuffer is use to store the last your doing, method backPreviousPoint need it.
	  */
	public static void navigationPannel() {	//Control Panel + Show Something
    	Scanner input=new Scanner(System.in);
		System.out.println("\n-----------------------------------------------------------");
		System.out.println("                           My Bag");
		System.out.println("-----------------------------------------------------------");
		Items.bagOutput();
		System.out.println("-----------------------------------------------------------");
		System.out.print("HP: ");
		System.out.print("|");
		int drawHp = hp/2;
		for (int hpPrint=0;hpPrint<drawHp;hpPrint++) {
			System.out.print("#");
		}
		for (int emptySpace=0; emptySpace<50-drawHp; emptySpace++) {
			System.out.print(" ");
		}
		System.out.print("|");
		System.out.println(hp);
		System.out.println("-----------------------------------------------------------");
		System.out.println("                        NPC chat box                       ");
		Npc npcChat = new Npc();
		npcChat.npc(xReal, yReal);
		npcChat.npcOutput();
		System.out.println("-----------------------------------------------------------");
        if (youWin == false & failure == false) {
        	System.out.println("\nEnter 1 to North");
        	System.out.println("Enter 2 to South");
        	System.out.println("Enter 3 to West");
        	System.out.println("Enter 4 to East");
        	myBag = Items.yourBag;
        	if (myBag[3]==1) {
            	System.out.println("Enter 5 to use Herb. Make HP up tp 100");
        	}
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
			case 5:
				if (myBag[3]==1) {
					hp = 100;
				}
				break;
			}
        }
        ProhibitedArea.prohibitedArea(xReal, yReal);	//Block block, In DEBUG, Annotation this line.
	}
	
	/**
	  * This method is to change back your location.
	  * In the game when you do not allow in the BLOCK you will back the previous point.
	  */
	public static void backPreviousPoint() {	// IF GAME FILE NEED BACK PREVIOUS POINT FLAG: setuserNotAllowGame
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
		if (failure == false & setuserNotAllowGame == 1) {
			new MissionIndex(xReal,yReal,1);
		}
	}
	
	/**
	  * This method is changed status and active back previous point.
	  * @param userNotAllowGame needs back previous point (If want back enter 1). 
	  */
	public static void keepGoingORnot(int userNotAllowGame) {
		if (userNotAllowGame == 1) {
			setuserNotAllowGame = 1;
		} else {
			setuserNotAllowGame = 0;
		}
	}
	
	/**
	  * This method is to refresh HP.
	  * And if HP=0 Finish the game and reset.
	  * @param nowHP The last back HP. From game block.
	  */
	public static void refreshHP(int nowHP) {	//REFRESH HP
		if (nowHP > 0) {
			hp = nowHP;
		} else {
			hp = 0;
			failure = true;
			StageClear.statusCode(9, 9); //reset stage
			Items.Items(9, 9, 9, 9, 9);		//reset all items
		}
	}
	
}


