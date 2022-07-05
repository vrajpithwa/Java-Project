import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;


public class MyFrame4 extends JFrame
{
	Font f1;
	JButton b1;
	Label l1;
	TextField t1;
	
	MyActionListener ml = new MyActionListener(this);
	MyFrame4()
	{
		
		super("Help");
		setLayout(null);
		setBounds(100,50,800,800);
		
		setBackground(new Color(50,50,50));
		f1 = new Font("Arial",Font.BOLD,20);
		
		
		l1 = new Label("will be Uploaded");
		l1.setFont(f1);
		add(l1);
		l1.setBounds(50,50,500,200);
		l1.setForeground(Color.BLACK);
		
	}
	public static void main(String args[])
	{
			MyFrame4 mf4 = new MyFrame4();
			mf4.setVisible(true);
	}
}
