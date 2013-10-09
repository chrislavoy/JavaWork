// Assignment #: 6
//         Name: Chris LaVoy
//    StudentID: 1201806935
//      Lecture: MWF 10:30 - 11:45
//  Description: it needs to be filled

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class TransferPanel extends JPanel
 {
   private Vector accountList;

   //Constructor initialize each component and arrange them using
   //certain layouts
   public TransferPanel(Vector accountList)
     {
      this.accountList = accountList;

      // orgranize components for transfer panel
      }

    //This method  refreshes the JComboBoxes with
    //updated vector information
    public void updateAccountList()
     {
       //call updateUI() for two combo boxes
     }

 //ButtonListener class listens to see the button "Transfer!" is pushed.
 //A user can choose which bank account to transfer from and another account to transfer to,
 //then choose a transfer amount and push the "Transfer" button.
 //This should update both FROM and TO account balances and display them
 //below the "Transfer!" button
 //(You should make use of the toString( ) method of the Account class. )
 private class ButtonListener implements ActionListener
  {
       public void actionPerformed(ActionEvent event)
        {
         // if there is no error, FROM and TO account balances
         // should be updated and displayed below the "Transfer!" button.

        }
  } //end of ButtonListener class

} //end of TransferPanel class