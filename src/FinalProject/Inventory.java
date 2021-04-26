package FinalProject;

public class Inventory {
	 static int [] yourBag = {0,0,0};
	 static int getSheel = 0;
	 static int getCamp = 0;
	 static int getSword = 0;
	 public static int[] bag (int getSheel, int getCamp, int getSword) {
		 if (getSheel == 1) {
			 yourBag[0] = 1;
		 }
		 if (getCamp == 1) {
			 yourBag[1] = 1;			 
		 }
		 if (getSword == 1) {
			 yourBag[2] = 1;			 
		 }
		 returnBag();
		 return yourBag;
	 }
	 
	 public static void returnBag () {
		 	//yourBag[0] = 1;	 //DEBUG USE
		 	//yourBag[1] = 1;	 //DEBUG USE
		 	//yourBag[2] = 1;	 //DEBUG USE
			riverCrossing.yourBag(yourBag);
			forestTrail.yourBag(yourBag);
			missionIndex.yourBag(yourBag);
			main.yourBag(yourBag);
	 }
}
