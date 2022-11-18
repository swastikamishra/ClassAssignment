package basicprogram;

import java.util.Scanner;

public class StrongNumber {
public static void main(String args []) {
	
	int i,fact=1,sum=0,n,rem;
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your number: ");
	n = sc.nextInt();
	
	int temp = n;
	
	while(n>0)
	{
		rem = n%10;
		for(i=1;i<=rem;i++) 
		{
			fact = fact*i;
		}
		sum = sum + fact;
		n=n/10;
	}
		if (sum==temp)
		{
	    System.out.println(temp+" "+ "is a Strong Number");
		}
	    else
	    {
	    System.out.println(temp+" "+ "is not a Strong Number");
	}
		
}
}

