package CollectionFramework;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class HashMapIntro {
	public static void main (String []args)
	{
		HashMap <Integer,String> hs = new HashMap <Integer,String>();
		
		hs.put(1, "Milli");
		hs.put(2, "Swastika");
		hs.put(3, "Mickey");
		
		System.out.println(hs);
		
		Set set = hs.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.println("Key is: "+mentry.getKey() +" "+"Value is: "+mentry.getValue());
		}
	}

}
