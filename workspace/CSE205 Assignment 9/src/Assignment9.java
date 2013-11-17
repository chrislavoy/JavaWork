// Assignment #: 9
//         Name: Chris LaVoy
//    StudentID: 1201806935
//      Lecture: 71081
//  Description: Recursively checks an array for certain numbers and sums

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment9 
{
	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		int[] input = new int[100];
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		int i = 0;
		
		//while the last number is not 0, put new number into an array
		do
		{
			input[i] = Integer.parseInt(bfr.readLine());
			i++;
		}
		while(input[i-1]!=0);
		
		//Call the recursive methods and show thier output
		System.out.println("The minimum number is " + findMin(input, 0, i - 1));
		System.out.println("The sum of the numbers divisible by 3 is " + computeSumDivisibleBy3(input, 0, i - 1));
		System.out.println("The sum of the numbers at odd indexes is " + computeSumAtOdd(input, 0, i - 1));
		System.out.println("The total count of positive numbers is " + countPositive(input, 0, i - 1));
	}
	
	public static int findMin(int[] numbers, int startIndex, int endIndex)
	{
		//once end of recusive calls is made, return the number at the index
		if (endIndex == startIndex)
		{
			return numbers[endIndex];
		}
		else
		{
			//call method recursively
			int previousMin = findMin(numbers, startIndex, endIndex - 1);
			
			//if the last number is greater than the current number, then return the current number as the smallest
			if (previousMin > numbers[endIndex])
			{
				return numbers[endIndex];
			}
			//else if the last number was smaller, return that instead
			else
			{
				return previousMin;
			}
		}
	}
	
	public static int computeSumDivisibleBy3(int[] numbers, int startIndex, int endIndex)
	{
		//once the last index is reached, see if it can be divided by 3, if not do not add it to the sum
		if (endIndex == startIndex)
		{
			if (numbers[endIndex] % 3 == 0)
			{
				int sum = numbers[endIndex];
				return sum;
			}
			else
			{
				int sum = 0;
				return sum;
			}
		}
		else
		{
			//call the method recursively
			int sum = computeSumDivisibleBy3(numbers, startIndex, endIndex - 1);
			
			//if the number at the current index is divisible by 3, add it to the sum
			if (numbers[endIndex] % 3 == 0)
			{
				return sum += numbers[endIndex];
			}
			else
			{
				return sum;
			}
		}
	}
	
	public static int computeSumAtOdd(int[]numbers, int startIndex, int endIndex)
	{
		//once the last index is reached, return 0 because the first index is not off
		if (endIndex == startIndex)
		{
			return 0;
		}
		else
		{
			//call the method recursively
			int sum = computeSumAtOdd(numbers, startIndex, endIndex - 1);
			
			//if the index is odd, add its number to the sum, otherwise skip it
			if (endIndex % 2 == 0)
			{
				return sum;
			}
			else
			{
				return sum += numbers[endIndex];
			}
		}
	}
	
	public static int countPositive(int[] numbers, int startIndex, int endIndex)
	{
		//once the last index is reached, see if the number is positive, if it is add 1 to the count total
		if (endIndex == startIndex)
		{
			if (numbers[endIndex] > 0)
			{
				int count = 1;
				return count;
			}
			else
			{
				int count = 0;
				return count;
			}
		}
		else
		{
			//call the method recursively
			int count = countPositive(numbers, startIndex, endIndex - 1);
			
			//if the number is positive, add 1 to the count total
			if (numbers[endIndex] > 0)
			{
				return count + 1;
			}
			else
			{
				return count;
			}
		}
	}
}