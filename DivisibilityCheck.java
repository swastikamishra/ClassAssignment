package basicprogram;
import java.util.Scanner;

public class DivisibilityCheck {
public static void main(String []args)
{
	int a;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your input: ");
	a = sc.nextInt();
	
	if ((a%5==0)&&(a%11==0))
		System.out.println(a+" "+ "Is divisible");
	else 
	{
		System.out.println(a+" "+ "Is not divisible");
	}
	

}

}
