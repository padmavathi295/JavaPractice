package pack1;

public class ClassMethodReference 
{
	void show()
	{
		//InterfaceMethodRef x=new ClassLinkedHashMap()::display;
		InterfaceMethodRef x=ClassLinkedHashMap::msg;
		//InterfaceMethodRef x=ClassLinkedHashMap::new;
		x.meth1();
	}
	
	public static void main(String[] args) 
	{
		new ClassMethodReference().show();
		
	}

}
