package com.class19;

public class   {


	//Create methods to return value of sum
	//sub
	//mult
	//div
	
	
	int sum(int num1, int num2) {
		int result=num1+num2;
		return result;
	}
	

	int sub(int num3, int num4) {
		int results1 = num3 - num4;
		return results1;
	}
	
	int mult(int num5, int num6) {
		int results3 = num5 * num6;
		return results3;
	}
	
	int div(int num7, int num8) {
		int results4 = num7 / num8;
			return results4;
	}
	
	
	
	
	
int findLargest(int num4, int num5) {
		
		int largest;
		
		if (num4>num5) {
			largest = num4;
		}else {
			largest = num5;
		}
		return largest;
	
}
	
	
	

//method will take a week day number and return a week
String weekDayName(int weekDay) {
	String weekDayName;
	switch (weekDay) {
	
	case 1:
		weekDayName="Monday";
		break;
	case 2:
		weekDayName="Tuesday";
		break;
	case 3:
		weekDayName="Wednesday";
		break;
	case 4:
		weekDayName="Thursday";
		break;
	case 5:
		weekDayName="Friday";
		break;
	case 6:
		weekDayName="Saturday";
		break;
	case 7:
		weekDayName="Sunday";
		break;
		default:
			weekDayName="Unknown";
	
	}
	
return weekDayName;	
	
}



String createEmail(String name, String lastName, String emailType) {
	
	String email;
	email = name+lastName+emailType;
	
	return email;
}
	


	
	
	

}
