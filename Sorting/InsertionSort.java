class InsertionSort
	{
	 public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };
		System.out.println("before Sorting");
		printArray(arr);
        InsertionSort ob = new InsertionSort();
        ob.insertionSort1(arr);
				System.out.println("Agter Sorting");

		printArray(arr);
    }

						void insertionSort1(int[] arr)
						{
						int n=arr.length;
							for(int i=1;i<n;i++)
							{
							int key=arr[i];
							int j=i-1;
								while(j>=0&&arr[j]>key)
								{
								arr[j+1]=arr[j];//shiftting
								j--;
								}
							arr[j+1]=key;
							}
						}
				
		
					static void printArray(int arr[])
						{
						int n = arr.length;
						for (int i = 0; i < n; ++i)
							System.out.print(arr[i] + " ");
 
							System.out.println();
    }
}