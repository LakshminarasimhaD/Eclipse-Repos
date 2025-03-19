package com.exceptionHandling;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Connection Estanlished");
		System.out.println("Enter Numerator value");
		int a = scan.nextInt();
		System.out.println("Enter Denominator value");
		int b=scan.nextInt();
		int c = a/b;
		System.out.println(c);
		System.out.println("Array Past");
		System.out.println("Enter Array size");
		int size =scan.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the position");
		int position = scan.nextInt();
		System.out.println("Enter the element");
		int element = scan.nextInt();
		arr[position]=element;
		System.out.println("Connection Closed");
	}
}
