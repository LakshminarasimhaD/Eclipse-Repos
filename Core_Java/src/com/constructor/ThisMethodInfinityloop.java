package com.constructor;
//Infinity Loop
class Cat{
	String name;
	String color;
	int cost;
	
	Cat(){
		this("Russian Cat");
		cost = 70000;
	}

	public Cat(String name) {
		// TODO Auto-generated constructor stub
		this();
		this.name=name;
	}
	
	void display() {
		System.out.println(name+" "+cost);
	}
}

public class ThisMethodInfinityloop {
	
	public static void main(String[] args) {
		try {
			Cat cat = new Cat();
			cat.display();
		}catch(Exception e) {
			e.getStackTrace();
		}
		
	}

}
