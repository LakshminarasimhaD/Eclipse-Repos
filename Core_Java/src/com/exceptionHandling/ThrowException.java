package com.exceptionHandling;

import java.util.Scanner;

class Demo4{
	void fun() {
		System.out.println("Connection Extablished");
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter numerator");
			int a = scan.nextInt();
			System.out.println("Enter denominator");
			int b = scan.nextInt();
			int c = a/b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("Problem resolved in fun method");
			throw e;
		}
		finally {
			System.out.println("Connection Closed");
		}
		
		
	}
}

public class ThrowException {
	public static void main(String[] args) {
		try {
			Demo4 d4 = new Demo4();
			d4.fun();
		}catch(Exception e) {
			System.out.println("Problem resolved in main");
		}
		
	}

}
