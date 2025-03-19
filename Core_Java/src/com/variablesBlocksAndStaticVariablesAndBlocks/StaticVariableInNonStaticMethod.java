package com.variablesBlocksAndStaticVariablesAndBlocks;

public class StaticVariableInNonStaticMethod {
	int a=10;
	int b=20;
	static int x=30;
	static int y = 40;
	
	 void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
	 public static void main(String[] args) {
		 StaticVariableInNonStaticMethod svns = new StaticVariableInNonStaticMethod();
		 svns.display();
	}
}
