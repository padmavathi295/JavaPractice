package pack1;

public class ClassEnum 
{
	void meth1()
	{
		System.out.println("Using enum");
		Days d=Days.saturday;
		System.out.println("===>"+d);
		System.out.println("Using Enu in switch");
		switch(d)
		{
		case saturday:
			System.out.println(d+"is last session of our core java");
			break;
		case sunday:
			System.out.println(d+"is holiday, no class ");
			break;
		default:
			System.out.println("invalid data");
		}
		Days arr[]=Days.values();
		for(Days i:arr)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		ClassEnum obj=new ClassEnum();
		obj.meth1();
	}

}
