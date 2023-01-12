//sum of array
//lenearserch of array
//minmax of array
// reverse of array

import java.util.*;
class SumOfArray
{
	
				public static void printArray(int arr[])
				{
					for(int array: arr)
					System.out.print(array);
				}
				public static void sumArray(int arr[])
				{
					int sum=0;
					for(int i=0;i<arr.length;i++)
					{
						sum=sum+arr[i];
					}
					System.out.println("\nPrintArraySum:-"+sum);	
				}
	
	public static void main(String arg[])
	{
		int a[]=new int[]{1,2,3,4,5,6,7,8,9};
	
		System.out.println("\nThe array element are:-");
		printArray(a);
		sumArray(a);
		
		
	}
}