import java.lang.*;

class BitwiseOperator
{
	public static void main(String args[])
	{
		int a=4;
		int b=6;
		
		System.out.println("a&b: "+(a&b)); //and -->both are one
		System.out.println("a|b: "+(a|b)); //or--.at laest one
		System.out.println("~a: "+(~a));// not -->compliment
		System.out.println("a^b: "+(a^b));//xor -->only 1 is need
		System.out.println();
		
		System.out.println(17>>1);//right shift-->half-->8
		System.out.println(17>>2);//rigth shift-->twotimes half-->4
		System.out.println(19<<1);//left shif-->doubling-->38
		System.out.println(21<<2);//left shif-->two timsdoubling-->84
		
		int i=7;
		System.out.println(i++); //print=7 i=8 postincrement
		System.out.println(++i); //print 9 preincrement
		System.out.println(i--); //print 9 i=8 postdecrement
		System.out.println(--i); //print 7 predecrement
		
	}
}