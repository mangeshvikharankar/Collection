import java.util.HashSet;
import java.util.Iterator;

public class Hashset 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> a= new HashSet<Integer>();
		 a.add(10);
		 a.add(20);
		 a.add(30);
		 a.add(40);
		 a.add(50);
		 
		 Iterator<Integer> i = a.iterator();
		 
		 for (int d: a)
		 {
			 System.out.println(i.next());
		 }
		 
		

	}

}
