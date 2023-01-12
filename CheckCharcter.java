import java.lang.*;
import java.util.*;

class CheckCharcter
	{
	public static void main(String args[])
		{
		Scanner sc = new Scanner(System.in);
		System.out.prinln("Enter the Carcter....")
		char ch=sc.next().charAt(0);
		
		//if(ch)
			
		System.out.println("ch->"+ch);
		
			if(ch>='A'&&ch<='Z')
			{
			System.out.println("ch is Uppercase"+ch);	
			}
			 else if(ch>='a'&&ch<='z')
			{
				System.out.println("ch is lowecase"+ch);
			}
			else{
				System.out.println("ch is alphaNumeric");
			}
			
			
		}
	}
