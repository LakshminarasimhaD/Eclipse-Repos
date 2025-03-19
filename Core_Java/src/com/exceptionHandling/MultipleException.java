package com.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleException {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Connection Established");
		try {
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
		}
		catch(ArithmeticException e) {
			System.err.println("Denominator Cant be zero");
		}
		catch(NegativeArraySizeException e) {
			System.err.println("Do not enter -ve size array");
		}
		catch(InputMismatchException e) {
			System.err.println("Array size has exceded");
		}
		catch(Exception e) {
			System.err.println("Some error occured");
		}
		System.out.println("Connection terminated");
	}

}
