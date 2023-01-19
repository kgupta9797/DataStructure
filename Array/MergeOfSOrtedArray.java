class MergeOfSOrtedArray
{
public static void main(String [] args)
{
	int arr1[]={1,3,6,9};
	int arr2[]={2,4,6,8};
	int arr3[]=new int[8];
	
	int i=0; int j=0;int k=0;
	while(i<arr1.length&&j<arr2.length)
	{
		if(arr1[i]<arr2[j])
		{
			arr3[k]=arr1[i];
			k++;
			i++;
		}
		else
		{
			arr3[k]=arr2[j];
			k++;
			j++;
		}
	}
	while (i < arr1.length) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j <arr2.length) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
	
	for(int a:arr3)
	{
		System.out.println(a);
	}
}
}