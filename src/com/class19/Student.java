package com.class19;

public class Student {
	
	
	
char getGrade(int score) {
	
	char grade1;
	
	
	if (score > 90) {
		grade1 = 'A';
	}else if(score > 80) {
		grade1 = 'B';
	}else if(score >70) {
		grade1 = 'C';
	}else if(score > 50) {
		grade1 = 'D';
	}else {
		grade1 = 'F';
	}
	
	return grade1;
}

}
