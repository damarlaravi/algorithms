package com.findArrayElement;

public class FindArrayElement {

	public static void main(String[] args) {
		int[][] mat = { {10, 1, 4, 40},
                {15, 5, 44, 45},
                {27, 4, 37, 48},
                {30, 33, 29, 50},
              };
		search(mat, 4, 29);
	}
	
	private static void search(int[][] mat, int n, int x)
	{
		int i = 0, j = 0;  //set indexes for top right element
		while ( i < n && j >= 0 )
		{
			if ( mat[i][j] == x )
		    {
				System.out.println("\n Found at %d, %d "+ i+ ""+ j);
		    }
		    if ( mat[i][j] > x )
		    	j--;
		    else //  if mat[i][j] < x
		    	i++;
		}
		 
		System.out.println("\n Element not found");
		
		for(int k = 0; k < n; k++)
		{
			for(int m = n-1; m >= 0; m--)
			{
				if(mat[k][m] == x)
				{
					System.out.println("\n For Loop Found at %d, %d "+ k+ ""+ m);
					break;
				}
			}
		}
		//System.out.println("\n Element not found");
	}
}
