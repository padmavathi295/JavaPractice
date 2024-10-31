package pack1;

public class ClassInstanceBlock
{
	static int x=ClassInstanceBlock.meth1();

	 static int meth1() 
	 {
		System.out.println("hi");
		return 10;
	}
	 static
	 {
		System.out.println("static block"); 
	 }
	 {
		 System.out.println("Instance block");//it is executed before constructor when we create an object for  class
		 //(How many times we create an object that many time the instance block will be executed)
	 }
	 ClassInstanceBlock()
	 {
		 System.out.println("constructor");
	 }
	 ClassInstanceBlock(int x)
	 {
		 System.out.println(x);
	 }
	 public static void main(String[] args) 
	 {
		new ClassInstanceBlock();
		new ClassInstanceBlock(10);
		new ClassInstanceBlock();
	}
}
