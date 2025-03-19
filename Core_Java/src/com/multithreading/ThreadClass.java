package com.multithreading;

import java.util.Scanner;

class Banking extends Thread{
	public void run() {
		System.out.println("Banking activity started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter account number");
		int accountNo = scan.nextInt();
		System.out.println("Enter Account password");
		int pwd = scan.nextInt();
		System.out.println("Collect your money");
		System.out.println("Banking activity completed");
	}
}

class Printing extends Thread{
	public void run() {
		System.out.println("Printing activity started");
		try {
			for(int i = 0; i<=4;i++) {
				System.out.println("Printing");
				Thread.sleep(3000);
			}
		}catch(Exception e) {
			System.out.println("Sleep interrupted "+e);
		}
		System.out.println("Printing activity completed");
	}
}

class Addition extends Thread{
	public void run() {
		System.out.println("Addition activity started");
		int a = 8;
		int b = 9;
		int c = a+b;
		System.out.println(c);
		System.out.println("Addition activity completed");
	}
}

public class ThreadClass {
	public static void main(String[] args) {
		Banking b = new Banking();
		Printing p = new Printing();
		Addition a = new Addition();
		b.start();
		p.start();
		a.start();
	}
}
