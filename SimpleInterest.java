package basicprogram;
import java.util.Scanner;

public class SimpleInterest {
public static void main (String []args)
{

    //Declaring variable
    float principal,time,rate,si;
    Scanner sc = new Scanner(System.in);
    System.out.println ("Enter principal amount: ");
    principal=sc.nextFloat();
    System.out.println("Enter Time: ");
    time=sc.nextFloat();
    System.out.println("Enter rate of interest: ");
    rate =sc.nextFloat();
    
    si = (principal*time*rate)/100;
    System.out.println("Your simple is: " + si);
    
}
}
