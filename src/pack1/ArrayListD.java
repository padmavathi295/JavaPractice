package pack1;

import java.util.ArrayList;

public class ArrayListD 
{
	void meth1()
	{
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		System.out.println("al1 elements:"+al1);
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(60);
		al2.add(70);
		al2.add(80);
		al2.add(90);
		al2.add(100);
		System.out.println("\nal2 elements:"+al2);
		al1.addAll(al2);
		System.out.println("\naftre merging TWO arratlists:"+al1);
	}
	public static void main(String[] args) 
	{
		ArrayListD obj=new ArrayListD();
		obj.meth1(); 
		
	}

}
