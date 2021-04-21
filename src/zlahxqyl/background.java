package zlahxqyl;

import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class background extends JPanel {
	private int x=0;
	private int y=0;
	private int renx=0;
	private int reny=0;
	
	public int getx()
	{
		return x;
	}
	
	public int gety()
	{
		return y;
	}
	
	public int getrenx()
	{
		return renx;
	}
	public int getreny()
	{
		return reny;
	}
	
	public void paint(Graphics g) {
		g.drawImage(Toolkit.getDefaultToolkit().getImage("image/bground-withgrid.png"),x,y,this);
		g.drawString("地图位置："+"x="+Integer.toString(renx)+"y="+Integer.toString(reny),540,880);	//TEST USE
		g.drawString("Background",0,10);	//TEST USE
	}
}


/*
public class background {
	
    public BufferedImage image;
    public background() {
    	try {
    		//image = ImageIO.read(new File("image/bground.png"));
    		image = ImageIO.read(new File("image/bground-withgrid.png"));
    		} catch (IOException e) {
			e.printStackTrace();
			}
    	}

}
*/