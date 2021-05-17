package FinalProject;

/**
* This is Inventory
* @author Zheng Liu
* @version 1.0
*/

public class items {
	 public static int [] yourBag = {0,0,0,0,0}; //ALL ITEMS
	 public static int[] items (int getShell, int getCamp, int getSword, int getHerb, int getEgg) {
		 if (getShell == 9 & getCamp ==9  & getSword == 9 & getHerb == 9 & getEgg== 9) {
			 yourBag[0] = 0;
			 yourBag[1] = 0;
			 yourBag[2] = 0;
			 yourBag[3] = 0;
			 yourBag[4] = 0;
		 }
		 
		 if (getShell == 1) {
			 yourBag[0] = 1;
		 }
		 if (getCamp == 1) {
			 yourBag[1] = 1;			 
		 }
		 if (getSword == 1) {
			 yourBag[2] = 1;			 
		 }
		 if (getHerb == 1) {
			 yourBag[3] = 1;			 
		 }
		 if (getEgg == 1) {
			 yourBag[4] = 1;			 
		 }
		 return yourBag;
	 }
}
