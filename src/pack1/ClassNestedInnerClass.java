package pack1;

public class ClassNestedInnerClass 
{
	private void msg()
	{
		System.out.println("Outer class private method");
	}
	static
	{
		System.out.println("Outer class static block");
	}
	ClassNestedInnerClass()
	{
		System.out.println("Outer class constructor");
	}
	{
		System.out.println("Outer class Instance block");
	}
	class InnerClassA
	{
		
		void meth1()
		{
			System.out.println("Inner class method");
			msg();
		}
		/*
		static
		{
			System.out.println("Outer class static block");
		}*/
		InnerClassA()
		{
			System.out.println("Inner class constructor");
		}
		{
			System.out.println("Inner class Instance block");
		}
		
	}
	public static void main(String[] args) 
	{
		ClassNestedInnerClass.InnerClassA obj=new ClassNestedInnerClass().new InnerClassA();
		obj.meth1();
	}

}
