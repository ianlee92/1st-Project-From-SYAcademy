package com.sist.project.client;

import java.awt.*;
import javax.swing.*;
public class ControllPanel extends JPanel{
	CardLayout card = new CardLayout();
	ListForm lf = new ListForm();
	DetailForm df = new DetailForm();
	//����Ǵ� ȭ���� ��Ʈ�� �г� �������־����
	public ControllPanel() {
		setLayout(card);
		add("LF",lf);
		add("DF",df);
	}
}
