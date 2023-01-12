/*Bubble Sort*/

import java.lang.*;
import java.util.*;

class BubbleSort
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	
	int arr[] = new int[n];
	int temp=0;
	
	System.out.println("Enter the array Element");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("the Array is");
	for(int i=0;i<n;i++)
	{
		System.out.print(" "+arr[i]);
	}
	//
	//for  round 0 to n-1
	for(int i=0;i<n-1;i++)
	{
			boolean swap=false; 
		//process the elemnt till n-i index -->last index in sorted  thats why  --> 4 3 2 1|6
		for(int j=0;j<n-i-1;j++)
		{
		
			if(arr[j+1]<arr[j])
			{
				temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
				swap=true;
				
			}
		}
		if(swap==false)
		{
			//alerdy sorted
			break;
		}
	}
	
	System.out.println("\nAfter sorting");
	for(int i=0;i<n;i++)
	{
	System.out.print(" "+arr[i]);
		
	}
	
}

}