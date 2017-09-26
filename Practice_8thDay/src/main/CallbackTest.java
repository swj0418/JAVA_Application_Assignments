package main;
import java.awt.event.*;
import javax.swing.Timer;

class MyClass implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Beep");
	}
}

public class CallbackTest {
	public static void main(String[] ar)
	{
		ActionListener listener = new MyClass();
		Timer t = new Timer(5000, listener);
		t.start();
		
		for(int i = 0; i < 100; i++)
		{
			try {
				Thread.sleep(250);
			} catch(InterruptedException e)
			{
				
			}
		}
	}
	

}
