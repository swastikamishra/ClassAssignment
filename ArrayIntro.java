package Arrayyconcepts;
import java.util.Scanner;
public class ArrayIntro {
public static void main(String args[])
{
	int arr[]=new int[5];
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter number: ");
	for (int i = 0; i < 5; i++)
	{
		arr [i] = sc.nextInt();
	}
	System.out.println("The list is as follows: ");
	for(int b : arr)
	{
		System.out.println(b);
	}
	//for (int i = 0; i < 5; i++)
	//{
		//System.out.println(arr[i]);
		
	//}
	
}
}
