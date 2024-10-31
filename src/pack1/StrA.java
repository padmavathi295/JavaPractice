package pack1;

public class StrA 
{
	public int countHi(String str)
	{
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)=='h'&&str.charAt(i+1)=='i')
				count++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		StrA aobj=new StrA();
		int result=aobj.countHi("abchiabhichi");
		System.out.println(result);
		
	}
}
