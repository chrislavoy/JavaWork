// Assignment #: 8
// This file is given by the instructor.
//  Description: This is a utility class that takes a string containing
// a customer's information and parse it to create a customer object.

public class CustomerParser 
 {

 public static Customer parseStringToCustomer(String lineToParse)
  {
   String temp1 = new String();
   String temp2 = new String();
   String temp3 = new String();
   String temp4 = new String();
   String name = new String();

   Customer customer = new Customer();

   try
    {
     String[] tokens = lineToParse.split(":");


     //get a combination of first name and last name
     if (tokens[0].length() > 0)
      name = tokens[0];

     //get an customer ID
     if (tokens[1].length() > 0)
      {
       temp3 = tokens[1];
       customer.setCustomerID(temp3.trim());
      }

     //get a cash amount
     if (tokens.length == 3 && tokens[2].length() > 0)
      {
       temp4 = tokens[2];
       customer.setCashAmount( Double.parseDouble(temp4.trim()));
      }

     name=name.trim();

     String[] tokens2 = name.split(",");

     //get a last name
     if (tokens2[0].length() > 0)
      {
       temp1 = tokens2[0];
       customer.setLastName(temp1.trim());
      }

     //get a first name
     if (tokens2.length == 2 && tokens2[1].length() > 0)
      {
       temp2 = tokens2[1];
       customer.setFirstName(temp2.trim());
      }
     return customer;
    }
   catch(NumberFormatException exception)
    {
     System.out.print("Invalid String\n");
     return customer;
    }
  }

}

