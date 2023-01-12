/*
9 8 7
6 5 4 
3 2 1
*/

import java.lang.*;

class PatternFifth
{
	public static void main(String args[])
	{
		int n=3;
		int count=9;
		
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				System.out.print(count--);
			}
			System.out.println();
		}
	}
}

