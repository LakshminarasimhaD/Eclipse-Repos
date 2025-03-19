package com.constructor;

class Rocket{
	String name;
	String type;
	
	Rocket(){
		name="GSLV";
		type="Multi-Stage";
	}
	
	Rocket(){
		name="PSLV";
		type="Single-Stage";
	}

	void display() {
		System.out.println(name);
		System.out.println(type);
	}
}

public class RocketMain {
	public static void main(String[] args) {
		Rocket r = new Rocket();
		r.display();
	}

}
