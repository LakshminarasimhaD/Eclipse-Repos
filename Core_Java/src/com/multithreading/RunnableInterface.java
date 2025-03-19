package com.multithreading;


import java.util.Scanner;

class Banking1 implements Runnable{
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

class Printing1 implements Runnable{
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

class Addition1 implements Runnable{
	public void run() {
		System.out.println("Addition activity started");
		int a = 8;
		int b = 9;
		int c = a+b;
		System.out.println(c);
		System.out.println("Addition activity completed");
	}
}
public class RunnableInterface {
	public static void main(String[] args) {
		Addition1 a1 = new Addition1();
		Banking1 b1 = new Banking1();
		Printing1 p1 = new Printing1();
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(b1);
		Thread t3 = new Thread(p1);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
}
