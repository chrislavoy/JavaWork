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

public class StudentParser 
{	
	
	public static Student parseStringToStudent(String lineToParse)
	{	
		String parts[] = lineToParse.split("/");
		//checks if the student is online or on campus and sets the appropriate variables
		if (parts[0].equals("Online") || parts[0].equals("online"))
		{
			int credits = Integer.parseInt(parts[4]);
			double rate = Double.parseDouble(parts[5]);
			double compFee = Double.parseDouble(parts[6]);
			OnlineStudent newStudent = new OnlineStudent(parts[1], parts[2], parts[3], credits, rate, compFee);
			return newStudent;
		}
		else if (parts[0].equals("OnCampus") || parts[0].equals("onCampus") || parts[0].equals("oncampus"))
		{
			int credits = Integer.parseInt(parts[4]);
			double rate = Double.parseDouble(parts[5]);
			double studentProgramFee = Double.parseDouble(parts[7]);
			boolean residency;
			
			//checks for residency
			if (parts[6].equals("Resident") || parts[6].equals("resident"))
			{
				residency = true;
			}
			else
			{
				residency = false;
			}
			
			OnCampusStudent newOnCampus = new OnCampusStudent(parts[1], parts[2], parts[3], credits, rate, residency, studentProgramFee);
			return newOnCampus;
		}
		return null;
	}
}
