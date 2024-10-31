package pack1;

public class AnonymousClass1 
{
	static AnonymousOuterClass obj=new AnonymousOuterClass()
	{
	  @Override
	  void print()
	  {
		 System.out.println("start");
		 super.print();
		 System.out.println("I am in print() method of Anonymous Class1");
		 System.out.println("End");
	  }
	}
	;
	public static void main(String[] args) 
	{
		obj.print();
	}

}
