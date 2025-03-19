package com.exceptionHandling;

import java.util.Scanner;

class InvaliedCredientialsException extends Exception {
	public String getMessage() {
		return "Inavlied Credientials";
	}
}

class Atm {
	int acceptAccountNumberAtm;
	int passwordAtm;

	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter account number");
		acceptAccountNumberAtm = scan.nextInt();
		System.out.println("Enter password");
		passwordAtm = scan.nextInt();
	}

	void verify(int accountNumberBank, int passwordBank) throws InvaliedCredientialsException{
		if (acceptAccountNumberAtm == accountNumberBank && passwordAtm == passwordBank) {
			System.out.println("Take the money");
		} else {
			InvaliedCredientialsException ice = new InvaliedCredientialsException();
			System.out.println(ice.getMessage() + " Recorded in ATM DB");
			throw ice;
		}
	}
}

class Bank {
	int accountNumberBank = 99010;
	int passwordBank = 3333;

	void initiate() {
		try {
			 Atm atm = new Atm();
			atm.acceptInput();
			atm.verify(accountNumberBank, passwordBank);
		} catch (InvaliedCredientialsException ice) {
			System.out.println(ice.getMessage() + " Recorded in Bank DB");
		}
	}

}

public class CustomException {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.initiate();
	}

}
