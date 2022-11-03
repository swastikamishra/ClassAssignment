package basicprogram;

public class VowelConsonant {
public static void main(String []args)
{
	char ch = 'a';
	if ((ch == 'a'||ch=='A')||(ch =='e'||ch=='E')||(ch == 'i'||ch=='I')||(ch == 'o'||ch=='O')||(ch == 'u'||ch=='U'))
	System.out.println(ch+ " "+ "is a Vowel");
	else if ((ch>='0')&&(ch<='9'))
	System.out.println(ch+ " "+ "is a Number");
	else
	System.out.println(ch+ " "+ "is a Consonant");
		
}
}

