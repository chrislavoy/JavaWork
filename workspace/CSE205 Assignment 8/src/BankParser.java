// Assignment #: 8
// This file is given by the instructor.
//  Description: The BankParser class contains a static
//               method parseStringToBank that takes a string
//               containing a bank's information and
//               create a bank object from it.

public class BankParser 
 {

 public static Bank parseStringToBank(String lineToParse)
  {
     String bankName = new String("?");
     String id = new String("0");
     String city = new String("?");
     String state = new String("?");

     String[] tokens = lineToParse.split("/");

     //create a Bank object using extracted information.
     Bank bank = new Bank();


     //get the bankName
     if (tokens[0].length() > 0)
      {
       bankName = tokens[0].trim();
       bank.setBankName(bankName);
      }

     //get the id
     if (tokens[1].length() > 0)
      {
       id = tokens[1].trim();
       bank.setBankID(Integer.parseInt(id));
      }


     //get the address
     if (tokens[2].length() > 0)
      {
       String address = tokens[2].trim();
       String[] tokens2 = address.split(",");

       //get the cpu type and speed
       if (tokens2[0].length() > 0)
          city = tokens2[0].trim();
       if (tokens2[1].length() > 0)
          state = tokens2[1].trim();

       bank.setBankAddress(city, state);
      }

     return bank;
  } //end of parseStringToBank

} //end of BankParser class

