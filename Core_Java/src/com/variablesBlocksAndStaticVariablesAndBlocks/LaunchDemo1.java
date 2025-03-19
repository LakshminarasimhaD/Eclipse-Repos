package com.variablesBlocksAndStaticVariablesAndBlocks;

class Demo1{
	int a =10, b = 20;
	static int x = 11, y=22;
	
	{
		System.out.println("Inside non Static 1 block");
	}
	static {
		System.out.println("Inside Static 1 vlock");
	}
	Demo1(){
		System.out.println("Inside zero parameter constructor");
	}
	Demo1(int a, int b){
		System.out.println("Inside parameter constructor");
	}
	{
		System.out.println("inside non static 2 block");
	}
	static {
		System.out.println("Inside static 2 block ");
	}
	
	void display1() {
		System.out.println(a);
		System.out.println(b);
	}
	
	static void display2() {
		System.out.println(x);
		System.out.println(y);
	}
}


public class LaunchDemo1 {
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.display1();
		Demo1 d2 = new Demo1(100,200);
		d2.display2();
	}

}
