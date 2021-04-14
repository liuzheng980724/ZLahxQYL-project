package zlahxqyl;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane; 
	
	public class OutLayout extends Frame implements ActionListener {
		
		OutLayout() {
		    super("Zheng's Game");
			setBounds(340, 150, 820, 260); 
		    setVisible(true);
		}
		
		public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(this,"TEST 123");      
		}
		
		public void MainFrame() {
			new OutLayout();
		}
		
	}
	


