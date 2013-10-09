// Assignment #: 6
//         Name: Chris LaVoy
//    StudentID: 1201806935
//      Lecture: MWF 10:30 - 11:20
//  Description: it needs to be filled

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.text.NumberFormat;
import java.util.*;

public class CreatePanel extends JPanel
 {
   private Vector accountList;
   private JButton button1;
   private TransferPanel transferPanel;
   private JLabel errorLabel;
   private JLabel accountIDLabel;
   private JLabel amountLabel;
   private JTextField accountID;
   private JTextField amount;
   private JTextArea balanceWindow;
   private JPanel p1;
   private JPanel p2;
   private JPanel p3;
   private JPanel p4;
   private JPanel p5;
   private JPanel p6;

 //Constructor initializes components and organize them using certain layouts
 public CreatePanel(Vector accountList, TransferPanel tPanel)
  {
    this.accountList = accountList;
    this.transferPanel = tPanel;
    p1 = new JPanel();
    p2 = new JPanel();
    // left side panels
    p3 = new JPanel();
    p4 = new JPanel();
    p5 = new JPanel();
    p6 = new JPanel();

      // orgranize components here
      // here is an example

    button1 = new JButton("Create an Account");
    ButtonListener bl = new ButtonListener();
    button1.addActionListener(bl);
    errorLabel = new JLabel("TEST_ERROR");
    errorLabel.setForeground(Color.red);
    accountIDLabel = new JLabel("Account ID");
    amountLabel = new JLabel("Amonut");
    accountID = new JTextField("");
    amount = new JTextField("");
    balanceWindow = new JTextArea(20, 30);
    
    p3.add(errorLabel);
    
    p4.add(accountIDLabel);
    p4.add(accountID);
    p4.add(amountLabel);
    p4.add(amount);
    p4.setLayout(new GridLayout(2, 2));
    
    p5.add(button1);
    
    p1.add(p3);
    p1.add(p4);
    p1.add(p5);
    p1.add(p6);
    p1.setLayout(new GridLayout(5, 1));
    
    p2.add(balanceWindow);
    
    add(p1);
    add(p2);
    this.setLayout(new GridLayout(1, 2));
    
  }


  //ButtonListener is a listener class that listens to
  //see if the buttont "Create an account" is pushed.
  //When the event occurs, it adds an account information from
  //the text fields to the text. It also creates an Account object
  //using these two information and add it to the accountList.
  //It also does error checking.
  private class ButtonListener implements ActionListener
   {
	  NumberFormat nf = NumberFormat.getCurrencyInstance();
    public void actionPerformed(ActionEvent event)
     {
    	try {
    		String bankName = accountID.getText();
    		double amountNum = Double.parseDouble(amount.getText());
    		
    		if(bankName.equals("") || amount.equals("") || (bankName.equals("") && amount.equals("")))
        	{ 
        		errorLabel.setText("Please fill both id and amount");
        	}
        	else
        	{
        		balanceWindow.append(bankName + ":  " + nf.format(amountNum) + "\n");
        		errorLabel.setText("Account added.");
        	}
    		
    	} catch(NumberFormatException e) {
    		errorLabel.setText("Please enter a number for the amount");
    	}
    	
         // if there is no error, add an account to account list
         // otherwise, show an error message
    	
     } //end of actionPerformed method
  } //end of ButtonListener class

} //end of CreatePanel class