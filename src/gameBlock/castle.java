package gameBlock;

/**
* Game Block: Castle
* @author Qiyuan Luo
* @version 1.0
*/

import FinalProject.main;
import FinalProject.reCheck;

public class castle {
	
	public castle() {
		reCheck warning = new reCheck();
		System.out.println("Congratulations. You win!");
		main.youWin = true;
		System.out.println("Warrior, you defeated the bear, went through the forest, and got a shell.\nThen he crossed the river, climbed the mountain, and challenged the dragon after all the hardships.");
		System.out.println("Then you crossed the river, climbed the mountain, and challenged the dragon after all the hardships.\nIn the end you defeated it with perseverance and entered the castle to win the game.");
		System.out.println("Congratulations. You win!");
		warning.needYes();
	}
	
}
