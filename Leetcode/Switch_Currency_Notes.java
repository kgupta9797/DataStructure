import java.lang.*;
import java.util.*;

class Switch_Currency_Notes
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int amount = sc.nextInt();
	
	
		switch (amount>=500)
		{
			case 1:
			
				int n500=amount/500;
				amount=amount-n500*500;
				System.out.println("note500"+n500);
				
		}
	}
}