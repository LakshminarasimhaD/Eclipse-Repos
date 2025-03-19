package com.exceptionHandling;

import java.util.Scanner;

class Demo5 {
	void fun() throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A value");
		int a = scan.nextInt();
		System.out.println("Enter B value");
		int b = scan.nextInt();
		int c = a / b;
		System.out.println(c);
	}
}

public class ThrowsException {
	public static void main(String[] args) {
		System.out.println("Connection Established");
		try {
			Demo5 d5 = new Demo5();
			d5.fun();
		}
		catch(Exception e) {
			System.err.println("Problem Solved in main");
		}
		System.out.println("Connection Terminated");
	}
}
