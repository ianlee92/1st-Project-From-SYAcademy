package com.sist.project.client;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MainMenu extends JPanel implements MouseListener {
   JButton m1,m2;
   JTextField tf;
   JLabel title=new JLabel("������",JLabel.LEFT); 
   public MainMenu()
   {
      setLayout(null);
      title.setFont(new Font("���� ���",Font.BOLD,50));
      title.setBounds(10, 10, 300, 50);
      add(title);
      
      tf=new JTextField();
      tf.setText("�˻�� �Է��Ͻÿ�");
      tf.setBounds(515, 10, 350, 40);
      add(tf);
      
      m1=new JButton("�α���");
      m2=new JButton("ȸ������");
      m1.setFont(new Font("���� ���",Font.BOLD,20));
      m2.setFont(new Font("���� ���",Font.BOLD,20));
      
      JPanel p=new JPanel();
      
      p.add(m1);p.add(m2);
      p.setBounds(1200, 10, 300, 80);
      add(p);
      p.setOpaque(false);
      tf.addMouseListener(this);
   }
   @Override
   public void mouseClicked(MouseEvent e) {
      // TODO Auto-generated method stub
   
   }
   @Override
   public void mousePressed(MouseEvent e) {
      // TODO Auto-generated method stub
      //tf.setText("");
   }
   @Override
   public void mouseReleased(MouseEvent e) {
      // TODO Auto-generated method stub
      //tf.setText("");
   
   }
   @Override
   public void mouseEntered(MouseEvent e) {
      // TODO Auto-generated method stub
      //tf.setText("");   
      if(e.getSource()==tf)
      {
            tf.setText("");
         }
   }
   @Override
   public void mouseExited(MouseEvent e) {
      // TODO Auto-generated method stub
      //tf.setText("");
      if(e.getSource()==tf)
      {
        if(tf.getText().equals(""))
        {
         tf.setText("�˻�� �Է��Ͻÿ�");
        }
      }
   }
}