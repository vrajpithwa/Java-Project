import java.net.URL;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;


public class MyFrame2 extends JFrame
{
	JLabel l1,l2;
	JRadioButton b1,b2;
	JButton b3;
	Font f;

	MyActionListener ml = new MyActionListener(this);
	MyFrame2()
	{
		
		
		super("Tax Payment");
		setLayout(null);
		setBounds(500,250,500,250);
		
		l1 = new JLabel("Water Tax");
		l2 = new JLabel("Property Tax");
		Icon proptax = new ImageIcon("watertax.png");
		b1 = new JRadioButton();
		b1.setBounds(50,50,30,30);
		add(b1);
		b2 = new JRadioButton();
		b2.setBounds(50,80,30,30);
		add(b2);
		
		b3 = new JButton("Proceed");
		f = new Font("Times",Font.BOLD,20);
		l1.setFont(f);
		l2.setFont(f);
		
		
		l1.setBounds(100,50,200,30);
		l2.setBounds(100,80,200,30);
		b3.setBounds(100,150,100,30);
		
		
		add(l1);
		add(l2);
		add(b3);
		
		b1.addItemListener(ml);
		//b2.addItemListener(ml);
		b3.addActionListener(ml);
	
	}
	public static void main(String args[])
	{
			MyFrame2 mf = new MyFrame2();
			mf.setVisible(true);
	}	
}	