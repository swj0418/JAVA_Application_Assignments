package one;
import java.awt.*;
import javax.swing.*;

public class BasicPaint {
	public static void main(String[] ar) {
		JFrame f = new JFrame("Basic Graphic Program");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new MyPanel());
		f.setSize(300, 1200);
		f.setVisible(true);
	}

}

class MyPanel extends JPanel {
	
	public MyPanel() {
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(50, 50, 50, 50);
		g.drawOval(200, 50, 50, 50);
		g.drawLine(70, 170, 120, 110);
		g.draw3DRect(120, 120, 60, 30, true);
		g.drawArc(100, 100, 100, 100, 20, 80);
	}
}