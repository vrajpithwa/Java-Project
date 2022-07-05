import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.net.URL;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
 
public class MyFrame3 extends JFrame {
    //Typing Bar
    private JTextField inputBar = new JTextField();
      
    //Chat Outpu Area
    private JTextArea chatOutput = new JTextArea();
    
    public MyFrame3() {
        //Creating the Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);
        this.setResizable(false);
         
         
          // Setting GUI title 
          this.setTitle("Customer Service ChatBot");
        
        // creating inputBar 
        inputBar.setLocation(10, 520);
        inputBar.setSize(500, 30);
 
        //inputBar Action Event
        inputBar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                String userInput = inputBar.getText();
                chatOutput.append("You: " + userInput + "\n");
                
                if(userInput.contains("help")) {
                    botOutput("Please select a catagory I can assist you with:\n ~TYPE 1 WATER TAX RELATED ISSUE\n~TYPE 2 PROPERTY TAX RELATED ISSUE\n~TYPE 3 PAYMENT RELATED ISSUE ");
                }
                
                else if(userInput.contains("1")){
                    botOutput("Please select area needing assistance: \n~TYPE a Amount inquiry\n~TYPE b Payment Status  ");
                }
                else if(userInput.contains("a")){
                    botOutput("Please wait while we connect you!");
                   
                }
                else if(userInput.contains("b")){
                    botOutput("You can check your payment status from the menu bar  ");
                   
                }
                else if(userInput.contains("2")){
                    botOutput("Please select area needing assistance: \n~TYPE c Tax related");
                   
                }
                 else if(userInput.contains("c")){
                    botOutput("Go the menu bar select new payment and then proceed.");
                         
                }
               else if(userInput.contains("3")){
                 botOutput("if you are not able to proceed the payment there must be some issue with the kindly restart the program.");
 
               }
                
                inputBar.setText("\n");
            }
        });
        
      //chatOutput
        chatOutput.setLocation(15, 5);
        chatOutput.setSize(560, 510);
        chatOutput.setLineWrap(true);
        chatOutput.setEditable(false);
        
        //Frame items
        this.add(inputBar);
        this.add(chatOutput);
    }
    
    public void botOutput(String s){
        chatOutput.append("ChatBot: " + s + "\n");
    }
    
    public static void main(String[] args){
        new MyFrame3();
    }
  
}