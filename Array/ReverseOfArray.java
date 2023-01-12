import  java.util.*;

class ReverseOfArray
{
	/*
	public static void swap(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("swap");
		System.out.print("a :"+a);
		System.out.print(" b :"+b);
	}*/
	public static void reverseArray(int arr[])
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
	
	public static void main(String args[])
	{
	int arr[]=new int[]{1,2,3,4,5};
					System.out.println(" ReverseArray");
					reverseArray(arr);
				
	}
}