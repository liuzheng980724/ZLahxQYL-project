package FinalProject;

public class npc {
	
	static String npcChat;
	public static String npc (int xreal, int yreal) {
		int location = yreal*10 + xreal;
		switch (location) {
			case 11:
				npcChat = "Thank you for believing in me! So I will give you a camp, and it will help you pass the next level. Remember to take it away.";
				break;
			case 12:
				npcChat = "Take this road with confidence, there is nothing here. The next level suggests that you choose the west side.";
				break;
			case 13:
				npcChat = "You did not listen to my advice. So you can't pass this level, go back and get supplies. If you have already taken it, please don't skip a sentence. With a camp, you can spend the night safely in the tent.";
				break;
			case 14:
				npcChat = "";
				break;
			case 15:
				npcChat = "";
				break;
			case 22:
				npcChat = "When you come to such a beautiful grassland, you can take a break. You don't need to do anything at this stage.";
				break;
			case 23:
				npcChat = "Do you want to cross the river? You can use shells to buy a boat to help you cross the river. If you can't cross the river, go find shells.";
				break;
			case 33:
				npcChat = "Hello. I am your assistant and my name is siri. There are many tasks here. Are you ready to start? Sure...... I will remind you of each task. Have fun !!";
				break;
			case 34:
				npcChat = "Welcome to the forest. There are a lot of wild animals and plants here. Unexpectedly there is a ferocious bear in front of you. You need to defeat it to enter the next level. Don't be discouraged if you fail, you can continue to try.";
				break;
			case 44:
				npcChat = "Congratulations, here you will find a piece of equipment, it will bring you benefits, remember to bring it.";
				break;
			case 53:
				npcChat = "Do you want to swim? The lake here is particularly clear. Haha, I know you can't swim, you can play by the lake. You will find many beautiful shells. Tips: Chells are the currency of this game.";
				break;
			case 54:
				npcChat = "How are you feeling? If it is fun, remember to give us a good comment. This level is very simple, you only need to walk a section of gravel road. Have you noticed your HP? You lost a lot of blood during the previous fight with the bear. You need to find supplies that can heal you. You will find mysterious materials, when after you have walked this way.";
				break;
			case 55:
				npcChat = "Welcome to the Mountain Challenge. This is a very difficult level. I can tell you secretly that no one has successfully climbed it so far. But you can try it. Wish you complete the challenge.";
				break;
		}
		return npcChat;
	}
	
}
