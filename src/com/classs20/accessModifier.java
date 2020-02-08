package com.classs20;

public class accessModifier {
	
	// Access control modifiers.
	// Access modifiers can put restrictions on how part of our codes can be accessed.
	// As the name suggests access modifiers in Java helps to restrict the scope (access level) of a class, method and some other concepts which we will learn
	// soon.
	//  There are four types of access modifiers available in java:
	//   1.    Public     (Visible to the world). Public visibility means that this method can be accessed anywhere in the program as long as you have an instance of this class to call it from.
	//   2.    Private     (Visible to the class only). Private visibility means that this method can’t be accessed out of this class.
	
	
	
	
	
	
	
	
	//public can be seen/accessed
	//from everywhere
	
	public void add1() {
		
	}
	//default can be seen/accessed within package
	void add2(int num1, int num2) {
		
	}
	
	//protected can be seen/accessed
	//within package
	protected int add4() {
		return 0;
		
	}
	
	//private can be seen/accessed only within this class
	
	private int add4(int num3, int num4) {
		return num4;
		
	}
	
}
