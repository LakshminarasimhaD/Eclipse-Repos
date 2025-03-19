package com.exceptionHandling;

import java.util.Scanner;

class Exmp1{
	void fun1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Numerator value");
		int a = scan.nextInt();
		System.out.println("Enter Denominator value");
		int b=scan.nextInt();
		int c = a/b;
		System.out.println("Connection terminated");
	}
}

class Exmp2{
	void fun2() {
		Exmp1 d1 = new Exmp1();
		d1.fun1();
	}
}

class Exmp3{
	void fun3() {
		System.out.println("Connection established");
		try {
			Exmp2 d2 = new Exmp2();
			d2.fun2();
		}
		catch(Exception e) {
			System.out.println("Exception handled in fun3 method");
			e.printStackTrace();
		}
		System.out.println("Connection terminated");
	}
}

public class StackTraceInExceptionWIthTryCatch {
	public static void main(String[] args) {
		Exmp3 d3 = new Exmp3();
		d3.fun3();
	}
}
