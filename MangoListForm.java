package com.sist.client;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.net.*;
public class MangoListForm extends JPanel implements MouseListener{
   JButton b1,b2,b3,b4,b5,b6;
   JTextField tf;
   JTable table;
   DefaultTableModel model;
   MangoDetailForm mgf=new MangoDetailForm();

   public MangoListForm()
   {
	   setLayout(null);
	   b1=new JButton("서촌카페");
	   b2=new JButton("제주카페");
	   b3=new JButton("빙수맛집");
	   b4=new JButton("양평카페");
	   b5=new JButton("티라미수맛집");
	   b6=new JButton("검색");
	   tf=new JTextField(20);
	   JPanel p=new JPanel();
	   p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(tf);p.add(b6);
	   p.setBounds(220, 25, 900, 35);
	   add(p);
	   String[] col={"번호","미리보기","가게명","평점","주소"};
	   Object[][] row=new Object[0][4]; // [0][5]->[0][4]
	    
	   model=new DefaultTableModel(row,col) { 
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				return getValueAt(0, columnIndex).getClass();
			}
		   
	   };
	   
	   table=new JTable(model);
	   table.setRowHeight(50);
	   JScrollPane js=new JScrollPane(table);
	   
	   js.setBounds(10, 70, 700, 550);
	   add(js);
	   
	   mgf.setBounds(715,70 , 800, 650);
	   add(mgf);
	   MangoAllData(1);
	   mgf.detailPrint(1);
	   
	   table.addMouseListener(this);
   }
   
   public void MangoAllData(int cno)
   {
	   MangoManager m=new MangoManager();
	   ArrayList<MangoVO> list=m.MangoAllData(cno);
	   
	   for(int i=model.getRowCount()-1;i>=0;i--)
	   {
		   model.removeRow(i);
	   }

	   for(MangoVO vo:list)
	   {
		  try
		  {
			   URL url=new URL(vo.getImg());
			   Image img=ClientMainFrame.getImage(new ImageIcon(url),
					   50, 50);
			   Object[] data={
					 vo.getMno(),
					 new ImageIcon(img),
					 vo.getTitle(),
					 vo.getReview(),
					 vo.getPlace()
			   };
			   model.addRow(data);
		  }catch(Exception ex){ex.printStackTrace();}
	   }
   }
   
   public void MangoFindData(String ss)
   {
	   MangoManager m=new MangoManager();
	   ArrayList<MangoVO> list=m.MangoFindData(ss);

	   for(int i=model.getRowCount()-1;i>=0;i--)
	   {
		   model.removeRow(i);
	   }
	   
	   for(MangoVO vo:list)
	   {
		  try
		  {
			   URL url=new URL(vo.getImg());
			   Image img=ClientMainFrame.getImage(new ImageIcon(url),
					   50, 50);
			   Object[] data={
					 vo.getMno(),
					 new ImageIcon(img),
					 vo.getTitle(),
					 vo.getReview(),
					 vo.getPlace()
			   };
			   model.addRow(data);
		  }catch(Exception ex){ex.printStackTrace();}
	   }
   }
   
@Override
public void mouseClicked(MouseEvent e) {
	if(e.getSource()==table)
	{
		if(e.getClickCount()==2)
		{
			int row=table.getSelectedRow();
			String mno=model.getValueAt(row, 0).toString();
			mgf.detailPrint(Integer.parseInt(mno));
		}
	}
}
@Override
public void mousePressed(MouseEvent e) {
	
}
@Override
public void mouseReleased(MouseEvent e) {
	
}
@Override
public void mouseEntered(MouseEvent e) {
	
}
@Override
public void mouseExited(MouseEvent e) {
	
}
}

