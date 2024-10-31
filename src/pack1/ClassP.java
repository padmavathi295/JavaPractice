package pack1;

import java.util.HashSet;

public class ClassP //counting unique vowels
{
	void meth1(String s)
	{
		s=s.toLowerCase();
		int count=0;
		HashSet<Character> vowels=new HashSet<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(vowels.contains(ch))
			{
				count++;
				vowels.remove(ch);
			}
		}
		
		System.out.println("unique vowels count is:"+count);
	}
	public static void main(String[] args) 
	{
		new ClassP().meth1("aAeEiIoOuU");;
	}

}
