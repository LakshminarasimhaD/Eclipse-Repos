package com.multithreading;

import java.util.Scanner;

public class RunnableUsingLamda {
	public static void main(String[] args) {
		Runnable r1 = () -> {
			System.out.println("Banking activity started");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter account number");
			int accountNo = scan.nextInt();
			System.out.println("Enter Account password");
			int pwd = scan.nextInt();
			System.out.println("Collect your money");
			System.out.println("Banking activity completed");
		};
		Runnable r2 = () -> {
			System.out.println("Printing activity started");
			try {
				for (int i = 0; i <= 4; i++) {
					System.out.println("Printing");
					Thread.sleep(3000);
				}
			} catch (Exception e) {
				System.out.println("Sleep interrupted " + e);
			}
			System.out.println("Printing activity completed");
		};

		Runnable r3 = () -> {
			System.out.println("Addition activity started");
			int a = 8;
			int b = 9;
			int c = a + b;
			System.out.println(c);
			System.out.println("Addition activity completed");
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);

		t1.start();
		t2.start();
		t3.start();

	}

}
