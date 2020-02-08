package com.class24;

public class bookTask {
	
	public String name;
	public int pages;
	
	
	bookTask(){
		//System.out.println("The name of my book is "+this.name+" and it has "+this.pages+" pages.");
	}

	
	bookTask(String name,int pages){
		this.name = name;
		this.pages = pages;
		
	}
	
	void displayInfo() {
		System.out.println(" I am currently reading "+name+" it has "+pages+" pages ");
	}
	
	
	public static void main(String[] args) {
		
		bookTask obj = new bookTask();
		obj.name = "Forbes";
		 obj.pages = 30;
		obj.displayInfo();
		
		bookTask obj1 = new bookTask("Playboy",40);
		obj1.displayInfo();
		
		
	}
}
