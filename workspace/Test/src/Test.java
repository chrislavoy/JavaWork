import java.util.Scanner;

public class Test 
{
	public static void main(String[] args)
	{
		String name;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name?");
		name = scan.nextLine();
		
		System.out.println("Hello, " + name);
	}
}
