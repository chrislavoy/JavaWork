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

import java.io.*;         //to use InputStreamReader and BufferedReader
import java.util.*;       //to use ArrayList

public class Assignment5
{
  public static void main (String[] args)
   {
     char input1= 0;
     String inputInfo = new String();
     String line = new String();
     boolean operation;

     // ArrayList object is used to store student objects
     ArrayList studentList = new ArrayList();
//     OnlineStudent student = new OnlineStudent("Bill", "Clinton","000002", 6, 450.00, 10.00);
//     studentList.add(student);

     try
      {
       printMenu();     // print out menu

       // create a BufferedReader object to read input from a keyboard
       InputStreamReader isr = new InputStreamReader (System.in);
       BufferedReader stdin = new BufferedReader (isr);

       do
        {
         System.out.println("What action would you like to perform?");
         line = stdin.readLine().trim();
         input1 = line.charAt(0);
         input1 = Character.toUpperCase(input1);

         if (line.length() == 1)
          {
           switch (input1)
            {
             case 'A':   //Add Student
               System.out.print("Please enter a student information to add:\n");
               inputInfo = stdin.readLine().trim();
  /***********************************************************************************
  ***  ADD your code here to create an object of one of child classes of Student class
  ***  and add it to the studentList
  ***********************************************************************************/
               //done    
               Student newStudent = StudentParser.parseStringToStudent(inputInfo);
               studentList.add(newStudent);
               break;
             case 'C':   //Compute Tuition
  /******************************************************************************************
  ***  ADD your code here to compute/update of the tuition of each student in the studentList.
  ******************************************************************************************/
            	 //done
            	 for (int i = 0; i < studentList.size(); i++)
            	 {
            		((Student) studentList.get(i)).computeTuition();
            	 }
            	 
                System.out.print("tuition computed\n");
               break;
             case 'D':   //Count certain students
               System.out.print("Please enter a number of credits:\n");
               inputInfo = stdin.readLine().trim();
               int credits = Integer.parseInt(inputInfo);

               int count = 0;
  /***********************************************************************************
  ***  ADD your code here to count how many students in the studentList
  ***  have the given number of credits. Set the count in the variable "count"
  ***********************************************************************************/
               //done
               
               for (int i = 0; i < studentList.size(); i++)
          	 	{
            	   if (((Student)studentList.get(i)).getCreditNum() == credits)
            	   {
            		   count += 1;
            	   }
          	 	}

                System.out.println("The number of students who are taking " + credits
                                   + " credits is: " + count);
               break;
             case 'L':   //List Students
  /***********************************************************************************
  ***  ADD your code here to print out all student objects. (Use System.out.print( ) )
  ***  If there is no student, print "no student\n"
  ***********************************************************************************/
            	 //done
            	 if (studentList.isEmpty())
            	 {
            		 System.out.println("no student");
            	 }
            	 for (int i = 0; i < studentList.size(); i++)
            	 {
            		 System.out.print(((Student)studentList.get(i)).toString());
            	 }
            	 
               break;
             case 'Q':   //Quit
               break;
             case '?':   //Display Menu
               printMenu();
               break;
             default:
               System.out.print("Unknown action\n");
               break;
            }
         }
        else
         {
           System.out.print("Unknown action\n");
          }
        } while (input1 != 'Q'); // stop the loop when Q is read
      }
     catch (IOException exception)
      {
        System.out.println("IO Exception");
      }
  }

  /** The method printMenu displays the menu to a user **/
  public static void printMenu()
   {
     System.out.print("Choice\t\tAction\n" +
                      "------\t\t------\n" +
                      "A\t\tAdd Student\n" +
                      "C\t\tCompute Tuition\n" +
                      "D\t\tCount Certain Students\n" +
                      "L\t\tList Students\n" +
                      "Q\t\tQuit\n" +
                      "?\t\tDisplay Help\n\n");
  }
}