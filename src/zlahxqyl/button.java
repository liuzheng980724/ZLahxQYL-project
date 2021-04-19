package zlahxqyl;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class button extends JFrame{
    	
	public void navigationbuttpon () {
		
		JPanel bt=new JPanel();
				
		JButton up=new JButton("N");  
        up.setBounds(500,5,50,50); 
        bt.add(up);
        up.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new acquisitiontest().keytest(0);
            }
        });
        
        JButton down=new JButton("S");  
        down.setBounds(500,105,50,50);
        bt.add(down);
        down.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new acquisitiontest().keytest(1);
            }
        });
        
        JButton left=new JButton("W");  
        left.setBounds(450,55,50,50);
        bt.add(left);
        left.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new acquisitiontest().keytest(2);
            }
        });
        
        JButton right=new JButton("E");  
        right.setBounds(550,55,50,50);
        bt.add(right);
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
	

