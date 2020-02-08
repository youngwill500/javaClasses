package com.class24;

public class studentTask {
	
	public String name;
	public String address;
	
	studentTask(String name, String address){
		
		this.name = name;
		this.address = address;
		
		
	}
	
	
	
	void displayInfo() {
		
		System.out.println(name+" "+address);
		
	}
	
	public static void main(String[] args) {
		
		studentTask obj = new studentTask("Kenwill", "123 Main St, Los Angeles CA");
		obj.displayInfo();
		
	}

}
