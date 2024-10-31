package pack1;

import java.util.ArrayList;

public class ArrayListC 
{
	void meth1()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(11);
		al.add(9);
		al.add(16);
		al.add(19);
		al.add(18);
		System.out.println("BEFORE removing EVEN elemets from al:"+al);
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)%2==0)
			{
				al.remove(i);
			}
		}
		System.out.println("\nAFTER removing EVEN elements from al:"+al);
	}
	public static void main(String[] args) 
	{
		ArrayListC obj=new ArrayListC();
		obj.meth1();
		
	}

}
