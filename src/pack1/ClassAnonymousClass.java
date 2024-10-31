package pack1;

public class ClassAnonymousClass 
{
	void meth1()
	{
		System.out.println("Hello World");
	}
	public static void main(String[] args) 
	{
		ClassAnonymousClass obj=new ClassAnonymousClass()
				{
			       @Override
			       void meth1()
			       {
			    	   System.out.println("Welcome to Java");
			    	   super.meth1();
			       }
			
				}
		        ;
		        obj.meth1();
	}

}
