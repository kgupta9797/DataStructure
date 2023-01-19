import java.util.Arrays;

public class MergeSortedArrays {
    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;
        int[] mergedArr = new int[n1 + n2];
        int k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                mergedArr[k] = arr1[i];
                i++;
            } else {
                mergedArr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            mergedArr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            mergedArr[k] = arr2[j];
            j++;
            k++;
        }
        return mergedArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7,9};
        int[] arr2 = {2, 4, 6, 8};
        System.out.println(Arrays.toString(merge(arr1, arr2))); // Output: [1, 2, 3, 4, 5, 6, 7, 8]
    }
}
