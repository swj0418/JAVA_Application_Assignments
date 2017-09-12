package gui;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Assignment_2 {
	
	//Components for panel assign_2
	JLabel info; JLabel input_direct; JLabel erase_direct; JLabel output_direct;
	JTextField inputstring;
	JTextField erasestring;
	JTextField outputstring;
	JButton run;
	
	public Assignment_2()
	{
		
	}
	
	JPanel CreatePanel(JPanel panel)
	{
		panel.setSize(800, 300);
		panel.setLayout(null);
		info = new JLabel("Second Assignment"); info.setBounds(10, 10, 300, 20); panel.add(info);
		input_direct = new JLabel("Input your text here"); input_direct.setBounds(10, 50, 300, 20); panel.add(input_direct);
		erase_direct = new JLabel("Input exact string to erase from your original text"); erase_direct.setBounds(10, 90, 300, 20); panel.add(erase_direct);
		output_direct = new JLabel("Resolution"); output_direct.setBounds(10, 130, 300, 20); panel.add(output_direct);
		
		inputstring = new JTextField(); inputstring.setBounds(310, 50, 300, 20); panel.add(inputstring);
		erasestring = new JTextField(); erasestring.setBounds(310, 90, 300, 20); panel.add(erasestring);
		outputstring = new JTextField(); outputstring.setBounds(310, 130, 300, 20); panel.add(outputstring);
		
		run = new JButton("RUN"); run.setBounds(630, 130, 100, 20); panel.add(run);
		
		run.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent E)
			{
				//Initialization
				String str_ori; String str_mod; String to_mod;
				str_mod = "";
				str_ori = "";
				to_mod = "";
				
				//Operation
				try {
					str_ori = inputstring.getText();
					to_mod = erasestring.getText();
					
					if(str_ori == "")
					{
						throw new Exception();
					}
				} catch(Exception e) {
					e.getMessage();
				}
				finally
				{
					str_mod = str_ori.replace(to_mod, "");
				}
				outputstring.setText(str_mod);		
			}
		});
		return panel;
	}
}
