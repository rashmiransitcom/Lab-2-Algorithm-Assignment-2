package com.greatlearning.project2;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
	int[] arr= new int[n];
	Arrays.sort(arr);
	for(int i=0; i<arr.length+1; i++) {
		System.out.println(arr[i]);
	}

	}

}
