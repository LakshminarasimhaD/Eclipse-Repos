package com.constructor;

class Dog2{
	private String name;
	private String color;
	private int cost;
	
	
	Dog2(){
		name="Shepherd";
		color="Black";
		cost=20000;
	}
	
	Dog2(String name, String color, int cost){
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

public class ParamtrDog {
	public static void main(String[] args) {
		Dog2 d2 = new Dog2();
		d2.display();
		Dog2 d21 = new Dog2("Belgium Shepherd", "Brown", 25000);
		d21.display();
	}

}
