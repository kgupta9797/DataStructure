import java.util.*;
class MinMaxArray
{
						public static int minArray(int arr[])
						{
						int min=arr[0];
							for(int i=0;i<arr.length;i++)
							{
								if(min>arr[i])
								{
								min=arr[i];
								}
							}
						return min;	
						}
	public static int maxArray(int arr[])
	{
	int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
			max=arr[i];
			}
		}	
	return max;	
	}
																									public static void main(String args[])
																									{
																										int n;
																										Scanner sc = new Scanner(System.in);
																										System.out.println("Enter the size of array");
																										n=sc.nextInt();
																										int arr[]=new int[n];
																										System.out.println("Enter the array Element");
																										for(int i=0;i<n;i++)
																										{
																											arr[i]=sc.nextInt();
																										}
																										
																										int minElement=minArray(arr);
																									System.out.println("minElement:"+minElement);
																										int maxElement=maxArray(arr);
																									System.out.println("maxElement:"+maxElement);
																										
																									}
}