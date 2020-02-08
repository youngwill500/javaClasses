package EncapReview;

import java.util.ArrayList;

public class PhoneListDemo {

	public static void main(String[] args) {
	
		ArrayList <Phone> phoneList = new ArrayList <>();
		Phone phone1 = new Phone("123 - 123");
		
		phoneList.add(phone1);
		phoneList.add(new Phone("234 - 345"));
		
		//int size = phoneList.size();
		//System.out.println(size);
		
		SmartPhone iphone1 = new SmartPhone("i234 - 645", "White");
		
		phoneList.add(iphone1);
		phoneList.add(new SmartPhone("255 - 300"));
		
		System.out.println(phoneList.size());
		
		Phone thirdPhone = phoneList.get(2);
		thirdPhone.displayInfo();
		thirdPhone.call("234-567");
		
		//Down Casting
		SmartPhone thirdSmartPhone = (SmartPhone)thirdPhone;
		thirdSmartPhone.showWeather();
		
		
	}

}
