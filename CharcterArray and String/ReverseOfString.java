import java.util.Collections;

public class ReverseOfString {
    //normal Approach
//    public static void main(String[] args) {
//        char arr[] = {'a', 'b', 'c', 'd', 'e', 'f'};
//        String str = new String(arr);
//        String rev = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//        }
//        System.out.println("Reverse of CHarcter Array :-" + rev);
//    }

    public static void main(String[] args) {
        //another Approach --two pointer approach
         char arr[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        int start=0;
        int end=arr.length-1;
        while(start<end)
        //for(;start<end;start++,end--) //also valid
        {
        char temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        }
        System.out.println("Reverse of String"+arr);
    }


}