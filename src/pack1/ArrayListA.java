package pack1;

import java.util.ArrayList;

public class ArrayListA 
{
	public void meth1()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println("ArrayList elements are al:"+al);
	}
	public static void main(String[] args) 
	{
		ArrayListA obj=new ArrayListA();
		obj.meth1();
		
	}
	
	

}
