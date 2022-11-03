package basicprogram;
import java.util.Scanner;

public class LargestOfThree {
public static void main (String []args) {
	int a,b,c;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your input: ");
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	if (a>b)
	{
		if(a>c) {
			System.out.println(a+" "+ "Is the greater number");
		}
		else
		{
			System.out.println(c+" "+ "Is the greater number");
		}	
	}
	else
	{
		if(b>c)
		{
			System.out.println(b+" "+ "Is the greater number");
	    }
		else
		{
			System.out.println(c+" "+ "Is the greater number");
		}
}
}
}
