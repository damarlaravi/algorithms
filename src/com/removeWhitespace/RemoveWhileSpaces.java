package com.removeWhitespace;

public class RemoveWhileSpaces {
	public static void main(String args[])
	{
		String str = "g  eeks     for ge  eeks  ";
		String afterStr = removeWhiteSpace(str);
		System.out.println(afterStr);
	}
	
	private static String removeWhiteSpace(String str)
	{
		String resultString = "";
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) != ' ')
			{
				resultString += str.charAt(i);
			}
		}
		return resultString;
	}
}
