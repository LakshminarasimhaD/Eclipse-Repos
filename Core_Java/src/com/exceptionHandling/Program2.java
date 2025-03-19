package com.exceptionHandling;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		int a = 2;
		int b = 8;
		System.out.println(add(a, b));

	}

	public static int add(int a, int b) {
		System.out.println(a + b);
		return (a + b);
	}

	public static int sub(int a, int b) {
		System.out.println(a - b);

		return (a - b);
	}

	public static int mul(int a, int b) {
		System.out.println(a * b);

		return (a * b);
	}

	public static int div(int a, int b) {
		System.out.println(a / b);

		return (a / b);
	}
	
	
}
