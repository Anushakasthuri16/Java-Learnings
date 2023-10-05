package com.Arrays.Level4;

public class SelectionSortAlgo {

	public void selcSort(int arr[]) {
		
		for(int i=0;i<=arr.length-2;i++)
		{
			int min=arr[i];
			int pos=i;
			
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					pos=j;
				}
			}
			int help=arr[pos];
			arr[pos]=arr[i];
			arr[i]=help;
		}

	}

}
