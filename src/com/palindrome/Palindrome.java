package com.palindrome;

public class Palindrome {
	
	public static void main(String args[])
	{
		Palindrome palin = new Palindrome();
		String str = "madamb";
		if(str.equals(palin.palindrome(str)))
			System.out.println("Palindrome:::  "+str);
		else
			System.out.println("Not Palindrome :: "+str);
		
		System.out.println("Palindrome Number ::  "+palin.palindromeNumber(142));
	}
	
	private String palindrome(String str)
	{
		String temp = "";
		for(int i = str.length()-1; i>= 0; i--)
		{
			temp += str.charAt(i);
		}
		return temp;
	}
	
	private int palindromeNumber(int num)
	{
		int n1 = num;
		String n2 = palindrome(Integer.toString(num));
		int n3 = n1 + Integer.parseInt(n2);
		String n4 = palindrome(Integer.toString(n3));
		if(n3 == Integer.parseInt(n4))
		{
			return n3;
		}
		else
		{
			palindromeNumber(n3);
		}
		return 0;
	}
}

