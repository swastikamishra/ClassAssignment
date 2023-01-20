package CollectionFramework;
 
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;  

public class HashSetIntro {
	
	public static void main (String args [])
	{
		HashSet <String> intro = new HashSet <String>();
		
		intro.add("Fries");
		intro.add("Burger");
		intro.add("Pizza");
		
		Iterator itr = intro.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(intro.size()); //checks the size of the HashSet
		
		System.out.println(intro.hashCode()); //To check the unique code
		
		System.out.println(intro.contains("Fries")); //checks whether given element is present in the list or not
		
		//Converting a HashSet into an Array
		
		String name [] = new String [intro.size()];
		intro.toArray(name);

		System.out.println("Array is: ");
		for (String s : name)
		{
			System.out.println(s);
		}
		
		//Converting a HashSet into an ArrayList
		
		ArrayList<String> listt = new ArrayList<String>(intro);
		System.out.println(listt);
	}
	

}
