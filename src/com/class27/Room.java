package com.class27;

public class Room extends Building { //We may get an error because we need to add constructor that initializes the variables
	
int roomNumber;

Room( String address, int floor, int roomNumber){
	super(address, floor); // We are calling the variables from the parent class(Building)
	this.roomNumber = roomNumber;
}

public void print() {
	System.out.println(address+" "+floor+" "+roomNumber);
}


public static void main(String[] args) {
	
	Room room = new Room("121 Test Driver", 10, 101);
	//System.out.println(room.floor);
	room.print();
	
}




}
