import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) 
	{
		HashMap<Character,String> a = new HashMap<Character,String>();
		a.put('a', "mangesh");
		a.put('b', null);
		a.put('c', null);
		a.put(null, "pratiksha");
		a.put('e', "santosh");
		
		for (Map.Entry<Character, String> d : a.entrySet())
		{
			System.out.println(" Key " + d.getKey() + " value " + d.getValue());
		}
		
		

	}

}
