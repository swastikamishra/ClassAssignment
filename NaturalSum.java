package basicprogram;
import java.util.Scanner;

public class NaturalSum {
public static void main(String []args)
{
	int i,n,sum=0;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your range: ");
	n = sc.nextInt();
	for (i=1;i<=n;i++)
	{
		sum = sum + i;
	}
	System.out.println("Sum of Natural number"+" "+n+" "+"is"+" "+sum);
	
	
}

}
