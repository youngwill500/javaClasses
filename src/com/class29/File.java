package com.class29;

public abstract class File {
	
	
	public void closes() {
		System.out.println("This closes the files");
	}
	
	public void edit() {
		System.out.println("This edits the files");
	}
	
	public abstract void open();
	
	

}
