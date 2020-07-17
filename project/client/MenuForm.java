package com.sist.project.client;
import java.awt.*;
import javax.swing.*;

public class MenuForm extends JPanel {
   JButton b1,b2,b3,b4,b5,b6,b7;
   public MenuForm()
   {
            
      b1=new JButton("ÀüÃ¼¸Å¹°");
      b2=new JButton("ÀÎ±â¸Å¹°");
      b3=new JButton("ÆÐ¼ÇÀâÈ­");
      b4=new JButton("ÀüÀÚ±â±â");
      b5=new JButton("¸®ºù/»ýÈ°");
      b6=new JButton("µµ¼­/À½¹Ý");
      b7=new JButton("¹«·á³ª´®");
      b1.setFont(new Font("¸¼Àº °íµñ",Font.PLAIN,20));
      b2.setFont(new Font("¸¼Àº °íµñ",Font.PLAIN,20));
      b3.setFont(new Font("¸¼Àº °íµñ",Font.PLAIN,20));
      b4.setFont(new Font("¸¼Àº °íµñ",Font.PLAIN,20));
      b5.setFont(new Font("¸¼Àº °íµñ",Font.PLAIN,20));
      b6.setFont(new Font("¸¼Àº °íµñ",Font.PLAIN,20));
      b7.setFont(new Font("¸¼Àº °íµñ",Font.PLAIN,20));
      
      setLayout(new GridLayout(1,7,10,10));
      add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);
   }
}