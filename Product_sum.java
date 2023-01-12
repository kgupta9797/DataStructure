/*Leetcode Problem 1st
i/p 234
  prod=2*3*4=24
  sum=2+3+4=9
  final answer=prod-sum 24-9=15
*/
import java.util.*;
class Product_sum
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(); //n=234
		int prod=1;
		int sum=0;
		
		int rem=0;
		while(n!=0)
		{
		    rem=n%10;
			prod=prod*rem;
			sum=sum+rem;
			n=n/10;
		}	
		System.out.println("prod"+prod);
		System.out.println("sum"+sum);
		System.out.println(":"+(prod-sum));
	}
	
}

