package zlahxqyl;

import java.awt.Container;
import javax.swing.JFrame;

public class mainlayout extends JFrame {
	public mainlayout() {
		setBounds(0,0,646,913);
		setTitle("Zheng's Game");
		start();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
    public void start() {
        Container game = getContentPane();
        game.removeAll();
        panel panel = new panel();
        game.add(panel);
        game.validate();
    }
}