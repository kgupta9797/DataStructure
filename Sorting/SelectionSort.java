import java.lang.*;
import java.util.*;
class SelectionSort
{
	public static void main(String args[])
	{
	/*	Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the array elemnt");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();*/
		 SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
	}

	void sort(int arr[])
    {
							int n = arr.length;
								for(int i=0;i<n-1;i++)
								{
								int min_inx=i;
									for(int j=i+1;j<n;j++){
										if(arr[j]<arr[min_inx])
										{
										   min_inx=j;
										}
									}
							 //swap with firstIndex and smallest index
								int temp = arr[min_inx];
								arr[min_inx] = arr[i];
								arr[i] = temp;
									}
								}
	
	void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
	
}