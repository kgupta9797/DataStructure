/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1

*/

class PatternEleven
{
	public static void main(String args[])
	{
		int n=5;
		
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(row-col+1);
			}
			System.out.println();
		}
		
	}
}