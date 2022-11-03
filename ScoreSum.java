package basicprogram;
import java.util.Scanner;

public class ScoreSum {
public static void main(String []args)
{
	//Declaring Variables
	
	float eng,math,sci,geo,hindi,total,avg,percentage;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your English marks: ");
	eng = sc.nextFloat();
	System.out.println("Enter your Maths marks: ");
	math = sc.nextFloat();
	System.out.println("Enter your Science marks: ");
	sci = sc.nextFloat();
	System.out.println("Enter your Geography marks: ");
	geo = sc.nextFloat();
	System.out.println("Enter your Hindi marks: ");
	hindi = sc.nextFloat();
	
	total = eng + math + sci + geo + hindi;
	System.out.println("Your total marks are: " + total);
	
	if (total>=300)
		System.out.println("Congratulations! You are pass");
	else
		System.out.println("Sorry, you failed!");
	
	avg = total/5;
	System.out.println("Your Average is: " + avg);
	
	percentage = (total/500)*100;
	System.out.println("Your Percentage is: " + percentage);
}
}
