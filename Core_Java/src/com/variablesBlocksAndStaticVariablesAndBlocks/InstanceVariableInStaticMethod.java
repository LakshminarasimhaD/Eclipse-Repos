package com.variablesBlocksAndStaticVariablesAndBlocks;

public class InstanceVariableInStaticMethod {
	int a=10;
	int b=20;
	static int x=30;
	static int y = 40;
	
	static void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		InstanceVariableInStaticMethod ivsm = new InstanceVariableInStaticMethod();
		ivsm.display();
	}

}
