/**

* @author Vraj Pithwa - Dhruvi Kothari
 
*/


import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.ArrayList;
import java.io.File;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.mail.*;  
import javax.mail.internet.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class MyActionListener implements ActionListener,ItemListener
{

	//ArrayList<String> userName = new ArrayList<String>();
	JFrame f = new JFrame();
	MyFrame mf;
	MyFrame1 mf1;
	MyFrame2 mf2;
	MyFrame3 mf3;
	MyFrame4 mf4;
	MyFrame6 mf6;
	MyFrame7 mf7;
	MyFrame8 mf8;
	Username un;
	
	MyActionListener(MyFrame m)
	{
		this.mf = m;
	}

	MyActionListener(MyFrame1 m)
	{
		this.mf1 = m;
	}
	
	MyActionListener(MyFrame2 m)
	{
		this.mf2 = m;
	}
	
	MyActionListener(MyFrame3 m)
	{
		this.mf3 = m;
	}
	
	MyActionListener(MyFrame6 m)
	{
		this.mf6 = m;
	}
	
	MyActionListener(MyFrame7 m)
	{
		this.mf7 = m;
	}
	
	MyActionListener(MyFrame8 m)
	{
		this.mf8 = m;
	}
	
	MyActionListener(MyFrame4 m)
	{
		this.mf4 = m;
	}
	MyActionListener(Username m)
	{
		this.un = m;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Login"))
		{
			System.out.println(e.getActionCommand());
			mf1 = new MyFrame1();
			this.mf1.setExtendedState(mf1.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			mf1.setVisible(true);
			mf.setVisible(false);
			Username data = new Username(this.mf.t1.getText(),this.mf.t3.getText(),this.mf.t2.getText());
			//System.out.println(data);
			String newdata = "\n" +data;
			try 
			{
				FileWriter fw = new FileWriter("UsernameData.txt",false);
				fw.write(newdata);
				fw.close();
				char ch[] = new char[1000];
				FileReader fr = new FileReader("UsernameData.txt");
				fr.read(ch);
				fr.close();
				
				String records = new String(ch);
				
				String record[] = records.split("_");
				
				System.out.println(record.length);
				
				
				Username uname[] = new Username[record.length];
				
				for(int i=0;i<record.length;i++)
				{
					String attr[] = record[i].split("#");
					uname[i] = new Username(attr[0], attr[1], attr[2]);
				}
				this.mf1.b2.setText("Username:- "+uname[record.length-1].getName());
				System.out.println("Username:- "+uname[record.length-1].getName());
			}
			catch(Exception e1) {
				System.out.println(e1);
			}
			System.out.println(java.time.LocalDate.now());
			//this.mf1.b3.setText(java.time.LocalDate.now());
			//this.mf1.b3.setText(new Integer(Integer.parseInt(java.time.LocalDate.now()).toString()));

		}
		if(e.getActionCommand().equals("Reset"))
		{
			System.out.println(e.getActionCommand());
			mf = new MyFrame();
			mf.setVisible(true);
		}
		
		if(e.getActionCommand().equals("CHAT BOT"))
		{
			System.out.println("condition entered");
			System.out.println(e.getActionCommand());
			mf3 = new MyFrame3();
			mf3.setVisible(true);
			//mf1.setVisible(false);
		}
		
		if(e.getActionCommand().equals("New Payment"))
		{
			System.out.println("Newpayment");
			mf2 = new MyFrame2();
			mf2.setVisible(true);
		}
		
		if(e.getActionCommand().equals("Close"))
		{
			System.out.println("Close");
			System.out.println(e.getActionCommand());
			mf = new MyFrame();
			System.exit(0);
			// mf.setVisible(false);
			// mf1.setVisible(false);
			// mf2.setVisible(false);
			// mf3.setVisible(false);
			// mf5.setVisible(false);
			// mf6.setVisible(false);
			// mf7.setVisible(false);
			// mf8.setVisible(false);
		}
		
		
		
		if(e.getActionCommand().equals("Proceed"))
		{
			System.out.println("start");
			System.out.println(e.getActionCommand());
			mf6 = new MyFrame6();
			mf6.setVisible(true);
			mf2.setVisible(false);

			JOptionPane.showMessageDialog(f,"Payment Reciept is sent to your respective email address :)");
			
			String host="smtp.gmail.com";  
		final String user="dhruvi.kothari114673@marwadiuniversity.ac.in";//your email address
		final String password="Dkk@2503abcd";//password  
		String to="ketanpithva@yahoo.in";//change accordingly  
  
		//Get the session object  
		Properties props = new Properties();  
		props.put("mail.smtp.port","467");
		props.put("mail.smtp.host",host);  
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.ssl.required", "true");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	
		Session session = Session.getDefaultInstance(props,  
				new javax.mail.Authenticator() 
				{  
					protected PasswordAuthentication getPasswordAuthentication() {  
					return new PasswordAuthentication(user,password);  
				}  
			});  
  
		//Compose the message  
		try 
		{  
			MimeMessage message = new MimeMessage(session);  
			message.setFrom(new InternetAddress(user));  
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
			message.setSubject("MUNICIPAL TAX COLLECTION AND MANAGEMENT");  
			message.setText("Your payment has been successful"+ "\n\n" +"Your Sincerely,"+ "\n"+"Municipal Corporation");  
			//Using HTML
			//message.setContent("Thanks for Learning <b>JAVA</b>");
			//send the message  
			Transport.send(message);  
			System.out.println("Mail Sent Successfully :)");  
   
		} 
		catch (MessagingException m) 
		{
			m.printStackTrace();
		}  

		}
		
		if(e.getActionCommand().equals("History"))
		{
			System.out.println("History");
			System.out.println(e.getActionCommand());
			mf7 = new MyFrame7();
			mf7.setVisible(true);	
		}
		
		if(e.getActionCommand().equals("Check Amount"))
		{
			System.out.println("Amount");
			System.out.println(e.getActionCommand());
			mf8 = new MyFrame8();
			mf8.setVisible(true);
			
		}
		
		if(e.getActionCommand().equals("Help"))
		{
			System.out.println("Help");
			System.out.println(e.getActionCommand());
			mf4 = new MyFrame4();
			mf4.setVisible(true);
		}
		
		if(e.getActionCommand().equals("OK"))
		{
			System.out.println("start");
			System.out.println(e.getActionCommand());
			
			JOptionPane.showMessageDialog(f,"History is sent to your respective email address :)");
			
			String host="smtp.gmail.com";  
		final String user="dhruvi.kothari114673@marwadiuniversity.ac.in";//your email address
		final String password="Dkk@2503abcd";//password  
		String to="dhruvi.kothari03@gmail.com";//change accordingly  
  
		//Get the session object  
		Properties props = new Properties();  
		props.put("mail.smtp.port","467");
		props.put("mail.smtp.host",host);  
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.ssl.required", "true");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	
		Session session = Session.getDefaultInstance(props,  
				new javax.mail.Authenticator() 
				{  
					protected PasswordAuthentication getPasswordAuthentication() {  
					return new PasswordAuthentication(user,password);  
				}  
			});  
  
		//Compose the message  
		try 
		{  
			MimeMessage message = new MimeMessage(session);  
			message.setFrom(new InternetAddress(user));  
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
			message.setSubject("MUNICIPAL TAX COLLECTION AND MANAGEMENT");  
			message.setText("Name: User"+ "\n\n" +"UserID: ******* "+ "\n"+"Municipal Corporation");  
			//Using HTML
			//message.setContent("Thanks for Learning <b>JAVA</b>");
			//send the message  
			Transport.send(message);  
			System.out.println("Mail Sent Successfully :)");  
   
		} 
		catch (MessagingException m) 
		{
			m.printStackTrace();
		}  
			
		}
	
	}	
 	
	
	public void itemStateChanged(ItemEvent e1)
	{
		
	}	
}