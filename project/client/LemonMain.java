package com.sist.project.client;

import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

public class LemonMain extends JFrame{
	
	MenuForm mf = new MenuForm();
	MainMenu mm=new MainMenu();
	ChatForm cf = new ChatForm();
	ControllPanel cp = new ControllPanel();
	
	public LemonMain() {
		setLayout(null);
	    mm.setBounds(10, 10, 1550, 60);
	    add(mm);
	    mf.setBounds(10, 160, 1550, 50);
	    add(mf);
	    mf.setOpaque(false);
	    mm.setOpaque(false);
	    getContentPane().setBackground(Color.white);
		// 채팅
		cf.setBounds(1272, 220, 300, 850);
		add(cf);
		cf.setOpaque(false);
		// 출력화면 (노랑)
		cp.setBounds(12, 230, 1250, 700);
		add(cp);
		cp.setOpaque(false);
		setSize(1600, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) throws Exception{
		UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
		new LemonMain();
	}
}
