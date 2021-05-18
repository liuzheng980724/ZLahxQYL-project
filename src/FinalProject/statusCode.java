package FinalProject;

/**
* Record whether the battle point needs to be cleared.
* @author Zheng Liu
* @version 1.0
*/
public class statusCode {
	/**
	 * @serialField clearStage statusCode Record you pass the battle stage.
	 */
	 public static int [] clearStage = {0,0};
	 
	   /**
	   * This method is record you pass the battle stage.
	   * @param stageNum Which Stage Bear OR Dragon.
	   * @param passGame 1 = Pass.
	   * @return Write in Array. Other Method (missionIndex, NPC ...) will use it.
	   */
	 public static int[] statusCode (int stageNum, int passGame) {
		 if (stageNum == 9 & passGame == 9) {
			 clearStage [0] = 0;
			 clearStage [1] = 0;
		 }
		 if (stageNum == 1 & passGame == 1) {
				System.out.println("PASS the Forest Trail.");
				clearStage [0] = 1;
				System.out.println("Done Write.");
		 } else if (stageNum == 2 & passGame == 1) {
				System.out.println("PASS the Dragon.");
				clearStage [1] = 1;
				System.out.println("Done Write.");
		 }
		 return clearStage;
	 }
}
