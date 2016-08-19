package com.string.bigpalindrome;

public class BigPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigPalindrome bigPalindrome = new BigPalindrome();
		String resultPalin = bigPalindrome.getBigPalindrome("forgeeksskeegfor");
		System.out.println(resultPalin);
	}

	private String getBigPalindrome(String str) {
		int i = 0, j = 0, tempi = 0;
		int maxLen = 0, currentLen = 0;
		String maxpalin = null;
		String currentpalin = null;
		char[] carr = str.toCharArray();
		for (i = 0; i < carr.length; i++)
		{
			tempi = i;
			for (j = carr.length - 1; j > i; j--)
			{
				/*
				 * if checks -- whenever we encounter the same char, check the
				 * common mid char j - i == 1(for palindrome
				 * like "civic")
				 * or 2 common mid chars j - i == 2(for palindrome like
				 * "geeksskeeg")
				 * else increase the value of i
				 * 
				 */

				if (carr[i] == carr[j])
				{
					if (j - i == 1 || j - i == 2)
					{
						currentpalin = str.substring(tempi, i+ (i - (tempi - 1)) + j - i);
						currentLen = currentpalin.length();

						/*
						 * 
						 * check if the previous palindrome have longer length
						 * 
						 */

						if (maxLen < currentLen)
						{
							maxpalin = currentpalin;
							maxLen = currentLen;
						}
					}
					i++;
				}
				/*
				 * 
				 * else the next char is not the same, the restore the value of
				 * i
				 * 
				 */
				else
				{
					i = tempi;
				}
			}
		}
		return maxpalin;
	}
}
