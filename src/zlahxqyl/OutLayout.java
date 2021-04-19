package zlahxqyl;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
 
	
class getimg extends JPanel { 
	private Image img; public getimg(Image img) { 
		this.img = img; Dimension size = new Dimension(img.getWidth(null), img.getHeight(null)); 
		setPreferredSize(size); 
		setMinimumSize(size); 
		setMaximumSize(size); 
		setSize(size); 
		setLayout(null); 
		} 
	public void paintComponent(Graphics g) { 
		g.drawImage(img, 0, 0, null); 
		} 
}

	public class OutLayout extends Frame implements ActionListener {

		OutLayout() {
		    super("Zheng's Game");
			setBounds(450, 50, 646, 913); //固定窗体位置 X=450 Y=50，大小 宽646 高913 勿动
		    setVisible(true);

		   // getimg panel = new getimg(new ImageIcon("image/bground.png").getImage());
			//add(panel);
			//setSize(646,913);
		}
		
		
		public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(this,"TEST 123"); 
		}
		
		
		public void MainFrame() {
			//new OutLayout();
			new background();
			
			
		}
		
	}
	


