package zlahxqyl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import people.peopleObj;

public class mainlayout extends JFrame {
	private statusBar statusbar=new statusBar();
	private peopleObj people=new peopleObj(305,570); //People
	private background background=new background();


	private int Direction; //People Direction
	
	public mainlayout() {
		setBounds(500,10,662,1004);
		setTitle("Zheng's Game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); //Limit change windows size.
		this.setLayout(null);
		
		button();	
		
		add(statusbar);
		add(people);
		add(background);

		people.setBounds(0, 0, 646, 913);		
		statusbar.setBounds(0, 0, 646, 52);
		background.setBounds(0, 52, 646, 913);

		this.addKeyListener(new keypress());//Listen KEYBOARD
	}
	
	public void button() {
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
        
        up.setFocusable(false);
        down.setFocusable(false);
        left.setFocusable(false);
        right.setFocusable(false);
        
        up.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				people.movey(-5);
				mainlayout.this.repaint();
            }
        });

        down.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				people.movey(5);
				mainlayout.this.repaint();
            }
        });

        left.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				people.movex(-5);
				mainlayout.this.repaint();
            }
        });

        right.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				people.movex(5);
				mainlayout.this.repaint();
            }
        });
    }	
	
	public class keypress extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			if(e.getKeyCode()==KeyEvent.VK_UP)
			{
				people.movey(-5);
				mainlayout.this.repaint();
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN)
			{
				people.movey(5);
				mainlayout.this.repaint();
			}
			if(e.getKeyCode()==KeyEvent.VK_RIGHT)
			{
				people.movex(5);
				mainlayout.this.repaint();
			}
			if(e.getKeyCode()==KeyEvent.VK_LEFT)
			{
				people.movex(-5);
				mainlayout.this.repaint();
			}
		}	
		
		public void keyReleased(KeyEvent e)
		{
			/*
			if(e.getKeyCode()==KeyEvent.VK_RIGHT)
			{
				
			}
			if(e.getKeyCode()==KeyEvent.VK_LEFT)
			{
				
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN)
			{
				
			}
			if(e.getKeyCode()==KeyEvent.VK_UP)//上
			{
				
			}
			*/
		}
	}
    
}