import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;


public class MyFrame5 extends JFrame
{
	Font f1;
	JButton b1;
	Label l1;
	TextField t1;
	
	MyActionListener ml;
	MyFrame5()
	{
		
		super("SERVER");
		setLayout(null);
		setBounds(100,50,800,800);
		
		setBackground(new Color(50,50,50));
		f1 = new Font("Arial",Font.BOLD,20);
		
		
		l1 = new Label("MUNCIPAL MANAGEMENT SYSTEM");
		l1.setFont(f1);
		add(l1);
		l1.setBounds(50,50,500,200);
		l1.setForeground(Color.BLACK);
		t1 = new TextField();
		t1.setFont(f1);
		add(t1);
		t1.setBounds(150,250,600,100);
		b1 = new JButton("SEND");
		b1.setFont(f1);
		add(b1);
		b1.setBounds(50,250,100,50);
		
	}
	public static void main(String args[])
	{
			MyFrame5 mf5 = new MyFrame5();
			mf5.setVisible(true);
	}
}
