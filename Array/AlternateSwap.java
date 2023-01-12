//alternate swap
//{1,2,3,4,5,6,7}-->{2,1,4,3,6,5,7}

import java.util.*;
class AlternateSwap
{
	public static void main(String ar[])
	{
		int arr[]=new int[]{1,2,3,4,5,6};
		
		for(int i=0;i<arr.length-1;i=i+2) //increment for loop by 2 for alternate
		{
			if(arr[i+1]<arr.length)
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
}