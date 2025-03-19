package com.constructor;

class Dog{
	private String name;
	private String color;
	private int cost;
	
	
	Dog(String name, String color, int cost){
		this.name=name;
		this.color=color;
		this.cost=cost;
	}
	
	void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
	}
}


public class DogConstructor {
	public static void main(String[] args) {
		Dog d = new Dog("Bob","white",10);
		d.display();
	}

}
