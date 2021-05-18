package FinalProject;

/**
* This is Inventory
* @author Zheng Liu
* @version 1.0
*/

public class items {
	
	/**
	 * @serialField yourBag items All 5 item status.
	 */
	 public static int [] yourBag = {0,0,0,0,0}; //ALL ITEMS

	 /**
	   * This method returns the array of BAG.
	   * ALL 5 items at here, 1 means get it, 0 means not get it.
	   * All items input 9 means reset BAG. (Use it when you Died)
	   * @param getShell Enter 1 means to get the item SHELL. 
	   * @param getCamp Enter 1 means to get the item CAMP. 
	   * @param getSword Enter 1 means to get the item SWORD. 
	   * @param getHerb Enter 1 means to get the item HERB. 
	   * @param getEgg Enter 1 means to get the item EGG. 
	   * @return yourBag Your item status.
	   */
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
