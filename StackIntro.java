package CollectionFramework;

import java.util.Stack;

public class StackIntro {
	
	public static void main (String args [])
	{
		Stack<String> intro = new Stack <String>();
		
		intro.push("Swastika");
		intro.push("Monika");
		intro.push("Rakesh");
		intro.push("Sanskar");
		
		System.out.println("Here's your family Swastika!");
		
		for(String s : intro) //For each loop.
		{
			System.out.println(s); //Will print o/p in a vertical manner
		}
		
		System.out.println(intro.empty()); //will return boolean value,here will return false as stack is not empty.
		
		String popped = intro.pop(); //will pop(remove) the last entered element i.e Sanskar as stack follows LIFO
		System.out.println(popped);
		System.out.println(intro); //will print o/p like a list
		
		String peeked = intro.peek(); //will retrieve the last entered element but will not remove it.
		System.out.println(peeked);
	}

}
