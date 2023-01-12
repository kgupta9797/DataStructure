import java.util.* ;
import java.io.*; 

public class Insertion {
//5 4 3 2
	public static void insertionSort(int n , int[] arr) {
	for(int i=1;i<n;i++)
    {
        int key=arr[i];
        int j=i-1;
        
        while(j>=0&&arr[j]>temp)
        {
            //shifting to right
            arr[j+1]=arr[j];
           j--;
        }
        arr[j+1]=temp;
    }
    }
}
