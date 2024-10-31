package pack1;

public class PerfectNum 
{
	boolean meth1(int n)
	{
		if(n<=1)
		{
			return false;
		}
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum==n;
		
	}
	public static void main(String[] args)
	{
		PerfectNum obj=new PerfectNum();
		boolean result=obj.meth1(28);
		System.out.println(result);
		
		
	}
}
