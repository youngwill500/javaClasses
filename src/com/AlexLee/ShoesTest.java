package com.AlexLee;

public class ShoesTest {

	public static void main(String[] args) {
	
		Shoe s = new Shoe("Nike", 11);
		Walking w = new Walking(true, "Nike", 12);
		Running r = new Running(23, "Nike", 13);
		
		System.out.println(s.Brand);
		System.out.println(s.Size);
		System.out.println(w.goretex);
		
		

	}

}
