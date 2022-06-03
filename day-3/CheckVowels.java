package com.masai;

public class CheckVowels {

	void Check(char x) {
		
		Boolean flag = false;
		
		String xyz = "abcdefghijklmnopqrstuvwxyz";
		
		for(int i=0; i<xyz.length(); i++)
		{	
			if(x == xyz.charAt(i))
			{
				flag = true;
			}	
		}
		
		
		if(flag == false)
		{
			System.out.println("Error message!");
		}
		else
		{
			if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
			{
				System.out.println("It's a vowel");
			}
			else
			{
				System.out.println("It's a consonant");
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		CheckVowels check = new CheckVowels();
		
		char a = 'a';
		
		check.Check(a);
		
	}
	
}
