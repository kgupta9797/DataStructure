import java.lang.*;
import java.util.*;

class Prime
{
			public static void main(String args[])
				{
					int n,i=2;
					Scanner sc = new Scanner(System.in);
					n=sc.nextInt();
					while(i<n)
					{
						if(n%2!=0)
						{
						System.out.println("No is prime"+i);
						}
						else
						{
						System.out.println("No is not prime"+i);
						}
						i=i+1;
					}
				}
}