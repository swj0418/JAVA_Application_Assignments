package main;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame()
	{
		Toolkit  kit = Toolkit.getDefaultToolkit();
		Dimension ScreenSize = kit.getScreenSize();
		
		setSize(300, 200);
		setLocation(ScreenSize.width / 2, ScreenSize.height / 2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("MyFrame");
		Image Img = kit.getImage("1455090133719.jpg");
		setIconImage(Img);
		setLayout(new FlowLayout());
		JButton button = new JButton("Button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		this.add(button);
		setVisible(true);
	}
	public static void main(String[] ar)
	{
		new MyFrame();
	}
}
