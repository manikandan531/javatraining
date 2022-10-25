package logical;

import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int m=s.nextInt();
		System.out.println("Enter the 2nd number");
		int n=s.nextInt();
		
		int res;
		
		try //statements responsible for exception
		{
			res=m%n;
			System.out.println("Result :"+res);
		}
		
		catch(ArithmeticException  ae)//statement that has to be displayed when a exception occurs
		{
			System.out.println("dont divide by zero");
			System.out.println("try another number");
		}
	}
}
