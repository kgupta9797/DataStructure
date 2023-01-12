//public class ValidPalimdrome {
//    import java.util.* ;
//import java.io.*;
//    public class Solution {
//
//        public static boolean checkPalindrome(String str) {
//            int start=0;
//
//            char arr[]=str.toCharArray();
//            int end=arr.length-1;
//
//            while(start<end)
//            {
//                if(arr[start]!=arr[end])
//                {
//                    return false;
//                }
//                else
//                {
//                    start++;
//                    end--;
//                }
//            }
//            return true;
//        }
//        boolean valid(char ch) {
//            if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
//                return 1;
//            }
//
//            return 0;
//        }
//
//        char toLowerCase(char ch) {
//            if( (ch >='a' && ch <='z') || (ch >='0' && ch <='9') )
//                return ch;
//            else{
//                char temp = ch - 'A' + 'a';
//                return temp;
//            }
//        }
//        boolean isPalindrome(String s) {
//
//            //faltu character hatado
//            String temp = "";
//
//            for(int j=0; j<s.length(); j++) {
//                if(valid(s[j])) {
//                    temp.pushBack(s[j]);
//                }
//            }
//
//            //lowercase me kardo
//            for(int j=0; j<temp.length(); j++) {
//                temp[j] = toLowerCase(temp[j]);
//            }
//
//            //check palindrome
//            return checkPalindrome(temp);
//
//        }
//}
