import java.io.*;
import java.util.*;
class power
{
	public static void main(String args[])
	{
		int num;
		int out;
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		int a;
		System.out.println("the power is:");
		Scanner ss=new Scanner(System.in);
		a=ss.nextInt();
		{
			out=(int) Math.pow(num,a);
			System.out.println(out);
		}
	}
}
			
		
	
