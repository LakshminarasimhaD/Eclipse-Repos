package com.constructor;

class Dog3{
	String name;
	String color;
	int cost;
	
	public Dog3() {
		this("Rockey");
		this.cost=50000;
	}

	public Dog3(String name) {
		// TODO Auto-generated constructor stub
		this("Vicky","Black",15000);
		this.name=name;
	}

	public Dog3(String name, String color, int cost) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.color=color;
		this.cost=cost;
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println(name+" "+color+" "+cost);
	}
}

public class ThisMethod2 {
	public static void main(String[] args) {
		Dog3 d = new Dog3();
		d.display();
	}

}
