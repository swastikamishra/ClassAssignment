package Arrayyconcepts;

import java.util.Scanner;

public class LinearSearch {
	public static void main (String []args)
	{
		int arr [],size,i,key,pos=-1;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array: ");
		size = sc.nextInt();
		
		//instantiate array
		 arr = new int [size];
		
		//initializing array
		
		System.out.println ("Enter " +size+"  elements in an array!");
		for(i=0;i<size;i++)
		{
			arr [i]=sc.nextInt();
		}
		//input for each element
		System.out.println("Enter the element you wish to search for: ");
		key=sc.nextInt();
		for(i=0;i<size;i++)
		{
			if(arr[i]==key)
			{
				pos=i;
				System.out.println(key+" Found at " +(pos+1)+" posistion");
				break;
			}
		}
		if (pos == -1)
			System.out.println("Data Not Found!");
			
		
		//if (pos!=-1)
			//System.out.println(key+" Found at " +(pos+1)+" posistion");
		//else
			//System.out.println("Data Not Found!");
		

}
}
