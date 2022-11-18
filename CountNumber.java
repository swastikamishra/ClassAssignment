package basicprogram;
import java.util.Scanner;

public class CountNumber {
public static void main(String args[])
{
	int n,count=0;
	
//Taking input value 'n' from user:
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your number: ");
	n = sc.nextInt();

// Loop runs till n is greater than zero
	
	while (n!=0)       //for (;n!=0;)
	{
		count++;
		n = n/10;
		
	}
//Displays total digit
	
	System.out.println("There are total of "+" "+count+" "+"digits");
}
}
