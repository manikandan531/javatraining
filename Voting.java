package logical;

import java.util.Scanner;

public class Voting 
{
	
public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age to verify");
		int age=s.nextInt();
			
	try 
	{
		if(age<18)
				
		throw new Agebar("you are not eligible to vote");
		else
		System.out.println("congrats...!you can vote");
	}
	
	catch(Agebar b)
	{
		System.out.println("you have to be 18 to be eligible");
	}
			
	}                
}

