package FinalProject;

/*
 * NPC CHAT FILE
 */
public class npc {
	
	static String npcChat;
	static int clearStage[] = {0,0};
	static int myBag[] = {0,0,0,0,0};
	
	public static String npc (int xreal, int yreal) {
		myBag = items.yourBag;
		clearStage = statusCode.clearStage;
		int location = yreal*10 + xreal;
		switch (location) {
			case 11:
				if (myBag[1] == 0) {
					npcChat = "Thank you for believing in me! There is a camp for you, and it will help you pass the next level. Remember to take it away.";
				} else {
					npcChat = "Now, you have the CAMP. Let's go to the DARK DUNGEON.";
				}
				break;
			case 12:
				if (myBag[1] == 0) {
					npcChat = "Take this road with confidence, there is nothing here. The next level suggests that you get the CAMP first, then go to the DARK DUNGEON.";
				} else {
					npcChat = "Good. Keep Going.";
				}
				break;
			case 13:
				if (myBag[1] == 0) {
					npcChat = "You did not listen to my advice. So you can't pass this level, go back and get supplies. With a camp, you can spend the night safely in the tent.";
				} else {
					npcChat = "What a nice day!! It's time to kill the DRAGON.";
				}
				break;
			case 14:
				if (myBag[2] == 0) {
					npcChat = "This is a very difficult level. You have to get sword first. ";
				} else if (clearStage[1] == 1 & myBag[4] == 1) {
					npcChat = "Oh!!! So Good. You almost WIN. About the EGG, I don't know what is it.";
				}  else if (clearStage[1] == 1 & myBag[4] == 0) {
					npcChat = "Oh!!! So Good. You almost WIN. About the EGG, You need pick it up.";
				}
				break;
			case 15:
				npcChat = "Congratulations. You win! You are welcome to recommend this game to your friends.";
				break;
			case 22:
				npcChat = "When you come to such a beautiful grassland, you can take a break. You don't need to do anything.";
				break;
			case 32:
				npcChat = "Keep Going.";
				break;
			case 33:
				npcChat = "Hello. I am your assistant and my name is Siri. There are many tasks here. Are you ready to start? Sure...... I will remind you of each task. Have fun !!";
				break;
			case 34:
				if (clearStage[0] == 1) {
					npcChat = "Good you kill the bear. But it is hard right? Try get herb and sword, these will help you.";
				} else if (clearStage[0] == 1 & myBag[2] == 1 & myBag[3] == 1) {
					npcChat = "Good! It looks like you prapared to battle.";
				}
				break;
			case 44:
				if (myBag[2] == 1) {
					npcChat = "Good idea.";
				} else if (myBag[2] == 0) {
					npcChat = "You have to pick the sword up!";
				}
				break;
			case 53:
				if (myBag[0] == 1) {
					npcChat = "Good idea. Shell can buy ticket.";
				} else {
					npcChat = "You have to pick up the shell. No Shell no boat. Shells are the currency of this game.";
				}
				break;
			case 54:
				if (myBag[3] == 1) {
					npcChat = "You get the herb. Now you can enter 5 to use it.";
				} else {
					npcChat = "Why you not pick up the herb? It will help you to fully the HP.";
				}
				break;
			case 55:
				npcChat = "This is a very difficult level. I can tell you secretly that no one has successfully climbed it so far. But you can try it. Wish you complete the challenge.";
				break;
		}
		return npcChat;
	}
	
}
