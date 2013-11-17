import java.util.ArrayList;
import java.util.ListIterator;

// Assignment #: 8
//         Name: Chris LaVoy
//    StudentID: 1201806935
//      Lecture: 71081
//  Description: A utility class that will sort the customer list and the bank list

public class Sorts
{
	private static ArrayList a;
	ListIterator i = a.listIterator();
	ListIterator j = a.listIterator(a.size() - 1);
	
	public static void sort(ArrayList objects)
	{
		a = objects;
		Object from = a.get(0);
		Object to = a.get(a.size()-1);
		
		if (from.toString().compareTo(to.toString()) > 0)
		{
			return;
		}
		
		if(from.toString().compareTo(to.toString()) < 0)
		{
			
		}
		
	}
	
	private static void swap(Object i, Object j)
	{
		Object temp = i;
		i = j;
		j = temp;
	}
	
	private Object partition(Object from, Object to)
	{
		i = a.listIterator();
		j = a.listIterator(a.size() - 1);
		
		Object pivot = a.indexOf(from);
		String sPivot = pivot.toString();
		
		while ()
		{
			
		}
	}
}
