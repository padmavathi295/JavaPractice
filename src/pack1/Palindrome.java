package pack1;

public class Palindrome 
{
	void meth1(String name)
	{
		String rev="";
		for(int i=0;i<=name.length()-1;i++)
		{
			rev=rev+name.charAt(i);
		
		}
		System.out.println(name);
		System.out.println(rev);
		
		if(name.equals(rev))
		
			System.out.println(name+"is a palindrome");
		else
			System.out.println(name+"is not a palindrome");
		
	}
	public static void main(String[] args) 
	{
		Palindrome aobj=new Palindrome();
		aobj.meth1("madam");
		
		
	}
		
}
	
	


