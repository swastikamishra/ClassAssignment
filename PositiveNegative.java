package basicprogram;
import java.util.Scanner;

public class PositiveNegative {
public static void main (String []args)
{
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number: ");
	num = sc.nextInt();
	if (num>0)
	{
		System.out.println("Number is positive");
	}
	else if (num<0) 
	{
	System.out.println("Number is Negative");	
	}
	else
	{
	System.out.println("Number is Zero!");
	}
	
	
}
	
}


