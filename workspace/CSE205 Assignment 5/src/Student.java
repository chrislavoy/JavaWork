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

public abstract class Student 
{

	protected String firstName;
	protected String lastName;
	protected String studentID;
	protected int creditNum;
	protected double rate;
	protected double tuition = 0.0;
	
	//Constructor method
	public Student(String fName, String lName, String id, int credits, double rate)
	{
		firstName = fName;
		lastName = lName;
		studentID = id;
		creditNum = credits;
		this.rate = rate;
	}
	
	//returns the number of credits
	public int getCreditNum()
	{
		return creditNum;
	}
	
	//Creates a structured output for the information stored in the student
	public String toString()
	{
		return "First name:\t\t" +firstName+ "\n"
			 + "Last name:\t\t" +lastName+ "\n"
			 + "Student ID:\t\t" +studentID+ "\n"
			 + "Credits:\t\t" +creditNum+ "\n"
			 + "Rate:\t\t\t" +NumberFormat.getCurrencyInstance().format(rate)+ "\n"
			 + "Tuition:\t\t" +NumberFormat.getCurrencyInstance().format(tuition)+ "\n";
	}
	
	//creates an abstract method to be used in the child classes
	public abstract void computeTuition();
	
}
