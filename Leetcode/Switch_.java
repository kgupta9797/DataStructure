import java.lang.*;
import java.util.*;

class Switch_
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int a=10;
	int b=20;
	char op= sc.next().charAt(0);
		switch (op)
		{
		case '+': System.out.println("addition:"+(a+b));break;
		case '-': System.out.println("Sub:"+(a-b));break;
		case '*': System.out.println("Mul:"+(a*b));break;
		case '/': System.out.println("div:"+(a/b));break;
		case '%': System.out.println("Modulo:"+(a%b));break;
		default :System.out.println("default");
		}
	}
}