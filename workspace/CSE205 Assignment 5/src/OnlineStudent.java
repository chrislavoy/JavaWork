// Assignment #: 5
//         Name: Chris LaVoy
//    StudentID: 1201806935
//      Lecture: MWF 10:30am
//  Description: The Assignment 5 class displays a menu of choices
//               (add online student or on campus student,
//               compute their tuition, count certain students, list students,
//               quit, display menu) to a user.
//               Then it performs the chosen task. It will keep asking a user to
//               enter the next choice until the choice of 'Q' (Quit) is
//               entered.

import java.text.NumberFormat;

public class OnlineStudent extends Student 
{

	private double computingFee;

	//Constructor imports parameters and initializes its own and sends the appropriate parameters back to the super class
	public OnlineStudent (String fName, String lName, String id, int credits, double rate, double compFee)
	{
		super(fName, lName, id, credits, rate);
		
		computingFee = compFee;
		
		super.tuition = 0.0;
	}
	
	//computes the student's tuition
	public void computeTuition()
	{
		tuition = (rate + computingFee)*creditNum;
	}
	
	//Modifies the toString method to add the appropriate changes for the Online student
	public String toString()
	{
		return "\nOnline Student:\n"
				+ super.toString()
				+ "Computing Fee:\t\t"+NumberFormat.getCurrencyInstance().format(computingFee)+"\n"
				+ "\n";
	}
}
