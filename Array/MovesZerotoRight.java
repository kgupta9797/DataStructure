class MovesZerotoRight
{
public static void main(String args[])
	{
	int arr[]={1,2,0,3,4,5,0,6,7,0};
	//00000System.out.println("after moving zero"+moveZeroes(arr));
		moveZeroes(arr);
	}
	
											static void moveZeroes(int arr[])
											{
											int nonzero=0;
											for(int j=0;j<arr.length;j++)
											{
												if(arr[j]!=0)
												{
													int temp=arr[j];
													arr[j]=arr[nonzero];
													arr[nonzero]=temp;
													nonzero++;
												}
											}
											for(int k:arr)
												{
												System.out.print(" "+k);
												}
											}

}
