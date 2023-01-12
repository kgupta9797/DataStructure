//    j1 j2 j3
// i1-1 2 3
// i2-1 2 3
// i3-1 2 3

import java.lang.*;
import java.util.*;

class PatternThird
{
public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}