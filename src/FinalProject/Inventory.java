package FinalProject;

public class Inventory {
	 static int [] yourBag = {0,0};
	 static int getSheel = 0;
	 static int getCamp = 0;
	 public static int[] bag (int getSheel, int getCamp) {
		 if (getSheel == 1) {
			 yourBag[0] = 1;
		 }
		 if (getCamp == 1) {
			 yourBag[1] = 1;			 
		 }
		 returnBag();
		 return yourBag;
	 }
	 
	 public static void returnBag () {
		 	//yourBag[0] = 1;	 //DEBUG USE
		 	//yourBag[1] = 1;	 //DEBUG USE
			riverCrossing.yourBag(yourBag); 
	 }
}
