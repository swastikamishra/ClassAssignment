package Arrayyconcepts;

import java.util.Scanner;

public class ArrayMerging {
	public static void main(String[] args) {
		int first[], sec[], third[], size1, size2, i, k;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array 1");
		size1 = sc.nextInt();
		first = new int[size1];
		System.out.println("Enter" + " " + size1 + " " + "elements in the Array");
		for (i = 0; i < size1; i++) {
			first[i] = sc.nextInt();
		}
		System.out.println("The second array list is as follows:");
		for (int b : first) {
			System.out.print(" " + b);
		}
		System.out.println(" ");
		System.out.println("Enter the size of array 2");
		size2 = sc.nextInt();
		sec = new int[size2];
		System.out.println("Enter" + " " + size2 + " " + "elements in the Array");
		for (i = 0; i < size2; i++) {
			sec[i] = sc.nextInt();
		}
		System.out.println("The second array list is as follows:");
		for (int d : sec) {
			System.out.print(" " + d);
		}

		// initializing the third array

		third = new int[size1 + size2];

		// Assigning value of first array into third

		for (i = 0; i < size1; i++) {
			third[i] = first[i];
		}

		// Assigning value of second array into third

		k = i; // This will consider i=5 where the last loop stopped and will then continue
				// from index 4(5 as per user) if the given size1 is 5

		for (i = 0; i < size2; i++) {
			third[k] = sec[i];
			k++;

		}
		System.out.println(" ");
		System.out.println("The merged array is as follows: ");
		for (i = 0; i < third.length; i++) {
			System.out.print(" " + third[i] + "");
		}

	}

}
