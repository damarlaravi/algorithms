package com.deleteDupl;

public class DeleteDupliateString {
	public static void main(String args[])
	{
		String str1 = "Ravi";
		String str2 = "Kumar";
		deleteDuplicates(str1, str2);
	}
	
	private static void deleteDuplicates(String s1, String s2)
	{
		String temp = "";
		for(int i = 0; i< s2.length()-1; i++)
		{
			for(int j = 0; j < s1.length(); j++)
			{
				if(s1.charAt(j) == s2.charAt(i))
					continue;
				else
					temp += s1.charAt(j);
			}
			s1 = temp;
			temp = "";
		}
		System.out.println(s1);
	}
}
