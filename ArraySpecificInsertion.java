package Arrayyconcepts;

import java.util.Scanner;

public class ArraySpecificInsertion {
	public static void main(String[] args) {
		
		int size, i, num, pos;

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];
		System.out.println("Please enter the size of the array:");
		size = sc.nextInt();
		System.out.println("Please enter the numbers to be added in array");
		
		for (i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the position you wish to insert at:");
		pos = sc.nextInt();

		if (pos > size || pos < 0 || pos == size) {
			System.out.println("Please enter a valid posistion");
		}

		else
			System.out.println("Enter the number you wish to insert:");
		num = sc.nextInt();
		
		// Shifting elements
		for (i = size; i >= pos; i--) {
			arr[i] = arr[i - 1];
		}
		
		// Inserting element in the position
		arr[pos - 1] = num;
		size++;
		
		System.out.println("After adding element:");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}

	}

}
