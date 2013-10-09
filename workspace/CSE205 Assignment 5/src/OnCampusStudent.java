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

public class OnCampusStudent extends Student
{

	private boolean resident;
	private int creditUpperbound;
	private double studentProgramFee;
	
	//Constructor sets variables from parameters and sends applicable parameters back into the super class.
	public OnCampusStudent (String fName, String lName, String id, int credits, double rate, boolean resident, double studentProgramFee)
	{
		super(fName, lName, id, credits, rate);
		
		this.resident = resident;
		
		this.studentProgramFee = studentProgramFee;
		
		if(resident)
		{
			creditUpperbound = 7;
		}
		else
		{
			creditUpperbound = 12;
		}
		
	}
	
	//Calculates the tution for the On Campus Student
	public void computeTuition()
	{
		if(creditNum >= creditUpperbound)
		{
			tuition = rate * creditUpperbound + studentProgramFee; 
		}
		else
		{
			tuition = rate * creditNum + studentProgramFee;
		}
	}
	
	//Modifies the toString method from the super class to reflect the changes for the on campus student
	public String toString()
	{
		String result;
		
		if(resident)
		{
			result = "\nOnCampus Student:"
					+ "\nResident Status\n"
					+ super.toString()
					+ "Student Program Fee:\t"+NumberFormat.getCurrencyInstance().format(studentProgramFee)+"\n"
					+"\n";
		}
		else
		{
			result = "\nOnCampus Student:"
					+ "\nNonResident Status\n"
					+ super.toString()
					+ "Student Program Fee:\t"+NumberFormat.getCurrencyInstance().format(studentProgramFee)+"\n"
					+"\n";
		}
		
		return result;
	}
}
