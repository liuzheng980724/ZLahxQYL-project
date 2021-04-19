package zlahxqyl;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class backup_background extends JFrame
{  
    Container ct;   
    BackgroundPanel bgp;  
        
    public backup_background()  
    {  
	    super("Zheng's Game");
        ct=this.getContentPane();
        this.setLayout(null);  

        bgp=new BackgroundPanel((new ImageIcon("image/bground.png")).getImage());
        bgp.setBounds(0,0,646,913);  
        ct.add(bgp);  

		JButton up=new JButton("N");  
        up.setBounds(500,5,50,50); 
        ct.add(up);
        up.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new acquisitiontest().keytest(0);
            }
        });
        
        JButton down=new JButton("S");  
        down.setBounds(500,105,50,50);
        ct.add(down);
        down.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new acquisitiontest().keytest(1);
            }
        });
        
        JButton left=new JButton("W");  
        left.setBounds(450,55,50,50);
        ct.add(left);
        left.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new acquisitiontest().keytest(2);
            }
        });
        
        JButton right=new JButton("E");  
        right.setBounds(550,55,50,50);
        ct.add(right);
        right.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new acquisitiontest().keytest(3);
            }
        });

        this.setSize(646,952);  
        this.setLocation(450,50);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setVisible(true);  
    }  
}  
class BackgroundPanel extends JPanel  
{  
    Image im;  
    public BackgroundPanel(Image im)  
    {  
        this.im=im;  
        this.setOpaque(true);                  
    }  
    public void paintComponent(Graphics g)      
    {  
        super.paintComponents(g);  
        g.drawImage(im,0,0,this.getWidth(),this.getHeight(),this);
    }
}