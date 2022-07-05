import java.net.URL;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame1 extends JFrame
{
	MenuBar mb1;
	Menu m1,m2,m3,m4,m5;
	Font f1,f2;
	MenuItem mi1,mi2,mi3,mi4,mi5;
	JButton b2,b3;
	JLabel l1,lPic,label,lDashboard,lbl;
	MyActionListener ml = new MyActionListener(this);
	MyFrame1()
	{
		
		super("My Frame - 1");
		setLayout(null);
		setSize(1366,768);
		
		f1 = new Font("Arial",Font.BOLD,25);
		f2 = new Font("Arial",Font.BOLD | Font.ITALIC,15);
		
		mb1 = new MenuBar();
		m1 = new Menu("Menu");
		m2 = new Menu("Payment");
		m5 = new Menu("Help");
		mi5 = new MenuItem("CHAT BOT");
		mi2 = new MenuItem("History");
		mi1 = new MenuItem("Close");
		mi3 = new MenuItem("New Payment");
		
		//b1 = new JButton("CHAT BOT");
		//add(b1);
		//b1.setBounds(450,550,200,50);
		l1 = new JLabel("MUNCIPAL TAX COLLECTION & MANAGEMENT SYSTEM");
		add(l1);
		ImageIcon MTCAMS = new ImageIcon("MTCAMS.png");
		lPic = new JLabel(MTCAMS);
		lPic.setBounds(20,30,MTCAMS.getIconWidth(),MTCAMS.getIconHeight());
		lPic.setVisible(true);
		add(lPic);
		b2 = new JButton("User :");
		add(b2);
		b3 = new JButton("Date :");
		add(b3);
		this.setBackground(Color.white);
		ImageIcon DashBoard = new ImageIcon("Dash.png");
		lDashboard = new JLabel(DashBoard);
		lDashboard.setBounds(0,0,DashBoard.getIconWidth(),DashBoard.getIconHeight());
		lDashboard.setVisible(true);
		add(lDashboard);
		
		b2.setFont(f2);
		b3.setFont(f2);
		l1.setFont(f1); 
		m1.setFont(f1);
		m5.setFont(f1);
		m2.setFont(f1);
		mi2.setFont(f1);
		mi3.setFont(f1);
		
		mi5.setFont(f1);
		
		m1.add(m2);
		m1.add("-");
		m1.add(mi2);
		m1.add("-");
		mb1.add(m1);
		m1.add(mi1);
		mb1.add(m5);
		setMenuBar(mb1);
		m5.add(mi5);
		m2.add(mi3);
		
		
		mi1.addActionListener(ml);
		mi2.addActionListener(ml);
		mi3.addActionListener(ml);
		
		b2.addActionListener(ml);
		b3.addActionListener(ml);
		m5.addActionListener(ml);
		mi5.addActionListener(ml);
		
		this.addComponentListener(new ComponentListener() 
		 {
		 // this method invokes each time you resize the frame
	 	public void componentResized(ComponentEvent e) 
		 	{   
		 		System.out.println(getSize().getWidth());
		 		System.out.println(getSize().getHeight());
		 		l1.setBounds(((int)getSize().getWidth())/7,
		 							((int)getSize().getHeight())/7,
		 							((int)getSize().getWidth())/2,
		 							((int)getSize().getHeight())/17);
		 		System.out.println("l1 Changed");
		 		b2.setBounds(((int)getSize().getWidth())/5,
		 							((int)getSize().getHeight())/3,
									((int)getSize().getWidth())/5,
		 							((int)getSize().getHeight())/15);//User
		 		System.out.println("l2 Changed");
		 		b3.setBounds(((int)getSize().getWidth())/5,
		 							((int)getSize().getHeight())/2,
		 							((int)getSize().getWidth())/5,
		 							((int)getSize().getHeight())/15);//Date
		 		System.out.println("l3 Changed");
				/*lpic.setBounds(((int)getSize().getWidth())/66,
		 							((int)getSize().getHeight())/15,
		 							((int)getSize().getWidth())/9,
		 							((int)getSize().getHeight())/4);//Date
		 		System.out.println("lpic Changed");*/
				
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
		 });
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
			MyFrame1 mf = new MyFrame1();
			mf.setVisible(true);
	}
}
