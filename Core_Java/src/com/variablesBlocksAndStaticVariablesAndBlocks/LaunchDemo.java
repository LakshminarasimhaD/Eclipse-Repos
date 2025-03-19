package com.variablesBlocksAndStaticVariablesAndBlocks;

class Demo{
	int a =10;
	int b=20;
	static int x = 11; static int y=22;
	
	{
		System.out.println("Inside non static block");
	}
	
	static {
		System.out.println("Inside Static block");
	}
	Demo(){
		System.out.println("Zero parameter constructor");
	}
	void display() {
		System.out.println(a+"\n"+b+"\n"+x+"\n"+y);
	}
}

public class LaunchDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
	}

}
