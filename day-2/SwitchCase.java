package com.masai;

public class SwitchCase {
	
	static void Switch(String expression) {
		
		switch(expression) {
			
		case "Mumbai": System.out.println("Financial city");
		break;
		
		case "Kolkata": System.out.println("City of Joy");
		break;
		
		case "Delhi": System.out.println("Captial of the country");
		break;
		
		case "Banglore": System.out.println("Cyber City");
		break;
		
		default: System.out.println("May be Other Indian City");
		
		}
		
	}

	public static void main(String[] args) {
		
		SwitchCase.Switch("Delhi");
		
	}
	
}
