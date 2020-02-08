package com.class27;

public class Child extends Parent {
	
	String name = "James";
	
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.callName();
	}
	
	public void callName() {
		System.out.println(name);
		System.out.println(super.name);
		System.out.println(lastName);
	}
	
	
	public void callingMethod() {
		callName(); //By Defualt This is Added- so we are calling current class Method
		super.callName();
		System.out.println(name);
	}
	

}
