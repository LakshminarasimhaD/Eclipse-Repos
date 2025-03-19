package com.constructor;

class Dog1{
	private String name;
	private String color;
	private int cost;
	
	//Default constructor present but not seen, this is given by Java Compiler
	
	void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
	}
}

public class ZeroParmtrDog {
	public static void main(String[] args) {
		Dog1 d = new Dog1();
//		Dog1 d = new Dog1("Bob","white",10);     This is calling parameter constructor which is not present, so error
		d.display();
	}
}
