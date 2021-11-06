import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist 
{

	public static void main(String[] args) 
	{
		
		//first way
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Mangesh");
		list1.add("Rahul");
		list1.add("Rushabh");
	
		//Second way
		
		ArrayList<String> list2 = new ArrayList<String> (Arrays.asList("Pratiksha","Santosh"));
		
		
		for (int i=0; i<list1.size(); i++)
		{
			System.out.println(list1.get(i));
		}
		System.out.println("===========");
		for (int i=0; i<list2.size(); i++)
		{
			System.out.println(list2.get(i));
		}
		System.out.println("===========");
		
		//list1.add(2,"Vitthal");
		list1.addAll(list2);
		//list1.addAll(2,list2);
		
		for (int i=0; i<list1.size(); i++)
		{
			System.out.println(list1.get(i));
		}
		System.out.println("===========");
		
		for (String i : list1)
		{
			System.out.println(i);
		}
	}

}
