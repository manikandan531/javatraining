package logical;
import java.util.*;

public class HashMap1 
{
	public static void main(String[] args)
	{
		HashMap hm1=new HashMap();
		
		
		//it allows to have duplicate value
		hm1.put(101,"rohith");
		hm1.put(102,"rohith");
		
		//it doesnt allow duplicate key
		
		hm1.put(103,"maddy");
		hm1.put(103,"pinky");
		
		//key can be made null or else value
		hm1.put(null, "hari");
		hm1.put(104,null);
		
		System.out.println(hm1);
	}
}
