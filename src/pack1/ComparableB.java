package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ComparableB 
{
	void meth1()
	{
		ArrayList<ComparableA> al=new ArrayList<ComparableA>();
		ComparableA emp1=new ComparableA("Kishan", 103, "Java");
		ComparableA emp2=new ComparableA("Aliya", 102, "Oracle");
		ComparableA emp3=new ComparableA("Cristine", 104, "AWS");
	       
	    al.add(emp1);
	    al.add(emp2);
	    al.add(emp3);
	    al.add(new ComparableA("John", 101, "Spring"));
	    //System.out.println("al:"+al);
	       
	    System.out.println("\nReteriving the data");        
	       
	    Iterator<ComparableA> i=al.iterator();
	    while(i.hasNext())
	    {
	        System.out.println(i.next());
	    }
	    Collections.sort(al);
	    System.out.println("\nReteriving the data after sorting");        
	       
	    Iterator<ComparableA> i2=al.iterator();
	    while(i2.hasNext())
	    {
	        System.out.println(i2.next());
	    }
	   
	}
	void meth2()
	{
		int arr[]= {2,8,5,7,9,3,6,1,4};
		System.out.println("\narr:"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("arr:"+Arrays.toString(arr));
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(50);
		al.add(30);
		al.add(10);
		al.add(20);
		al.add(40);
		System.out.println("\nal:"+al);
		Collections.sort(al);//WORKS ONLY ON LIST CLASSES
		System.out.println("al:"+al);
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(100);
		set.add(500);
		set.add(300);
		set.add(200);
		set.add(400);
		System.out.println("\nset:"+set);
		//Collections.sort(set);//works only lists
		ArrayList<Integer> al2=new ArrayList<Integer>(set);
		Collections.sort(al2);
		System.out.println("set:"+al2);
		
	}
	public static void main(String[] args) 
	{
		ComparableB obj=new ComparableB();
		obj.meth1();
		//obj.meth2();
		
	}

}
