import java.io.Serializable;

// Assignment #: 8
//         Name: Chris LaVoy
//    StudentID: 1201806935
//      Lecture: 71081
//  Description:The Address class describes city and state of a bank.
//  It will be used as an aggregate object of the Bank class. It has following attributes:

public class Address implements Comparable, Serializable
 {
   // instance variables
   private String city;
   private String state;

   /************************************************************************
   Constructor method to initialize intance variables.
   ************************************************************************/
   public Address()
    {
     city = new String("?");
     state= new String("?");
    }

   /************************************************************************
   Accessor method:
   This method returns the city of the address.
   ************************************************************************/
   public String getCity()
    {
     return city;
    }

   /************************************************************************
   Accessor method:
   This method returns the state of the address.
   ************************************************************************/
   public String getState()
    {
     return state;
    }

   /************************************************************************
   Modifier method:
   This method sets the city of the address given by its parameter.
   ************************************************************************/
   public void setCity(String city)
    {
     this.city = city;
    }

   /************************************************************************
   Modifier method:
   This method sets the state of the address by its parameter.
   ************************************************************************/
   public void setState(String state)
    {
      this.state = state;
    }

   /************************************************************************
   This method return a string containing the attribute information in address
   ************************************************************************/
   public String toString()
    {
     String result;
     result = city + "," + state;

      return result;
    }

@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (state.length() < o.toString().length())
		{
			return -1;
		}
		else if (state.length() > o.toString().length())
		{
			return 1;
		}
		else
		{
			if (city.length() > o.toString().length())
			{
				return 1;
			}
			if (city.length() < o.toString().length())
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