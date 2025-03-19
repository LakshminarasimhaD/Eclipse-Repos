package com.exceptionHandling;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Connection Established");
		System.out.println("Enter A value");
		int a = scan.nextInt();
		System.out.println("Enter B value");
		int b=scan.nextInt();
		int c = a/b;
		System.out.println(c);
		System.out.println("Connection Terminated");
	}

}
