package Arrayyconcepts;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		int i, j, size, temp, arr[];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		size = sc.nextInt();

		arr = new int[size];
		
		System.out.println("Enter" +size+" elements");

		for (i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) // This is for ascending order for descending order do arr[i]<arr[j]
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			
			}
		}
		for (i=0;i<size;i++)
		{
		System.out.println(arr[i]+" ");
		}

	}

}
