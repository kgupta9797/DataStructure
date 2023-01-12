import java.util.*;

class EvenOddMethod
{
   public static boolean evenOdd()
	{
		Scanner sc = new Scanner(System.in);
		int no=sc.nextInt();
		
		if(no==0)
		{
			System.out.println("no is zero");
			return true;
		}
		else if(no%2==0)
		{
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String args[])
	{
		if(evenOdd()){
		System.out.println("no is even");
		}
		else
			System.out.println("no is odd");
	}
}