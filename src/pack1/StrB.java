package pack1;

public class StrB 
{
	public int countCode(String str)
	{
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.substring(i,i+2).equalsIgnoreCase("co")&&str.charAt(i+3)=='e')//if(str.charAt(i)=='c'&&str.charAt(i+1)=='o'&&str.charAt(i+3)=='e')
				count++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		StrB aobj=new StrB();
		int result=aobj.countCode("abbacodeacopebcozeb");
		System.out.println(result);
		
	}

}
