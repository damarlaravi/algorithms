package com.findMaxGold;

public class FindMaxGold 
{
	/**
	 * Given a grid of m*n size. Each block in grid has some amount of gold. 
	 * We start from first column of the grid(any row) and we can move in 3 direction - right, right-up and right-down. 
	 * What is the maximum amount of gold we can collect from the grid.
	 * @param args
	 */
	public static void main(String args[])
	{
		// Check Link http://www.careercup.com/question?id=5707163630567424
		//a[i][j]=max{a[i-1][j-1],a[i][j-1],a[i+1][j-1]} +a[i][j] for j=0 to n-1
		//and a[i][j]=0 for i<0 or i>=m
		
		int[][] solGrid ={ {10, 1, 4, 40},
                		   {15, 5, 44, 45},
                		   {27, 4, 37, 48},
                		   {30, 33, 29, 50},
              			};
		
		FindMaxGold findMaxGold = new FindMaxGold();
		int amountOfGold = findMaxGold.searchForGold(solGrid);
		System.out.println(amountOfGold);
	}
	
	private int searchForGold(int[][] map)
	{
		if(map == null)
		{
			throw new NullPointerException("gold Grid not null");
		}
		if(map.length == 0)
			return 0;
		
		int[] working = new int[map.length];
		int[] subTotal = new int[map.length];
		for(int i = 0; i < subTotal.length - 1; i++)
		{
			subTotal[i] = map[i+1][i+1];
			System.out.println(subTotal[i]);
		}
		for(int r = 0; r < map.length - 1; r++)
		{
			for(int c = r + 1; c < map[0].length - 1; c++)
			{
				if(c < map[0].length - 1)
					working[c] = Math.max(subTotal[c], subTotal[c] + map[c][c+1]);
				else
					working[c] = subTotal[c];
				
//				if(c == 0)
//				{
//					working[c] = Math.max(subTotal[c], subTotal[r+1]+map[c][r]);
//				}
//				else if( c == map[0].length - 1)
//				{
//					working[c] = Math.max(subTotal[c], subTotal[r-1]+map[c][r]);
//				}
//				else
//				{
//					working[c] = Math.max(subTotal[c - 1], Math.max(subTotal[c], subTotal[r=1]+map[r][c]));
//				}
			}
		}
		int best = 0;
		//now pick the best score out of the final results
	    for(int i = 0 ; i < working.length - 1; i++)
	    {
	    	best += working[i];
	    }
	    return best;
	}
}
