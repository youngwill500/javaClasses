package com.class24;

public class ThisKeyword {

	int a, b;
	
public ThisKeyword(int a, int b) {
	this.a=a;
	this.b=b;	
	}

public ThisKeyword() {
	System.out.println("I am non argument constructor");
}

public void sum(int a, int b) {
	System.out.println("The sum of local parameters is "+a+b);
	System.out.println("The sum of instance variables is "+this.a+this.b);
}
	
public void sayA() {
	System.out.println(a);
}

public void sayB() {
	System.out.println(b);
}

public void sayAandB() {
	this.sayA();
		sayB(); // complier ads this automatically --> this.sayB();
}


public static void main(String[] args) {
	
	ThisKeyword obj3 = new ThisKeyword(5,10);
	obj3.sum(10,20);
	obj3.sayAandB();
	obj3.sayA();
	obj3.sayB();
	
	
	
	
	
	ThisKeyword obj = new ThisKeyword(5,10);
	obj.sum(10, 20);
	
	ThisKeyword obj1 = new ThisKeyword(20,20);
	obj1.sum(100, 200);
	
}

}
