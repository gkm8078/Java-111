package com.masai;

public class PrimeFact {

	static void FindPrime(int x) {
		
		if(x > 100 || x < 2)
		{
			System.out.println("Invalid Number");
		}
		else
		{
			for(int i=1; i<=x; i++)
			{
				if(x%i == 0)
				{
					System.out.println(i);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		PrimeFact.FindPrime(14);
		
	}
	
}
