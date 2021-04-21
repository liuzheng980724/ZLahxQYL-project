package zlahxqyl;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class statusBar extends JPanel {
	private int allhp=100;
	private int hp=100;	//TEST NUM
	private int length=345;
	
	public void paint(Graphics g){	//paintcomponent super (g1)
	    g.drawImage(Toolkit.getDefaultToolkit().getImage("image/NEW-BAR.png"),0,0,this); 
	    g.setColor(Color.RED);
	    g.fillRect(182, 19, (int)((double)hp/allhp*length), 15);
	    
		String hptxt="["+Integer.toString(hp)+"/"+Integer.toString(allhp)+"]";
		int hptxtnuml=Integer.toString(hp).length()+Integer.toString(allhp).length();
		int hptxtx=515-(int)(hptxtnuml*6.7619);
	    
		g.setColor(Color.WHITE);
		g.drawString(hptxt, hptxtx,30);
	    }
}
