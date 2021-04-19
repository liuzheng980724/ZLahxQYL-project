package zlahxqyl;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class mainlayout extends JFrame {
	public mainlayout() {
		setBounds(0,0,646,913);
		setTitle("Zheng's Game");
		start();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
    public void start() {
        Container game = getContentPane();// 获取主容器对象
        game.removeAll();// 删除容器中所有组件
        background panel = new background();// 创建新的游戏面板
        game.add(panel);
        game.validate();
    }
}