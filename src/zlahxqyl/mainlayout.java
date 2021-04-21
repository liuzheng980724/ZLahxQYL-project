package zlahxqyl;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import people.peopleObj;

public class mainlayout extends JFrame {
	private statusBar statusbar=new statusBar();
	private peopleObj people=new peopleObj(305,570);//创建角色
	private background background=new background();


	private int Direction; //人物方向状态
	
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

		this.addKeyListener(new keypress());//对窗口键盘监听控制人物和快捷键
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
            	//new acquisitiontest().keytest(0);
				people.movey(-5);
				mainlayout.this.repaint();
            }
        });

        down.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//new acquisitiontest().keytest(1);
				people.movey(5);
				mainlayout.this.repaint();
            }
        });

        left.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//new acquisitiontest().keytest(2);
				people.movex(-5);
				mainlayout.this.repaint();
            }
        });

        right.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//new acquisitiontest().keytest(3);
				people.movex(5);
				mainlayout.this.repaint();
            }
        });
    }	
	
	public class keypress extends KeyAdapter//键盘监听
	{
		public void keyPressed(KeyEvent e)//按下
		{
			//System.out.println(e.getKeyChar()+"键被敲击");
			if(e.getKeyCode()==KeyEvent.VK_UP)//上
			{
            	//new acquisitiontest().keytest(0);
				people.movey(-5);
				mainlayout.this.repaint();
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN)//下
			{
            	//new acquisitiontest().keytest(1);
				people.movey(5);
				mainlayout.this.repaint();
			}
			if(e.getKeyCode()==KeyEvent.VK_RIGHT)//右
			{
            	//new acquisitiontest().keytest(3);
				people.movex(5);
				mainlayout.this.repaint();
			}
			if(e.getKeyCode()==KeyEvent.VK_LEFT)//左
			{
            	//new acquisitiontest().keytest(2);
				people.movex(-5);
				mainlayout.this.repaint();
			}
		}	
		
		public void keyReleased(KeyEvent e)//释放
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