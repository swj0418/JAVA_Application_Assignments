package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.color.*;

import java.util.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.*;

class Sports {
	String getName() {
		return "Generic Sports";
	}
	void getNumberOfTeamMembers()
	{
		System.out.println("Each team has n players in " + getName() );
	}
	
	String getNumberOfTeamMembersReturn()
	{
		return "Each team has n players in " + getName();
	}
}

class Soccer extends Sports{
	@Override
	String getName() {
		return "Soccer Class";
	}
	
	@Override
	void getNumberOfTeamMembers()
	{
		System.out.println("There are " + 11 + " players in a soccer team");
	}
	
	@Override
	String getNumberOfTeamMembersReturn()
	{
		return "There are " + 11 + " players in a soccer team";
	}
}

public class Assignment_3 {
	JLabel info = new JLabel("Third Assignment");
	JLabel info_2 = new JLabel("Console output");
	//JTextField textarea = new JTextField();
	JTextArea textarea = new JTextArea();
	
	//JScrollPane jscrollpane;
	
	Assignment_3()
	{
		
	}
	
	JPanel CreatePanel(JPanel panel)
	{
		Sports sports = new Sports();
		Soccer soccer = new Soccer();
		
		panel.setLayout(null);
		info.setBounds(10, 10, 200, 20); panel.add(info);
		info_2.setBounds(10, 50, 100, 50); panel.add(info_2);
		
		textarea.setBackground(Color.black);
		textarea.setSelectedTextColor(Color.pink);
		textarea.setDisabledTextColor(Color.WHITE);
		textarea.setSelectionColor(Color.white);
		textarea.setForeground(Color.WHITE);
		textarea.setLineWrap(true);
		//jscrollpane = new JScrollPane(textarea);
		
		textarea.setText(sports.getName() + "\n");
		textarea.append(sports.getNumberOfTeamMembersReturn() + "\n");
		textarea.append(soccer.getName() + "\n");
		textarea.append(soccer.getNumberOfTeamMembersReturn() + "\n");
		
		textarea.setBounds(120, 70, 300, 300); panel.add(textarea);
		
		return panel;
	}
	
	public static void main(String[] ar)
	{
		Sports sports = new Sports();
		Soccer soccer = new Soccer();
		
		System.out.println(sports.getName());
		sports.getNumberOfTeamMembers();
		System.out.println(soccer.getName());
		soccer.getNumberOfTeamMembers();
	}

}
