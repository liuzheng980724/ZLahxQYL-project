package zlahxqyl;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import people.peopleObj;

public class mainlayout extends JFrame {
	private statusBar statusbar=new statusBar();
	private panel panel=new panel();
	private button navigationbutton=new button();
	private peopleObj people=new peopleObj(300,400);//创建角色
	private int Direction; //人物方向状态
	
	public mainlayout() {
		setBounds(500,10,662,1004);
		setTitle("Zheng's Game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); //Limit change windows size.
        add(statusbar);
		statusbar.setBounds(0, 0, 646, 52);
		add(panel);
		panel.setBounds(0, 52, 646, 913);
		//add(navigationbutton);
		add(people);
		this.addKeyListener(new keypress());//对窗口键盘监听控制人物和快捷键
	}
	
    public void start() {
        Container game = getContentPane();
        game.removeAll();
        panel panel = new panel();
        game.add(panel);
        game.validate();
    }
    
	public class keypress extends KeyAdapter//键盘监听
	{
		public void keyPressed(KeyEvent e)//按下
		{
			//System.out.println(e.getKeyChar()+"键被敲击");
///*
			if(e.getKeyCode()==KeyEvent.VK_UP)//上
			{
            	new acquisitiontest().keytest(0);
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN)//下
			{
            	new acquisitiontest().keytest(1);
			}
			if(e.getKeyCode()==KeyEvent.VK_RIGHT)//右
			{
            	new acquisitiontest().keytest(3);
			}
			if(e.getKeyCode()==KeyEvent.VK_LEFT)//左
			{
            	new acquisitiontest().keytest(2);
			}
			else
			{
				new acquisitiontest().keytest(8);
			}
//*/
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