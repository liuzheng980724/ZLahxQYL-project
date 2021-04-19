package zlahxqyl;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class acquisitiontest {

	public static void keytest (int pressbutton) {
		switch (pressbutton) {
		case 0:
			JOptionPane.showMessageDialog(null, "UP Button");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Down Button");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Left Button");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Right Button");
			break;
		default:
			System.out.println("Nothing");
			break;
		}

	}
	
}
