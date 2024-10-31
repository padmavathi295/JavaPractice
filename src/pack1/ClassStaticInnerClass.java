package pack1;

public class ClassStaticInnerClass 
{
	int x=10;
	static int y=20;
	ClassStaticInnerClass()
	{
		System.out.println("outer class constructor");
	}
	{
		System.out.println("outer class Instance block");
	}
	static
	{
		System.out.println("outer class static block");
	}
	static class InnerClassA
	{
		void meth1()
		{
			System.out.println("Inner class method");
			System.out.println("Outer class Instance variable:"+new ClassStaticInnerClass().x);
			System.out.println("Outer class Static variable:"+y);
		}
		InnerClassA()
		{
			System.out.println("Inner class constructor");
		}
		{
			System.out.println("Inner class Instance block");
		}
		static
		{
			System.out.println("Inner class static block");
		}
		 public static void main(String[] args) 
		{
			 new InnerClassA().meth1();
			
		}
		
	}
	public static void main(String[] args) 
	{
		ClassStaticInnerClass.InnerClassA obj=new ClassStaticInnerClass.InnerClassA();
		obj.meth1();
	}

}
