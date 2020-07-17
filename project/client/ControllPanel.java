package com.sist.project.client;

import java.awt.*;
import javax.swing.*;
public class ControllPanel extends JPanel{
	CardLayout card = new CardLayout();
	ListForm lf = new ListForm();
	DetailForm df = new DetailForm();
	//변경되는 화면은 컨트롤 패널 가지고있어야함
	public ControllPanel() {
		setLayout(card);
		add("LF",lf);
		add("DF",df);
	}
}
