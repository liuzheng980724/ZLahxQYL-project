package zlahxqyl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class button extends JPanel{
    	
	public void navigationbuttpon () {
		
		JButton up=new JButton("N");  
        up.setBounds(500,5,50,50); 
        add(up);
        up.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new acquisitiontest().keytest(0);
            }
        });
        
        JButton down=new JButton("S");  
        down.setBounds(500,105,50,50);
        add(down);
        down.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new acquisitiontest().keytest(1);
            }
        });
        
        JButton left=new JButton("W");  
        left.setBounds(450,55,50,50);
        add(left);
        left.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new acquisitiontest().keytest(2);
            }
        });
        
        JButton right=new JButton("E");  
        right.setBounds(550,55,50,50);
        add(right);
        right.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new acquisitiontest().keytest(3);
            }
        });

    }
        
	}
	

