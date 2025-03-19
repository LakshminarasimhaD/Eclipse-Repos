package com.variablesBlocksAndStaticVariablesAndBlocks;
// static keyword used when ever multiple objects uses the same copy of variable
import java.util.Scanner;

class Farmer{
	float price;
	float time;
	static float rate=2.5f;
	float interest;
	
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the price");
		price = scan.nextFloat();
		System.out.println("Enter the time");
		time = scan.nextFloat();
	}
	
	void compute() {
		interest = (price*time*rate)/100;
	}
	
	void display() {
		System.out.println("Your interest is "+interest);
	}
}


class SimpleInterest{
	void permit(Farmer ref) {
		ref.acceptInput();
		ref.compute();
		ref.display();
	}
}

public class FarmerMain {
	public static void main(String[] args) {
		SimpleInterest si = new SimpleInterest();
		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer();
		Farmer f3 = new Farmer();
		
		si.permit(f1);
		si.permit(f2);
		si.permit(f3);
	}

}
