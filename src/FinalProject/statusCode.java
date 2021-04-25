package FinalProject;

public class statusCode {
	 static int [] clearStage = {0,0};
	 public static int[] statusCode (int stageNum, int passGame) {
		 if (stageNum == 1 & passGame == 1) {
				System.out.println("PASS the Forest Trail.");
				clearStage [0] = 1;
				System.out.println("Done Write.");
		 } else if (stageNum == 2 & passGame == 1) {
				System.out.println("PASS the Dragon.");
				clearStage [1] = 1;
				System.out.println("Done Write.");
		 }
		 returnStage();
		 return clearStage;
	 }
	 
	 public static void returnStage () {
		 missionIndex.getClearStage(clearStage);
	 }
}
