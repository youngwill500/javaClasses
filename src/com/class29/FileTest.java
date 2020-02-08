package com.class29;

public class FileTest {

	public static void main(String[] args) {
		
		File op1 = new JavaFile();
		op1.open();
		op1.edit();
		op1.closes();
		
		File op2 = new PDFFile();
		op2.open();
		op2.edit();
		op2.closes();
		
		File op3 = new WordFile();
		op3.open();
		op3.edit();
		op3.closes();
	}

}
