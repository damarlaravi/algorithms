package com.prime;

public class MagicNumber 
{
	
	public static void main(String args[])
	{
		int magicNumber = 5;
		int findValue = 125;
		
		for(int i = 0; i < findValue; i++)
		{
			// Like 30(5 * 5 + 5), 125, 130(5 * 5 * 5 + 5)+.........
			// Involve logic is 0 * pow(x, y)+
			double targetValue = Math.pow(magicNumber, i);
			double addMagicNum = targetValue + magicNumber; 
			if(targetValue == findValue)
			{
				System.out.println("value is 5^ %d :: "+ i);
			}
			else if(addMagicNum == findValue){
				System.out.println("value is 5^ %d :: "+ i + " added Magic Number 5 ^ 1");
			}
		}
	}
}
