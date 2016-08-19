package com.prime;

public class GivenNumPrime 
{
	public static void main(String args[]){
		int num = 67;
		
		GivenNumPrime givenNum = new GivenNumPrime();
		if(givenNum.isPrimeNum(num))
		{
			System.out.printf("\n Result: The number %d is Prime", num);
		}
		else
		{
			System.out.printf("\n Result: The number %d is not Prime", num);
		}
	}
	
	private boolean isPrimeNum(int num)
	{
		for(int i = 2; i <= Math.sqrt(num); i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
