package logical;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args)
		{
			int a=10,b=5;
			int c=0;
			
			try
			{
				int arr []=null;
				//System.out.println(arr[1]);
				c=a/b;//throw
				System.out.println("try block");
				
				
			}
			
			catch(ArithmeticException | NullPointerException e)
			{
				System.out.println("Exception has occured");
			}
			catch(Exception e)
			{
				System.out.println("Error occured");
			}
			finally 
			{
				System.out.println("this gets printed no matter what");
			}
			
			
			// checked exception 
			File file=new File("abc.txt");
			  try 
			  { 
				  FileInputStream fr=new FileInputStream(file); 
			} catch (FileNotFoundException e) 
			  {
			 // e.printStackTrace(); 
			  }
			 	
			System.out.println(c);
			System.out.println("end of program");
			
			
			/*
			 * int i=0; try(Scanner s=new Scanner(System.in))//try with resource {
			 * i=s.nextInt(); }
			 * 
			 * 
			 * System.out.println(i);
			 */
			 
			double bal=500,withdraw=700;
			try 
			{
			if(bal<withdraw)
			throw new InsufficientFundException(withdraw-bal);
			}
			catch(InsufficientFundException e)
			{
				System.out.println("Not empty money");
			}
		}
}

