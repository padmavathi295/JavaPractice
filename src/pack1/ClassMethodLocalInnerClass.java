package pack1;

public class ClassMethodLocalInnerClass 
{
	void meth1()
	{
		System.out.println("meth1() called");
		String s="Java";
		class InnerClassA
		{
			void msg()
			{
				System.out.println(s.concat(" is Awesome"));
			}
			static
			{
				System.out.println("method local Inner Class static block");
			}
			InnerClassA()
			{
				System.out.println("method local Inner Class Constructor");
			}
			{
				System.out.println("method local Inner Class Instsnce block");
			}
		}
		new InnerClassA().msg();
	}
	static
	{
		System.out.println("method local Inner Class static block");
	}
	ClassMethodLocalInnerClass()
	{
		System.out.println("method local Inner Class Constructor");
	}
	{
		System.out.println("method local Inner Class Instance block");
	}
	void meth2()
	{
		System.out.println("meth2() called");
		String s="India";
		class InnerClassB
		{
			void msg1()
			{
				System.out.println(("I Love ").concat(s));
			}
		}
		new InnerClassB().msg1();
		class InnerClassC
		{
			void msg2()
			{
				System.out.println(s.concat(" is My Country"));
			}
		}
		new InnerClassC().msg2();
	}
	public static void main(String[] args) 
	{
		ClassMethodLocalInnerClass obj=new ClassMethodLocalInnerClass();
		//obj.meth1();
		obj.meth2();
	}

}
