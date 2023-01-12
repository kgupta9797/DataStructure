import java.lang.*;
import java.util.*;
class Method_
{
	public static int power()
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		
		int answer =1;
		for(int i=0;i<=2;i++)
		{
			answer=answer*a;
		}
		return answer;
	}
	public static void main(String args[])
	{
		//Method_ ob = new Method_();
		
		int answer=power();
		System.out.println("answer"+answer);
		
		
		
		
	}
}