package logical;

import java.util.Scanner;

public class ExceptionDemo1 
{
		public static void main(String[] args)
		{
			ExceptionDemo1 ed=new ExceptionDemo1();
			{
				ed.divide();
				ed.add();
			}
		}

		private void add() 
		{
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int result=n1+n2;
		System.out.println("Addition "+result);
		}
		
		private void divide() 
		{
			Scanner s=new Scanner(System.in);
			int n1=s.nextInt();
			int n2=s.nextInt();
			int result=n1/n2;
			System.out.println("Division "+result);	
		}
}


