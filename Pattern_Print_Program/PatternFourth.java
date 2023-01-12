/*
1 2 3
4 5 6
7 8 9
*/

import java.lang.*;
class PatternFourth
{
	public static void main(String args[])
	{
		
		int n=3;
		int count=1;
		for(int row=1;row<=n;row++)
		{
			for(int col=1; col<=n;col++)
			{
				System.out.print(" "+count++);
			}
			System.out.println();
		}
	}
}