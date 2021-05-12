package FinalProject;

public class npc {
	
	static String npcChat;
	public static String npc (int xreal, int yreal) {
		int location = yreal*10 + xreal;
		switch (location) {
			case 11:
				npcChat = "";
				break;
			case 12:
				npcChat = "";
				break;
			case 13:
				npcChat = "";
				break;
			case 14:
				npcChat = "";
				break;
			case 15:
				npcChat = "";
				break;
			case 22:
				npcChat = "";
				break;
			case 23:
				npcChat = "";
				break;
			case 33:
				npcChat = "Hello, warrior. Welcome here, I am an NPC, and I will give you tips in every block. I wish you all the best.";
				break;
			case 34:
				npcChat = "";
				break;
			case 44:
				npcChat = "";
				break;
			case 53:
				npcChat = "";
				break;
			case 54:
				npcChat = "";
				break;
			case 55:
				npcChat = "";
				break;
		}
		return npcChat;
	}
	
}
