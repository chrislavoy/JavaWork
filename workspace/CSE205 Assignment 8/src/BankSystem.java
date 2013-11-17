// Assignment #: 8
//         Name: Chris LaVoy
//    StudentID: 1201806935
//      Lecture: 71081
//  Description:

import java.io.Serializable;
import java.util.ArrayList;

public class BankSystem implements Serializable
{
	private ArrayList customerList;
	private ArrayList bankList;
	
	public BankSystem()
	{
		customerList = new ArrayList();
		bankList = new ArrayList();
	}
	
	public int customerExists(String s)
	{
		//create a copy of customerList as an array
		Object[] list = customerList.toArray();
		
		//search each index for the customerID
		for (int i = 0; i < list.length; i++)
		{
			if (list[i].toString().equals(s))
			{
				return i;
			}
			//if the last index of the array does not equal s, then return -1
			else if (!list[list.length-1].toString().equals(s))
			{
				return -1;
			}
		}
		return -1;
	}
	
	public boolean addCustomer(String s)
	{
		if (customerExists(s) > -1)
		{
			customerList.add(s);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean removeCustomer(String s)
	{
		if (customerExists(s) > -1)
		{
			int i = customerExists(s);
			customerList.remove(i);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void sortCustomers()
	{
		//sort customers
	}
	
	public String listCustomers()
	{
		String result = "";
		
		for(int i = 0; i < customerList.size(); i++)
		{
			result += customerList.get(i).toString();
		}
		
		return result;
	}
	
	public int bankExists(String bankName, int bankID, String city, String state)
	{
		Object[] list = bankList.toArray();
		
		for (int i = 0; i < list.length; i++)
		{
			if (list[i].toString().equals(bankName))
			{
				if (list[i].toString().equals(bankID))
				{
					if (list[i].toString().equals(city))
					{
						if (list[i].toString().equals(state))
						{
							return i;
						}
					}
				}
			}
			//if the last index of the array does not equal s, then return -1
			else if (!list[list.length-1].toString().equals(s))
			{
				return -1;
			}
		}
	}
	
	public boolean addBank(String s)
	{
		BankParser.parseStringToBank(s);
		
		if (bankExists(s) > -1)
		{
			customerList.add(s);
			return true;
		}
		else
		{
			return false;
		}
	}
}
