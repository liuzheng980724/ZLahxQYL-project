package people;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class peopleObj extends JPanel {
	private int status=2;//人物状态

	//屏幕坐标
	private int x;
	private int y;
	
	public void setStatus(int a)//设置状态
    {
		status=a;
    }
	
	public void setxy(int m_x,int m_y)
	{
		x=m_x;
		y=m_y;
	}
	
	public void movex(int m_x)
	{
		x+=m_x;
	}
	
	public void movey(int m_y)
	{
		y+=m_y;
	}
	
	public int getx()
	{
		return x;
	}
	public int gety()
	{
		return y;
	}
	
	public peopleObj(int m_x,int m_y)//人物初始屏幕位置
	{
		x=m_x;
		y=m_y;
	}
	
	public void paint(Graphics g)
	{
		
		switch(status)
		{
		case 0:g.drawImage(Toolkit.getDefaultToolkit().getImage("./image/people/forword/向右走0.png"),x-15,y-68,this);break;
		case 1:g.drawImage(Toolkit.getDefaultToolkit().getImage("./image/people/forword/向右走1.png"),x-15,y-68,this);break;
		case 2:g.drawImage(Toolkit.getDefaultToolkit().getImage("./image/people/forword/向右走2.png"),x-15,y-68,this);break;
		case 3:g.drawImage(Toolkit.getDefaultToolkit().getImage("./image/people/forword/向右走3.png"),x-15,y-68,this);break;
		case 4:g.drawImage(Toolkit.getDefaultToolkit().getImage("./image/people/forword/向左走0.png"),x-76,y-68,this);break;
		case 5:g.drawImage(Toolkit.getDefaultToolkit().getImage("./image/people/forword/向左走1.png"),x-76,y-68,this);break;
		case 6:g.drawImage(Toolkit.getDefaultToolkit().getImage("./image/people/forword/向左走2.png"),x-76,y-68,this);break;
		case 7:g.drawImage(Toolkit.getDefaultToolkit().getImage("./image/people/forword/向左走3.png"),x-76,y-68,this);break;
		case 8:g.drawImage(Toolkit.getDefaultToolkit().getImage("./image/people/forword/面朝右站.gif"),x-40,y-86,this);break;
		case 9:g.drawImage(Toolkit.getDefaultToolkit().getImage("./image/people/forword/面朝左站.gif"),x-24,y-86,this);break;		
		}
		g.drawString("屏幕位置："+"x="+Integer.toString(x)+"y="+Integer.toString(y),645,525);
	}


}
