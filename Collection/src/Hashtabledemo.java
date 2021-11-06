import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hashtabledemo {

	public static void main(String[] args) 
	{
		Hashtable<Character,String> a = new Hashtable<Character,String>();
		
		try 
		{
			a.put(null, "mangesh");
		}
		catch(NullPointerException e)
		{
			a.put('a', "mangesh");
		}
	
		a.put('b', "rahul");
		a.put('c', "rushabh");
		a.put('d', "pratiksha");
		a.put('e', "santosh");
		
		for (Map.Entry<Character, String> d : a.entrySet())
		{
			System.out.println(" Key " + d.getKey() + " value " + d.getValue());
		}
		
		

	}

}
