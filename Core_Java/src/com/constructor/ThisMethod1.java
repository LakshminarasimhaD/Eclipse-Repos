package com.constructor;

class Car{
	private String name;
	private String brand;
	private int cost;
	
	Car(){
		this("BMW","X7");
		cost=8000000;
	}

	public Car(String name, String brand) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.brand=brand;
	}
	
	void display() {
		System.out.println(name+" "+brand+" is "+cost);
	}
}

public class ThisMethod1 {
	public static void main(String[] args) {
		Car car = new Car();
		car.display();
	}

}
