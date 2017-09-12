package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Main {
	
	//Basic Components
		JFrame frame = new JFrame();
		
		JMenuBar menubar = new JMenuBar();
		JMenu menuPanels = new JMenu("Assignments");
		JMenuItem assign_1 = new JMenuItem("Assignment 1");
		JMenuItem assign_2 = new JMenuItem("Assignment 2");
		JMenuItem assign_3 = new JMenuItem("Assignment 3");
		
		
		JPanel panel = new JPanel();
		JPanel pnlAss_1 = new JPanel();
		JPanel pnlAss_2 = new JPanel();
		JPanel pnlAss_3 = new JPanel();
		
		CardLayout cardLayout = new CardLayout();
		
		public Main()
		{
			panel.setLayout(cardLayout);
			
			Assignment_1 pnlAss_1_class = new Assignment_1(frame);
			pnlAss_1 = pnlAss_1_class.CreatePanel(pnlAss_1);
			
			Assignment_2 pnlAss_2_class = new Assignment_2();
			pnlAss_2 = pnlAss_2_class.CreatePanel(pnlAss_2);
			
			Assignment_3 pnlAss_3_class = new Assignment_3();
			pnlAss_3 = pnlAss_3_class.CreatePanel(pnlAss_3);
			
			
			panel.add(pnlAss_1, "pnlAss_1");
			panel.add(pnlAss_2, "pnlAss_2");
			panel.add(pnlAss_3, "pnlAss_3");
			
			cardLayout.show(panel, "pnlAss_1");
			
			//Menubars and menupanels
			menubar.add(menuPanels);
			menuPanels.add(assign_1);
			menuPanels.add(assign_2);
			menuPanels.add(assign_3);
			
			assign_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent E)
				{
					cardLayout.show(panel, "pnlAss_1");
				}
			});
			assign_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					cardLayout.show(panel, "pnlAss_2");
				}
			});
			assign_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cardLayout.show(panel, "pnlAss_3");
				}
			});
			
			frame.setJMenuBar(menubar);
			frame.add(panel);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setSize(800, 600);
			frame.setVisible(true);
		}
		
		public static void main(String[] ar)
		{
			new Main();
		}
}
