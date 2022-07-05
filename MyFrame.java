import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame extends JFrame
{
	
	JButton b1,b2;
	JTextField t1,t3;
	JPasswordField t2;
	JLabel l1,l2,l3,lDashboard,lbl_title,lPic;
	Font f,f1;
	MyActionListener ml = new MyActionListener(this);
	MyFrame()
	{
		super("My Test Application");
		setLayout(null);
		setSize(1366,768);
		
		
		lbl_title = new JLabel("MUNCIPAL TAX COLLECTION & MANAGEMENT SYSTEM");
		add(lbl_title);
		ImageIcon MTCAMS = new ImageIcon("MTCAMS.png");
		lPic = new JLabel(MTCAMS);
		lPic.setBounds(20,30,MTCAMS.getIconWidth(),MTCAMS.getIconHeight());
		System.out.println(MTCAMS.getIconWidth());
		System.out.println(MTCAMS.getIconHeight());
		lPic.setVisible(true);
		add(lPic);
		
		l1 = new JLabel("Username ");
		l1.setForeground(Color.BLACK);
		l2 = new JLabel("Email ");
		l2.setForeground(Color.BLACK);
		l3 = new JLabel("Password ");
		l3.setForeground(Color.BLACK);
		t1=new JTextField();
        t2=new JPasswordField();
		t3 = new JTextField();
		b1 = new JButton("Login");
		b2 = new JButton("Reset");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		add(lbl_title);
		add(l3);
		add(t3);

		ImageIcon DashBoard = new ImageIcon("Dash.png");
		lDashboard = new JLabel(DashBoard);
		lDashboard.setBounds(0,0,DashBoard.getIconWidth(),DashBoard.getIconHeight());
		lDashboard.setVisible(true);
		add(lDashboard);
		
		
		
		lbl_title.setBounds(200,50,600,80);
		lbl_title.setForeground(Color.BLACK);
		t1.setBounds(650,250,250,30);
		t3.setBounds(650,350,250,30);
		b1.setBounds(600,420,100,30);
		b2.setBounds(750,420,100,30);
		l1.setBounds(550,240,150,50);
		l2.setBounds(550,340,150,50);
		l3.setBounds(550,290,150,50);
		t2.setBounds(650,300,250,30);
		
		Font f = new Font("Arial",Font.BOLD,15);
		Font f1 = new Font("Arial",Font.BOLD,20);

		lbl_title.setFont(f1);
		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		t1.setFont(f);
		t2.setFont(f);
		t3.setFont(f);
		b1.setFont(f);
		b2.setFont(f);
		b1.addActionListener(ml);
		b2.addActionListener(ml);
		t1.addActionListener(ml);
		t2.addActionListener(ml);
		
		/*
		this.addComponentListener(new ComponentListener() 
		 {
		 // this method invokes each time you resize the frame
	 	public void componentResized(ComponentEvent e) 
		 	{   
		 		System.out.println(getSize().getWidth());
		 		System.out.println(getSize().getHeight());
		 		lbl_title.setBounds(((int)getSize().getWidth())/7,
		 							((int)getSize().getHeight())/7,
		 							((int)getSize().getWidth())/2,
		 							((int)getSize().getHeight())/17);
		 		System.out.println("lbl_title Changed");
		 		t1.setBounds(((int)getSize().getWidth())/2,
		 							((int)getSize().getHeight())/4,
									((int)getSize().getWidth())/5,
		 							((int)getSize().getHeight())/15);//User
		 		System.out.println("t1 Changed");
		 		t2.setBounds(((int)getSize().getWidth())/2,
		 							((int)getSize().getHeight())/3,
		 							((int)getSize().getWidth())/5,
		 							((int)getSize().getHeight())/15);//password
		 		System.out.println("t2 Changed");
				t3.setBounds(((int)getSize().getWidth())/2,
		 							((int)getSize().getHeight())/2,
		 							((int)getSize().getWidth())/5,
		 							((int)getSize().getHeight())/15);//email
		 		System.out.println("t3 Changed");
				l1.setBounds(((int)getSize().getWidth())/3,
		 							((int)getSize().getHeight())/4,
									((int)getSize().getWidth())/5,
		 							((int)getSize().getHeight())/15);//User
		 		System.out.println("l1 Changed");
		 		l2.setBounds(((int)getSize().getWidth())/3,
		 							((int)getSize().getHeight())/3,
		 							((int)getSize().getWidth())/5,
		 							((int)getSize().getHeight())/15);//password
		 		System.out.println("l2 Changed");
				l3.setBounds(((int)getSize().getWidth())/3,
		 							((int)getSize().getHeight())/2,
		 							((int)getSize().getWidth())/5,
		 							((int)getSize().getHeight())/15);//email
		 		System.out.println("l3 Changed");
				
				/*lpic.setBounds(((int)getSize().getWidth())/66,
		 							((int)getSize().getHeight())/15,
		 							((int)getSize().getWidth())/9,
		 							((int)getSize().getHeight())/4);//Date
		 		System.out.println("lpic Changed");
				
		 	}
		 	public void componentHidden(ComponentEvent e) 
		 	{            

		 	}
		 	public void componentShown(ComponentEvent e) 
		 	{            

		 	}
		 	public void componentMoved(ComponentEvent e) 
		 	{            

			}
		 });*/
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}
	public static void main(String args[])
	{
			MyFrame mf = new MyFrame();
			mf.setVisible(true);
	}
}