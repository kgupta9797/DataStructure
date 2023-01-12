// 1 2 3 5 8 13 21 34 55 89

import java.lang.*;
class Fibon
{
public static void main(String arg[])
{
	int n=10;
	int a=0;
	int b=1;
	System.out.print(" "+a);
	System.out.print(" "+b);
	for(int i=0;i<10;i++)
	{
		int next=a+b;
		System.out.print(" "+next);
		a=b;
		b=next;
	}
}
}
 //a b  sum
//0 1   1   