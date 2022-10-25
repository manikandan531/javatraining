package logical;

public class ClassCast 
	{
			public static void main(String[] args)
			{
				Human h=new Human();//valid
				Human boy=new Boy();//child obj to parent type.
				Human girl=new Girl();//child obj to parent type.
				
				
				Girl g=(Girl)boy;
				System.out.println("dobe!...");
				
			}
	}
