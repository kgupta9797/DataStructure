import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;
import java.util.stream.Stream;

public class ArrayRemoveDuplicates {
    public static void main(String args[])
    {
        Set<Integer>uni=new TreeSet<>();
        int arr[]={1,1,2,3,4,5,4,4,5,6,7,8,9,8,67,56,54,4,3};
    for(int i:arr)

    {
        uni.add(i);
    }
System.out.println(uni);


    }
}
