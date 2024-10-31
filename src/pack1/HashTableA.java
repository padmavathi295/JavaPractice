package pack1;

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class HashTableA 
{
	void meth1()
	{
		System.out.println("implementing Hashtable");
		Hashtable<Object,Object> ht=new Hashtable<Object,Object>();
		ht.put(101, "java");
		ht.put("java", "java");
		ht.put(105, "java");
		ht.put(106, 2000);
		ht.put(102, 4000);
		ht.put(104, "css");
		ht.put(107, "aws");
		ht.put(103, 3000);
		System.out.println(ht);
		
		ArrayList<Object> al=new ArrayList<Object>(ht.entrySet());
		Iterator<Object> i=al.iterator();
		while(i.hasNext())
		{
			//System.out.println(i.next());
			Entry e=(Entry)i.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
	public static void main(String[] args) 
	{
		new HashTableA().meth1();
		
	}

}
