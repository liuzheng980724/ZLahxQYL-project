package zlahxqyl;

import java.awt.Container;
import javax.swing.JFrame;

public class mainlayout extends JFrame {
	private statusBar statusbar=new statusBar();
	private panel panel=new panel();
	private button navigationbutton=new button();
	public mainlayout() {
		setBounds(500,10,662,1004);
		setTitle("Zheng's Game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(statusbar);
		statusbar.setBounds(0, 0, 646, 52);
		add(panel);
		panel.setBounds(0, 52, 646, 913);
		add(navigationbutton);
	}
	
    public void start() {
        Container game = getContentPane();
        game.removeAll();
        panel panel = new panel();
        game.add(panel);
        game.validate();
    }
}