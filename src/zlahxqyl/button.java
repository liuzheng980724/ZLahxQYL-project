package zlahxqyl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class button extends JPanel{
    	
	public button() {
		setLayout(null);	//Set layout = null, make setBounds can use.
		JButton up=new JButton("N");  
        JButton down=new JButton("S");
        JButton left=new JButton("W");
        JButton right=new JButton("E");  
        
        up.setBounds(500,55,50,50);
        down.setBounds(500,105,50,50);
        left.setBounds(450,105,50,50);
        right.setBounds(550,105,50,50);
        
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
	

