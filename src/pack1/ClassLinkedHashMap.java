package pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class ClassLinkedHashMap 
{
	void display()
	{
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(101,"paddu");
		map.put(105,"Amani");
		map.put(102,"Vineela");
		map.put(104,"Keerthi");
		map.put(103,"pandu");
		System.out.println("printing values");
		ArrayList<Object> al=new ArrayList<Object>(map.entrySet());
		Iterator<Object> i=al.iterator();
		while(i.hasNext())
		{
			Entry e=(Entry)i.next();
			System.out.println(e.getValue()+" ");
		}
		TreeSet<Object> ts=new TreeSet<Object>(map.keySet());
		ArrayList<Object> al1=new ArrayList<Object>();
	    Iterator<Object> i1=ts.descendingIterator();
	    while(i1.hasNext())
	    {
	    	al1.add(i1.next());
	    }
	    System.out.println("\n\nal1"+al1);
		
	}
	static void msg()
	{
		System.out.println("this is ststic method referencing");
	}
	ClassLinkedHashMap()
	{
		System.out.println("this is constructor referencing");
	}

}
