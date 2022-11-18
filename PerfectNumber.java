package basicprogram;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String args [])
	{
		int i,sum=0,n;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number: ");
		n = sc.nextInt();
		
		for (i=1;i<n;i++)
		{
			if (n%i==0)
			{
				sum = sum +i;
			}
		}
		if (n==sum)
			System.out.println(n+" "+ "is a Perfect Number");
		else
			System.out.println(n+" "+ "is not a Perfect Number");
			
	}

}
