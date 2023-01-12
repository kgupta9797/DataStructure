import java.lang.*;
import java.util.*;

class SumOfAll
	{
		public static void main(String args[])
		{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int i=1;
			while(i<=n){
				if(i%2==0)
				 sum=sum+i;
				 i=i+1;
			}
		System.out.println("sum"+sum);
		
		}
		
		
	}