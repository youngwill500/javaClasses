package com.class25;

public class Developer extends ScrumTeam {

	
	void code() {
		System.out.println(" i create code");
	}
	
	public static void main(String[] args) {
		
		Developer dev = new Developer();	
		dev.salary = 130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts = "Sprint";
		dev.ceremonies = "Sprint";
		dev.attendScrumMeetings();
		dev.attendScrumMeetings();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
