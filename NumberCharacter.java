package basicprogram;

public class NumberCharacter {
public static void main(String []args)
{
	char ch = '0';
	if ((ch == 'a'||ch=='A')||(ch =='e'||ch=='E')||(ch == 'i'||ch=='I')||(ch == 'o'||ch=='O')||(ch == 'u'||ch=='U'))
	System.out.println(ch+" "+ "is Vowel");
	else if (ch==48)
	System.out.println(ch+" "+ "is Zero");
	else
	System.out.println(ch+" "+ "is Consonant");
}
}		
	


