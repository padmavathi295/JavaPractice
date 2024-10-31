package pack1;

public class ColNum 
{
	int meth1(String colname)
	{
		int result=0;
		for(int i=0;i<colname.length();i++)
		{
			char ch=colname.charAt(i);
			int colvalue=ch-'A'+1;
			result=result*26+colvalue;
		}
		return result;
	}
	public static void main(String[] args) 
	{
		ColNum obj=new ColNum();
		int result=obj.meth1("ZY");
		System.out.println(result);
		
	}

}
