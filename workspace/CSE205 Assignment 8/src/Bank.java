import java.io.Serializable;

// Assignment #: 8
//         Name: Chris LaVoy
//    StudentID: 1201806935
//      Lecture: 71081
//  Description: It represents a bank account. The class Bank contains information about a bank that
//  a customer can have an account with.

public class Bank implements Comparable, Serializable
 {
  // instance variables
  private String bankName;
  private int bankID;
  private Address bankAddress;

  /************************************************************************
  Constructor method to set up the new Bank object, storing initial values
  ************************************************************************/
  public Bank()
   {
    bankName = new String("?");
    bankID = 0;
    bankAddress = new Address();
   }

  /************************************************************************
  Accessor method:
  This method returns the name of the bank.
  ************************************************************************/
  public String getBankName()
   {
    return bankName;
   }

  /************************************************************************
  Accessor method:
  This method returns the id of the bank.
  ************************************************************************/
  public int getBankID()
   {
    return bankID;
   }

  /************************************************************************
  Accessor method:
  This method returns the address of the bank.
  ************************************************************************/
  public Address getBankAddress()
   {
    return bankAddress;
   }

  /************************************************************************
  Modifier method:
  This method sets the name of a bank given by its parameter.
  ************************************************************************/
  public void setBankName(String bankName)
   {
    this.bankName = bankName;
   }

  /************************************************************************
  Modifier method:
  This method sets the id of a bank given by its parameter.
  ************************************************************************/
  public void setBankID(int bankID)
   {
    this.bankID = bankID;
   }

  /************************************************************************
  Modifier method:
  This method sets the address of a bank given by its parameters.
  ************************************************************************/
  public void setBankAddress(String city, String state)
   {
    bankAddress.setCity(city);
    bankAddress.setState(state);
   }

  /************************************************************************
	This method returns a String containing attribute(variable) values
	of a bank.
  ************************************************************************/
  public String toString()
   {
    String result = "\nBank name:\t\t" + bankName + "\n" +
            "Bank ID:\t\t" + bankID + "\n" +
            "Bank address:\t\t" + bankAddress.toString() + "\n\n";

    return result;
   }

@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (bankName.length() < o.toString().length())
		{
			return -1;
		}
		else if(bankName.length() > o.toString().length())
		{
			return 1;
		}
		else
		{
			if (bankID < o.toString().length())
			{
				return -1;
			}
			else if (bankID > o.toString().length())
			{
				return 1;
			}
			else
			{
				if (bankAddress.compareTo(o) > 0)
				{
					return 1;
				}
				else if (bankAddress.compareTo(o) < 0)
				{
					return -1;
				}
				else
				{
					return 0;
				}
			}
		}
	}
}
