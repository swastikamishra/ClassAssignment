package StringConcepts;
import java.util.Scanner;

public class EmailValidity {
	public static void main (String []args)
	{
		String email;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter your email id: ");
		email= sc.nextLine();
		
		if ((email.endsWith(".com"))||(email.endsWith(".org"))||(email.endsWith(".in")))
		{
			System.out.println("Your email Id is validated.");
		}
		
		else
			System.out.println("Please enter correct email id!");

	}
	
	

}
