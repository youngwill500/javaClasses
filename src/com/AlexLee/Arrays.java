package com.AlexLee;

public class Arrays {

	public static void main(String[] args) {
	
		
		
		String [] name = {"Winter", "Fall", "Summer", "Spring"};
		
		System.out.println("I was born in " +name[0]);
		
		
		int nameSize = name.length;
		System.out.println(nameSize);
		
		int [] grades = {95,67,45,76,45,23,54,23,45,23,56,34,35,95,23,45,67,34,89,78,56,45,78,56};
		
		int gradesize = grades.length;
		System.out.println(gradesize);
		System.out.println(grades[19]);
		
		System.out.println("***************************");
		
		
		char [] Grades = {'A','B','C','D','E','F'} ;
		
		System.out.println(Grades[1]);
		
		System.out.println("****************************");
		
		
		for (int i = 0; i < Grades.length; i++) {
			System.out.println(Grades[i]+" ");
		}
		System.out.println("***********************************************************");
		char [] Grades1 = new char[6];
		Grades1[0] = 'A';
		Grades1[1] = 'B';
		Grades1[2] = 'C';
		Grades1[3] = 'D';
		Grades1[4] = 'E';
		Grades1[5] = 'F';
		
		System.out.println("Dude, I got an "+Grades1[0]+" On my test.");
		
		System.out.println("******************************");
		
		String [] Names = {"Kenny", "Wilma", "Kenwill", "Kennedy"};
		
		System.out.println(Names[2]);
		
		System.out.println("********************************");
		
		String [] Nombre = new String[4];
		Nombre[0] = "Kenny";
		Nombre[1] = "Kenwill";
		Nombre[2] = "Wilma";
		Nombre[3] = "Kennedy";
		
		System.out.println(Nombre[0]);
		
		System.out.println("**********************************");
		
		
		
		

	}

}
