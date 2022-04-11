package com.greatlearning.project2;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyDemo {

	public static void main(String[] args) {
		System.out.println("\n please Enter size of Currency Denomination :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n > 0) {
			System.out.println("\n please Enter The Currency Denomination Value :");
			//Scanner sc = new Scanner(System.in);
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			Arrays.sort(arr);
			for (int i = 0; i < arr.length; i++) {

			}

			System.out.println("\n please Enter the amount you want to pay :");
			//Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();

			for (int j = (n - 1); j >= 0; j--) {
				int a = x / arr[j];

				if (a > 0) {
					x = x % arr[j];
					System.out.println("\n Your payment approach in order to give min no of notes will be");
					System.out.println(arr[j] + ":" + a);
				}
			}
		} else {
			System.out.println("\n Error: Size of currency denomination should be more than 0");
		}

	}
}
