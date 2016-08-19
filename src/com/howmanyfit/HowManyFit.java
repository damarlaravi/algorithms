package com.howmanyfit;

public class HowManyFit {
	
	/**
	 * Dave's Father wants to make chocolates for his birthday. 
	 * The volume of every chocolate will be 2 cm3. Every chocolate will be cuboid in shape. 
	 * He has a box of a*b*c dimensions (again a cuboid). Given an input a,b,c write a function to 
	 * find out if x number of chocolates of 2cm3 volume can fill the box completely. 
	 * If so, find the number of chocolates too (x).
	 * http://www.careercup.com/question?id=5121982330830848
	 * @param args
	 */
	public static void main(String args[])
	{
		//System.out.println((1, howManyFit(1,1,2)));
		System.out.println(canFit(1, 1,1,2));
		System.out.println(canFit(2, 1,1,2));
        //assertEquals(2, howManyFit(1,2,2));
        //assertEquals(true, canFit(2, 1,2,2));
        //assertEquals(false, canFit(3, 1,2,2));
	}
	static int howManyFit(float length, float width, float height) {
        return (int)(length * width * height) / 2;
    }
    
    static boolean canFit(int count, float length, float width, float height) {
        return count <= howManyFit(length, width, height);
    }
}
