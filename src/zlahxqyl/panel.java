package zlahxqyl;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JPanel;

public class panel extends JPanel {
    private BufferedImage image;
    private background background;
    private Graphics2D g2;
    
    public panel() {
        image = new BufferedImage(646, 913, BufferedImage.TYPE_INT_BGR);
        g2 = image.createGraphics();
        background = new background();	//Copy background from background.java
        navigationbuttpon();
    }
	
	private void paintImage() {
	       g2.drawImage(background.image, 0, 0, this); //Get backgroundIMG from new background()
	}
	
    public void paint(Graphics g) {	//Draw panel
        paintImage();
        g.drawImage(image, 0, 0, this);
    }
	
	public void navigationbuttpon() {
		setLayout(null);	//Set layout = null, make setBounds can use.
		JButton up=new JButton("N");  
        JButton down=new JButton("S");
        JButton left=new JButton("W");
        JButton right=new JButton("E");  
        
        up.setBounds(500,5,50,50);
        down.setBounds(500,105,50,50);
        left.setBounds(450,55,50,50);
        right.setBounds(550,55,50,50);
        
        add(up);
        add(down);
        add(left);
        add(right);

        up.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new acquisitiontest().keytest(0);
            }
        });

        down.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new acquisitiontest().keytest(1);
            }
        });

        left.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new acquisitiontest().keytest(2);
            }
        });

        right.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new acquisitiontest().keytest(3);
            }
        });
    }
	

    
}