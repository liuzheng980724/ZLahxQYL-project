package zlahxqyl;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class button extends JFrame{
    
	public void navigationbuttpon () {
				
		JButton up=new JButton("N");  
        up.setBounds(500,5,50,50);  
        up.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        
        JButton down=new JButton("S");  
        down.setBounds(500,105,50,50);  
        down.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        
        JButton left=new JButton("W");  
        left.setBounds(450,55,50,50);  
        left.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        
        JButton right=new JButton("E");  
        right.setBounds(550,55,50,50);  
        right.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        
	}
	
}
