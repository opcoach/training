package com.opcoach.training;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


@SuppressWarnings("serial")


public class SwingSamples extends JFrame
{
	
  public SwingSamples ()
  {
    super();
    setSize(300,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Une fenetre swing");
    setLocation(500,400);
    getContentPane().add(new JLabel("toto"), BorderLayout.CENTER);
  }
  
  
  public static void main (String[] arg)
  {
    SwingSamples frame = new SwingSamples();
    frame.setVisible(true);
  }
}