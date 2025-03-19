package com.exceptionHandling;

import java.util.Scanner;

class Demo1{
	void fun1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Connection established");
		System.out.println("Enter Numerator value");
		int a = scan.nextInt();
		System.out.println("Enter Denominator value");
		int b=scan.nextInt();
		int c = a/b;
		System.out.println("Connection terminated");
	}
}

class Demo2{
	void fun2() {
		Demo1 d1 = new Demo1();
		d1.fun1();
	}
}

class Demo3{
	void fun3() {
		Demo2 d2 = new Demo2();
		d2.fun2();
	}
}

public class StackTraceInException {
	public static void main(String[] args) {
		Demo3 d3 = new Demo3();
		d3.fun3();
	}

}
