package com.platform;

public class TrainPlatForm {
	public static void main(String args[])
	{
		double arivl[] = {9.00,  9.58,  9.45, 11.00, 14.00, 18.00};
		double deprt[] = {9.25, 11.55, 11.08, 12.00, 18.25, 19.00};
		TrainPlatForm trainPlatForm = new TrainPlatForm();
		int findMinPlatForms = trainPlatForm.calculateMinPlateFormRequired(arivl, deprt, 6);
		System.out.println(" Min of PlatForms Requered "+findMinPlatForms);
	}

	private int calculateMinPlateFormRequired(double[] arivl, double[] deprt, int numOfTrains)
	{
		int i = 0, j = 0;
		int maxOverlaps = 0;
		int numOfOverlaps = 0;
		
		while(i < numOfTrains && j < numOfTrains)
		{
			if(arivl[i] < deprt[j])
			{
				// new train arrived
				numOfOverlaps++;
				if(numOfOverlaps > maxOverlaps)
				{
					maxOverlaps = numOfOverlaps;
				}
				i++;
			}
			else
			{
				// train left
				numOfOverlaps--;
				j++;
			}
		}
		return maxOverlaps;
	}
}
