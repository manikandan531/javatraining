package logical;

public class Interrupt 

	{
		public static void main(String[] args) throws InterruptedException
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1500);
			}
		}
}