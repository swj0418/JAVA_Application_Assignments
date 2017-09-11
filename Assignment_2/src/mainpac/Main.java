package mainpac;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/*
 * Read a sentence input
 * Read characters to delete
 * show the original sentence and the modified sentence after deleting
 * 
 * it works as follows
 * give me a sentence i'm am very happy
 * give me characters to delete  ap
 * original sentence
 * modified sentence
 */



public class Main {
	
	//Basic Components
	JFrame frame = new JFrame();
	
	JMenuBar menubar = new JMenuBar();
	JMenu menuPanels = new JMenu("Assignments");
	JMenuItem assign_1 = new JMenuItem("Assignment 1");
	JMenuItem assign_2 = new JMenuItem("Assignment 2");
	
	JPanel panel = new JPanel();
	JPanel pnlAss_1 = new JPanel();
	JPanel pnlAss_2 = new JPanel();
	
	CardLayout cardLayout = new CardLayout();
	
	//Components for panel assign_1
	JLabel ID, Name, Contact, Address; JLabel Intro;
	JTextField id, name, contact, address;
	
	JButton close;
	
	void Assignment_1(JPanel panel)
	{
		panel.setSize(500, 300);
		panel.setLayout(null);
		
		Intro = new JLabel("First Assignment"); Intro.setBounds(10, 10, 300, 20);
		panel.add(Intro);
		
		//Labels definition & addition
		ID = new JLabel("Student ID"); ID.setBounds(10, 30, 100, 20);
		Name = new JLabel("Name"); Name.setBounds(110, 30, 100, 20);
		Contact = new JLabel("Phone Number"); Contact.setBounds(210, 30, 100, 20);
		Address = new JLabel("GitHub Address"); Address.setBounds(310, 30, 100, 20);
		panel.add(ID); panel.add(Name); panel.add(Contact); panel.add(Address);
		
		//TextFields definition & addition
		id = new JTextField("2012203079"); id.setBounds(10, 50, 100, 20); id.setEditable(false);
		name = new JTextField("Á¤»ó¿ø"); name.setBounds(110, 50, 100, 20); name.setEditable(false);
		contact = new JTextField("010-8611-9898"); contact.setBounds(210, 50, 100, 20); contact.setEditable(false);
		address = new JTextField("https://github.com/swj0418"); address.setBounds(310, 50, 160, 20); address.setEditable(false);
		panel.add(id); panel.add(name); panel.add(contact); panel.add(address);
				
		//Buttons definition& addition
		close = new JButton("Close");	
		close.setBounds(400, 100, 70, 30);
		close.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		panel.add(close);
	}
	//Components for panel assign_2
	JLabel info; JLabel input_direct; JLabel erase_direct; JLabel output_direct;
	JTextField inputstring;
	JTextField erasestring;
	JTextField outputstring;
	JButton run;
	
	
	void Assignment_2(JPanel panel)
	{
		panel.setSize(800, 300);
		panel.setLayout(null);
		Intro = new JLabel("Second Assignment"); Intro.setBounds(10, 10, 300, 20); panel.add(Intro);
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
					JOptionPane.showMessageDialog(frame, "You did not fill in required fields");
				}
				finally
				{
					str_mod = str_ori.replace(to_mod, "");
				}
				outputstring.setText(str_mod);
				
				
			}
		});
		
		//To make it work with an enter key
		Action action = new AbstractAction()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Some Action Performed");
			}
		};
		//Linking run button with enter key action
		run.addActionListener(action);


		/*
		Scanner in = new Scanner(System.in);
		String str_ori; String str_mod; String to_mod;
		
		System.out.print("Input your sentence :: ");
		str_ori = in.nextLine();
		
		System.out.println("Give me characters to delete from the original text :: ");
		to_mod = in.nextLine();
		
		
		
		System.out.println("Original Sentence : " + str_ori);
		System.out.println("Text to delete : " + to_mod);
		System.out.println("Modified Sentence : " + str_mod);
		
		in.close();
		*/
	}
	Main()
	{
		panel.setLayout(cardLayout);
		//Add components to panels
		Assignment_1(pnlAss_1);
		Assignment_2(pnlAss_2);
		
		//Add panels and set constraints
		panel.add(pnlAss_1, "pnlAss_1");
		panel.add(pnlAss_2, "pnlAss_2");
		
		cardLayout.show(panel, "pnlAss_1");
		
		//Menubars and menupanels
		menubar.add(menuPanels);
		menuPanels.add(assign_1);
		menuPanels.add(assign_2);
		
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
		
		frame.setJMenuBar(menubar);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 300);
		frame.setVisible(true);
		
	}
	
	
	public static void main(String[] ar)
	{
		new Main();
	}
}
