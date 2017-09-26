package inheritance;

import java.awt.*;
import javax.swing.*;

public class FrameChild extends FrameParent{
	
	JMenu menu_2 = new JMenu("menu 2");
	
	FrameChild()
	{
		//super();
		this.menubar.add(menu_2);
	}
	
	public static void main(String[] ar)
	{
		new FrameChild();
	}
}
