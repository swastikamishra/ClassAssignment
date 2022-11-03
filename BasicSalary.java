package basicprogram;
import java.util.Scanner;

public class BasicSalary {
public static void main (String []args)
{
	float bs,hra,da,gs;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your Basic Salary: ");
	bs = sc.nextFloat();
		if (bs<=10000)
		{
		da = bs*80/100;
		hra = bs*20/100;
	
		}
		
		else if(bs<=20000) 
		{
		da = bs*90/100;
		hra = bs*25/100;

		}
		else
		{
		da = bs*95/100;
		hra = bs*30/100;
			
		}
		gs = hra+da+bs;
		System.out.println("Your Gross Salary is" + " "+gs+"/-");
		
		}
	}



		
			
		
	




	



