package fractalTree;
//In what order the tree is being drawn
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class FractalTree extends JFrame{

	public FractalTree() {
		setSize(800, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	
	private void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
		if (depth == 0) return;
		int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 10.0);
		int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 10.0);
		
		g.drawLine(x1, y1, x2, y2);
		drawTree(g, x2, y2, angle - 20, depth - 1);
		drawTree(g, x2, y2, angle + 20, depth - 1);
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(new Color(0, 0, 0, 128)); //alpha 0~128
		drawTree(g, 400, 600, -90, 10);
	}
	
	public static void main(String[] ar) {
		new FractalTree();
	}
}
