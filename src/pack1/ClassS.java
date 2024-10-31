package pack1;

public class ClassS
{
	int sId;
	String sName;
	ClassS(int sId,String sName)
	{
		this.sId=sId;
		this.sName=sName;
	}
	@Override
	public String toString()
	{
		return sId+" "+sName;
	}
	
}
