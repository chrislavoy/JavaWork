// Assignment #: 6
//         Name: Chris LaVoy
//    StudentID: 1201806935
//      Lecture: MWF 10:30 - 11:20
//  Description: The class Account represents an account of some bank,
//               with its name and balance amount.

import java.text.NumberFormat;

public class Account
 {
   private String name;
   private double amount;

   //Constructor to initialize all member variables
   public Account(String aName, double someAmount)
    {
     name = aName;
     amount = someAmount;
    }

   //Accessors of name and amount
   public String getName()
    {
      return name;
    }

   public double getAmount()
    {
      return amount;
    }

   //Mutators of name and amount
   public void setName(String aName)
    {
     name = aName;
    }

   public void setAmount(double someAmount)
    {
     amount = someAmount;
    }

   //toString() method returns a string containg the name and amount of the account
   public String toString()
    {
      NumberFormat money = NumberFormat.getCurrencyInstance();

      String result = name + ":   " + money.format(amount);
      return result;
     }
  }