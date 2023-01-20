package CollectionFramework;

import java.util.*; //for linkedHashset

import java.util.HashSet;
import java.util.Set;


public class LinkedHashSetIntro {
	public static void main (String args [])
	{

		LinkedHashSet <String> Demo = new LinkedHashSet <String>();
		
		Demo.add(" Milli ");
		Demo.add(" Mickey ");
		Demo.add(" Monika ");
		Demo.add(" Rakesh ");
		
		for ( String b : Demo)
		{
			System.out.println(b);
		}
		
		//All the method of sets (Here linkedHashSet)
		System.out.println(Demo.contains(" Milli "));
		System.out.println(Demo.isEmpty());
		System.out.println(Demo.remove(" Milli "));
		
		Demo.clear();
		System.out.println("Null"+Demo);
		System.out.println(Demo.isEmpty());
	}
	

}
