package com.array.multiply;

public class ArrayMultiply {

	/**
	 * WAP to get following. 
	 * input : {2, 4, 3, 5, 6} 
	 * output: {360, 180, 240, 144, 120 } 
	 * Hint: {4*3*5*6, 2*3*5*6, 2*4*5*6, 2*4*3*5} 
	 * Please note, division is not allowed and time complexity should be O(N).
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2, 4, 3, 5, 6};
		int multi = 1;
		for(int i = 0; i < array.length; i++)
		{
			multi *= array[i];
		}	
		System.out.println("multi: "+multi);
		
		for(int j = 0; j < array.length; j++)
		{
			array[j] = multi / array[j];
		}
		
		for(int k : array)
		{
			System.out.println("K : "+k);
		}
	}

}
