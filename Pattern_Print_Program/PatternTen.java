/*
1
2 3
3 4 5
4 5 6 7
5 6 7 8 9

*/

import java.lang.*;

class PatternTen
{
	public static void main(String args[])
	{
		int n=5;
		for(int row=1;row<=n;row++)
		{
					int value=row;

			for(int col=1;col<=row;col++)
			{
				
				System.out.print(" "+value++);
			}
			System.out.println();
		}
		
	}
}