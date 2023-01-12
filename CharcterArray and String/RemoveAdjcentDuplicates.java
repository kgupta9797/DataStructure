import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class RemoveAdjcentDuplicates {
    //input-->abbaca
    //op -->ca
    public static void main(String[] args) {
        Stack<Character>stack=new Stack();
//        LinkedList<Integer> ar = new LinkedList<>();
//        ArrayList<Integer> ar2 = new ArrayList<>();


        StringBuilder b = new StringBuilder();
        String str = "abbaca";
        for(int i=0;i<str.length();i++)
        {
            if(!stack.isEmpty()&&stack.peek()==str.charAt(i))
            {
                stack.pop();
            }
            else {
                stack.push(str.charAt(i));
            }
        }
        System.out.println(stack.toString());
        while(!stack.isEmpty())
            b.append(stack.pop());
        System.out.println("======"+b.reverse());
        //b.reverse()
    }
	System.exit();
}