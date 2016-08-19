package com.interval.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringInterval {

	/*
	 * In a string detect the smallest window length with highest number of distinct characters. For eg. 
	 * A = “aabcbcdbca”, then ans would be 4 as of “dbca”
	 * http://www.careercup.com/question?id=5630275595796480
	 * 
	 */
	
	public static void main(String args[])
	{
		StringInterval interval = new StringInterval();
		System.out.println(interval.findSmallestInterval("bcccf"));
	}
	
	private String findSmallestInterval(String str)
	{
		Set<Character> charactors = new HashSet<Character>();
		
		for(int i = 0; i < str.length(); i++)
		{
			charactors.add(str.charAt(i));
		}
		
		Interval minInterval = new Interval(0, str.length() - 1);
		HashMap<Character, Integer> lastIndex = new HashMap<Character, Integer>();
		for(int j = 0; j < str.length(); j++)
		{
			char ch = str.charAt(j);
			lastIndex.put(ch, j);
			if(lastIndex.size() == charactors.size())
			{
				int maxDistance = 0;
				for(Map.Entry<Character, Integer> entry : lastIndex.entrySet()){
					maxDistance = Math.max(maxDistance, j - entry.getValue());
				}
				if(maxDistance < minInterval.getLength())
				{
					minInterval = new Interval(j - maxDistance, j+1);
				}
			}
		}
		
		System.out.println(charactors);
		
		return str.substring(minInterval.start, minInterval.end);
	}
	
	private class Interval
	{
		int start, end;
		public Interval(int start, int end)
		{
			this.start = start;
			this.end = end;
		}
		public int getLength()
		{
			return end - start;
		}
	}
}
