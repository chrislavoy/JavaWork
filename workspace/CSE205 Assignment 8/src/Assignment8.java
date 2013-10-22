// Assignment #: 8
//         Name: Chris LaVoy
//    StudentID: 1201806935
//      Lecture: 71081
//  Description: The Assignment 8 class displays a menu of choices to a user
//               and performs the chosen task. It will keep asking a user to
//               enter the next choice until the choice of 'Q' (Quit) is
//               entered. It will create an object of BankSystem containing a list
//               of banks and customers, and perform insertion, deletion,
//               search, sorting, displaying, closing, writing to a file,
//               and reading from a file.

import java.io.*;

public class Assignment8
 {
  public static void main (String[] args)
   {
     char input1;
     String inputInfo = new String(), inputInfo2 = new String();
     String inputInfo3 = new String(), inputInfo4 = new String();
     boolean operation = false;
     int operation2 = 0;
     int bankID;
     String line = new String();
     String customerInfo = new String(), bankInfo = new String();
     String filename = new String();

     // create a BankSystem object. This is used throughout this class.
     BankSystem bankSystem1 = new BankSystem();

     try
      {
       // print out the menu
       printMenu();

       // create a BufferedReader object to read input from a keyboard
       InputStreamReader isr = new InputStreamReader (System.in);
       BufferedReader stdin = new BufferedReader (isr);

       do
        {
         System.out.print("What action would you like to perform?\n");
         line = stdin.readLine().trim();  //read a line
         input1 = line.charAt(0);
         input1 = Character.toUpperCase(input1);

         if (line.length() == 1)          //check if a user entered only one character
          {
           switch (input1)
            {
             case 'A':   //Add Customer
               System.out.print("Please enter the customer information to add:\n");
               inputInfo = stdin.readLine().trim();
/************************************************************************************
***  ADD your code to add a Customer object
***********************************************************************************/
               if (operation == true)
                System.out.print("customer added\n");
               else
                System.out.print("customer exists\n");
               break;
             case 'B':   //Add Bank
               System.out.print("Please enter the bank information to add:\n");
               inputInfo = stdin.readLine().trim();
/************************************************************************************
***  ADD your code to add a Bank object
***********************************************************************************/
               if (operation == true)
                 System.out.print("bank added\n");
               else
                 System.out.print("bank exists\n");
               break;
             case 'D':   //Search for Customerr
               System.out.print("Please enter the customerID of a customer to search:\n");
               inputInfo = stdin.readLine().trim();
/************************************************************************************
***  ADD your code to check the existence of a Customer object
***********************************************************************************/
               if (operation2 > -1)
                 System.out.print("customer found\n");
               else
                 System.out.print("customer not found\n");
               break;
             case 'E':  //Search for Bank
               System.out.print("Please enter the bank's name to search:\n");
               inputInfo = stdin.readLine().trim();
               System.out.print("Please enter the bank's id to search:\n");
               inputInfo2 = stdin.readLine().trim();
               bankID = Integer.parseInt(inputInfo2);
               System.out.print("Please enter the bank's city to search:\n");
               inputInfo3 = stdin.readLine().trim();
               System.out.print("Please enter the bank's state to search:\n");
               inputInfo4 = stdin.readLine().trim();
/************************************************************************************
***  ADD your code to check the existence of a Bank object
************************************************************************************/

               if (operation2 > -1)
                 System.out.print("bank found\n");
               else
                 System.out.print("bank not found\n");
               break;
             case 'L':   //List Customers
/************************************************************************************
***  ADD your code to print out the list of Customers
***********************************************************************************/
               break;
             case 'M':   //List Banks
/************************************************************************************
***  ADD your code to print out the list of Banks
***********************************************************************************/
               break;
             case 'O':  // Sort Customers
/************************************************************************************
***  ADD your code to sort the list of Customers
***********************************************************************************/
               System.out.print("customers sorted\n");
               break;
             case 'P':  // Sort Banks
/************************************************************************************
***  ADD your code to sort the list of Banks
***********************************************************************************/
               System.out.print("banks sorted\n");
               break;
             case 'Q':   //Quit
               break;
             case 'R':  //Remove Customer
               System.out.print("Please enter the customerID to remove:\n");
               inputInfo = stdin.readLine().trim();
/************************************************************************************
***  ADD your code to remove a Customer
************************************************************************************/
               if (operation == true)
                 System.out.print("customer removed\n");
               else
                 System.out.print("customer not found\n");
               break;
             case 'S':  //Remove Bank
               System.out.print("Please enter the bank's name to remove:\n");
               inputInfo = stdin.readLine().trim();
               System.out.print("Please enter the bank's id to remove:\n");
               inputInfo2 = stdin.readLine().trim();
               bankID = Integer.parseInt(inputInfo2);
               System.out.print("Please enter the bank's city to remove:\n");
               inputInfo3 = stdin.readLine().trim();
               System.out.print("Please enter the bank's state to remove:\n");
               inputInfo4 = stdin.readLine().trim();
/************************************************************************************
***  ADD your code to remove a Bank
************************************************************************************/
               if (operation == true)
                 System.out.print("bank removed\n");
               else
                 System.out.print("bank not found\n");
               break;
             case 'T':  //Close BankSystem
/************************************************************************************
***  ADD your code to close the bank system
***********************************************************************************/
               System.out.print("bank system closed\n");
               break;
             case 'U':  //Write Text to a File
               System.out.print("Please enter a file name to write:\n");
               filename = stdin.readLine().trim();
/************************************************************************************
***  ADD your code to write a text (string) to the specified file. Catch exceptions.
************************************************************************************/
               break;
             case 'V':  //Read Text from a File
               System.out.print("Please enter a file name to read:\n");
               filename = stdin.readLine().trim();
/************************************************************************************
***  ADD your code to read a text (string) from the specified file. Catch exceptions.
************************************************************************************/
               break;
             case 'W':  //Serialize BankSystem to a File
               System.out.print("Please enter a file name to write:\n");
               filename = stdin.readLine().trim();
/************************************************************************************
***  ADD your code to write the bank system object to the specified file. Catch exceptions.
************************************************************************************/
               break;
              case 'X':  //Deserialize BankSystem from a File
               System.out.print("Please enter a file name to read:\n");
               filename = stdin.readLine().trim();
/************************************************************************************
***  ADD your code to read a bank system object from the specified file. Catch exceptions.
***********************************************************************************/
               break;
             case '?':   //Display Menu
               printMenu();
               break;
             default:
               System.out.print("Unknown action\n");
               break;
            }
         }
        else
         {
           System.out.print("Unknown action\n");
          }
        } while (input1 != 'Q' || line.length() != 1);
      }
     catch (IOException exception)
      {
        System.out.print("IO Exception\n");
      }
   }

  /** The method printMenu displays the menu to a user **/
  public static void printMenu()
   {
     System.out.print("Choice\t\tAction\n" +
                      "------\t\t------\n" +
                      "A\t\tAdd Customer\n" +
                      "B\t\tAdd Bank\n" +
                      "D\t\tSearch for Customer\n" +
                      "E\t\tSearch for Bank\n" +
                      "L\t\tList Customers\n" +
                      "M\t\tList Banks\n" +
                      "O\t\tSort Customers\n" +
                      "P\t\tSort Banks\n" +
                      "Q\t\tQuit\n" +
                      "R\t\tRemove Customer\n" +
                      "S\t\tRemove Bank\n" +
                      "T\t\tClose BankSystem\n" +
                      "U\t\tWrite Text to File\n" +
                      "V\t\tRead Text from File\n" +
                      "W\t\tSerialize BankSystem to File\n" +
                      "X\t\tDeserialize BankSystem from File\n" +
                      "?\t\tDisplay Help\n\n");
  }
} // end of Assignment8 class
