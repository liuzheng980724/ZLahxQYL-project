package FinalProject;

public class items {
	 public static int [] yourBag = {0,0,0,0};
	 static int getShell = 0;
	 static int getCamp = 0;
	 static int getSword = 0;
	 public static int[] bag (int getShell, int getCamp, int getSword, int getHerb) {
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
		 return yourBag;
	 }
}
