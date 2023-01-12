import java.util.*;
import java.lang.*;
class PrimeForLoop
{
public static void main(String arg[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				isPrime=false;
				break;
			}
			
		}
		if(isPrime==false)
		{
			System.out.println("not a prime no");
		}
		else
		{
			System.out.println(" a prime no");
		}
	}
}
