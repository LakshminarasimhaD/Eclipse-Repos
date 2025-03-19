package com.exceptionHandling;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public  String getMessage() {
		return "You are lesser than 18";
	}
}

class OverAgeException extends Exception{
	public String getMessage() {
		return "You are older tha 65";
	}
}


class Applicant{
	int age;
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		age= scan.nextInt();
	}
	void verify() throws UnderAgeException, OverAgeException{
		if(age<18) {
			UnderAgeException uai = new UnderAgeException();
			System.out.println(uai.getMessage()+" DL application rejected");
			throw uai;
		}
		else if(age>65) {
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getMessage()+" DL application is not acceptable");
			throw oae;
		}
		else {
			System.out.println("Proceed to apply for DL");
		}
	}
}

class RTO{
	void initiate() {
		try {
			Applicant a = new Applicant();
			a.acceptInput();
			a.verify();
		}catch(UnderAgeException uae) {
			System.out.println(uae.getMessage()+" recorded in RTO DB");
		}catch(OverAgeException oae) {
			System.out.println(oae.getMessage()+" recorded in RTO DB");
		}catch(Exception e) {
			System.out.println(e +" some exception ");
		}
	}
}


public class RTOCustomException {
	public static void main(String[] args) {
		RTO rto = new RTO();
		rto.initiate();
	}

}
