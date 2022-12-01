package Arrayyconcepts;

import java.util.Scanner;

public class SpecificInsertMethod {
	static Scanner sc = new Scanner (System.in);
	
	public static int [] setArray(int size)
	{
		int arr[]=new int[10];
		int i,num;
		System.out.println("Enter "+size+" elements to be added in the Array:");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void SpeceficInsertMethod (int arr[],int size)
	
	{
		int i;
		System.out.println("\nEnter the position you wish to insert your value at: ");
		int pos=sc.nextInt();


		if (pos > size || pos < 0 || pos == size) {
			System.out.println("\nPlease enter a valid posistion");
		}

		else
			
			System.out.println("\nEnter the number you wish to insert:");
		int num = sc.nextInt();
	
		for (i = size; i >= pos; i--) {
			arr[i] = arr[i - 1];
		}
	
		arr[pos - 1] = num;
		size++;
		
		getArray(arr,size);
	}


public static void getArray(int arr[],int size)
{
	for(int i=0;i<size;i++)
	{
		System.out.printf("%3d",arr[i]);
	}
}

public static void main (String []args)
{
	int size,arr[];
	System.out.println("Enter the number of Array you want:");
	size = sc.nextInt();
	arr=setArray(size);
	getArray(arr,size);
	SpeceficInsertMethod(arr,size);

	
}
}
	


