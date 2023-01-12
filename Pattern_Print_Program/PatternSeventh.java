/*
1
2 2
3 3 3
4 4 4 4


*/
class PatternSeventh
{
	public static void main(String args[])
	{
		int n=4;
		
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(" "+row);
			}
			System.out.println();
		}
	}
}