/*Leetcode second Prob*/
import java.util.*;
import java.lang.Math.*;
class LeetCode_231
{
	public static void main(String args[])
		{
			int n;
			Scanner sc = new Scanner(System.in);
			n=sc.nextInt();
			for(int i=0;i<=30;i++)
			{
				int ans=(int)Math.pow(2,i);
				if(ans==n)
				{
				System.out.println("Power of 2"+ans);

				}
				else
				{
				System.out.println("not power of 2");

				}
			}
			//System.out.println("Ans:"+ans);
		}
}