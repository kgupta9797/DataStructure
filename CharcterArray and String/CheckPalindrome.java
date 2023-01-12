import java.util.Scanner;

public class CheckPalindrome {
    public static void main (String[] args)
    {
    System.out.println("Enter String");
    Scanner sc = new Scanner(System.in);
    String str=sc.next();
    System.out.println("Given Stirng is Palimdrome:- "+isPalimdrome(str));
    }

    private static boolean isPalimdrome(String str) {
        char[] arr =str.toCharArray();
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            if(arr[start]!=arr[end])
            {
                return false;
            }
            else {
                start++;
                end--;
            }
        }
        return true;
    }
}
