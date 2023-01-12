class PositionOfElementInInfinateArray
{
public static void main(String args[])
{
	int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
	int key=13;
	findPos(arr,key);
}
	static void findPos(int arr[],int key)
	{
	int start1=0;
	int end1=1;
	
			while(key>arr[end1]) //elemnt alwys lyes between start and end so we check end
			{
				start1=end1;
				end1=end1*2;
			}
			int ans=binarySearch(arr,key,start1,end1);
			System.out.println("final answer:"+ans);
	}

		static int binarySearch(int []arr,int key,int start,int end)
		{
			while(start<=end)
			{
			int mid=start+(end-start)/2;
			if(arr[mid]==key){
				return mid;
			}
		// if mid is greter than key  then serch in left ( end =mid -1)
		//if mid is smaller than key then search in right (start=mid+1)
		else if(arr[mid]>key)
		{
			end=mid-1;
		}
	else
		{
			start =mid+1; // arr[mid]<key
		}
		}	
			return -1;

}

	
}

