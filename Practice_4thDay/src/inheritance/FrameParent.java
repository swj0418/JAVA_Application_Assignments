package inheritance;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameParent extends JFrame{
	JMenu menu = new JMenu("Menu 1");
	
	JMenuItem menuit_1 = new JMenuItem("Tem 1");
	JMenuItem menuit_2 = new JMenuItem("Tem 2");
	JMenuItem menuit_3 = new JMenuItem("Tem 3");
	
	JMenuBar menubar = new JMenuBar();
	
	FrameParent()
	{
		setSize(300, 300);
		setLayout(null);
		
		menubar.add(menu);
		
		setVisible(true);
	}
	
	public static void main(String[] ar0)
	{
		
	}
}
