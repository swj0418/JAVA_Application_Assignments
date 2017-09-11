package mainpac;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame{
	JLabel ID, Name, Contact, Address; JLabel Intro;
	JTextField id, name, contact, address;
	
	JButton close;
	Main()
	{
		setSize(500, 300);
		setLayout(null);
		
		Intro = new JLabel("1st Assignment"); Intro.setBounds(10, 10, 300, 20);
		add(Intro);
		
		//Labels definition & addition
		ID = new JLabel("Student ID"); ID.setBounds(10, 30, 100, 20);
		Name = new JLabel("Name"); Name.setBounds(110, 30, 100, 20);
		Contact = new JLabel("Phone Number"); Contact.setBounds(210, 30, 100, 20);
		Address = new JLabel("GitHub Address"); Address.setBounds(310, 30, 100, 20);
		add(ID); add(Name); add(Contact); add(Address);
		
		//TextFields definition & addition
		id = new JTextField("2012203079"); id.setBounds(10, 50, 100, 20); id.setEditable(false);
		name = new JTextField("Á¤»ó¿ø"); name.setBounds(110, 50, 100, 20); name.setEditable(false);
		contact = new JTextField("010-8611-9898"); contact.setBounds(210, 50, 100, 20); contact.setEditable(false);
		address = new JTextField("https://github.com/swj0418"); address.setBounds(310, 50, 160, 20); address.setEditable(false);
		add(id); add(name); add(contact); add(address);
				
		//Buttons definition& addition
		close = new JButton("Close");	
		close.setBounds(400, 100, 70, 30);
		close.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		add(close);
		
		setVisible(true);
	}
	
	public static void main(String[] ar)
	{
		new Main();
	}

}
