package com.sist.project.client;
import java.awt.Color;

import javax.swing.*;
import javax.swing.table.*;

public class ChatForm extends JPanel{
	JTextArea ta;
	JTextField tf;
	
	public ChatForm() {
		setLayout(null);
		ta = new JTextArea(); //ä��â
		JScrollPane js = new JScrollPane(ta); //��ũ�ѹ�
		js.setBounds(0, 10, 285, 650);
		add(js);
		tf = new JTextField(); //ä���Է�â
		tf.setBounds(0, 670, 285, 40);
		add(tf);
		
	}
}