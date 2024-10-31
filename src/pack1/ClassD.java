package pack1;

public class ClassD 
{
	void display()
	{
		System.out.println("display method");
	}
	static int show(int a)
	{
		System.out.println(a+a);
		return a+a++;
	}
	ClassD()
	{
		this(show(50));
		
	}
	ClassD(int a)
	{
		System.out.println(a+100);
	}
	public static void main(String[] args) 
	{
		new ClassD().display();
		
	}

}
