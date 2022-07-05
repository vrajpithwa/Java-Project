import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;


public class MyFrame6 extends JFrame
{
	Font f1,f2;
	JButton b1;
	JLabel lbl_title,lDashboard,lPic;
	JTextField t1;
	
	MyActionListener ml;
	MyFrame6()
	{
		
		super("TaxPayment");
		setLayout(null);
		//setBounds(100,50,800,800);
		setSize(1366,768);
		//setBackground(new Color(50,50,50));
		f1 = new Font("Arial",Font.BOLD,20);
		f2 = new Font("Arial",Font.BOLD | Font.ITALIC,15);
		lbl_title = new JLabel("MUNCIPAL TAX COLLECTION & MANAGEMENT SYSTEM");
		lbl_title.setBounds(200,50,600,80);
		lbl_title.setForeground(Color.BLACK);
		lbl_title.setFont(f1);
		add(lbl_title);
		ImageIcon MTCAMS = new ImageIcon("MTCAMS.png");
		lPic = new JLabel(MTCAMS);
		lPic.setBounds(20,30,MTCAMS.getIconWidth(),MTCAMS.getIconHeight());
		lPic.setVisible(true);
		add(lPic);
		
		ImageIcon DashBoard = new ImageIcon("Dash.png");
		lDashboard = new JLabel(DashBoard);
		lDashboard.setBounds(0,0,DashBoard.getIconWidth(),DashBoard.getIconHeight());
		lDashboard.setVisible(true);
		add(lDashboard);
		
		
		//ml = new MyActionListener(this);
		
		
	}
	public static void main(String args[])
	{
			MyFrame6 mf6 = new MyFrame6();
			mf6.setVisible(true);
	}
}
