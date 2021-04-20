package zlahxqyl;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class panel extends JPanel {
    private BufferedImage image;
    private background background;
    private Graphics2D g2;
    
    public panel() {
        image = new BufferedImage(646, 913, BufferedImage.TYPE_INT_BGR);
        g2 = image.createGraphics();
        background = new background();	//Copy background from background.java
    }

    public void paint(Graphics g) {	//Draw panel
    	g2.drawImage(background.image, 0, 0, this); //Get backgroundIMG from new background()
        g.drawImage(image, 0, 0, this);
    }

}