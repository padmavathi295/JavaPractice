package pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClasssStreamApiA 
{
	void meth1()
	{
		 ArrayList<Integer> al=new ArrayList<Integer>();
		 al.add(20);
		 al.add(50);
		 al.add(30);
		 al.add(10);
		 al.add(20);
		 System.out.println("al:"+al);
		 
		 System.out.println("\nreteriving the datd using STREAMAPI");
		 al.forEach(i->System.out.println(i));//for each() takes consumer(Functional Interface) as input
		 /*
		  forEach()	is used to reteriving the elements
		 */
	}
	void meth2()
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("john");
		al.add("miller");
		al.add("alex");
		al.add("anu");
		al.add("ramya");
		/*
		Stream<String> s1=al.stream();
		Stream s2=s1.filter(data->data.length()<=4);//filter() is present in stream. filter() accepts predicate(Functional Interface) as input
		long l1=s2.count();
		*/
		
		long l1=al.stream().filter(data->data.length()<=4).count();
		System.out.println("there are "+l1+" elements whose length is <=4");
		
		//System.out.println("there are "+al.stream().filter(data->data.length()<=4).count()+" elements whose length is <=4");	
	}
	void meth3()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		 al.add(20);
		 al.add(50);
		 al.add(30);
		 al.add(10);
		 al.add(40);
		 System.out.println("\nBefore al is:"+al);
		 /*
		 Stream<Integer> s1=al.stream();
		 Stream<Integer> s2=s1.map(data->data*2);//map() is present in stream. map() accepts function(Functional Interface) as input
		 List<Integer> li=s2.collect(Collectors.toList());
		 */
		 List<Integer> li=al.stream().map(data->data*2).collect(Collectors.toList());
		 System.out.println("\nAfter al is:"+li);
		 //System.out.println("\nAfter al is:"+al.stream().map(data->data*2).collect(Collectors.toList()));
	}
	void meth4()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		 al.add(20);
		 al.add(50);
		 al.add(30);
		 al.add(10);
		 al.add(40);
		 System.out.println("\nBefore al is:"+al);
		// Collections.sort(al);
		 /*
		 Stream<Integer> s1=al.stream();
		 Stream<Integer> s2=s1.sorted();//sorted() is present in stream. stream() accepts supplier(Functional Interface) as input
		 List<Integer> li=s2.collect(Collectors.toList());
		*/
		 List<Integer> li=al.stream().sorted().collect(Collectors.toList());
		 System.out.println("\nAfter al is:"+li);
		 //System.out.println("\nAfter al is:"+al.stream().sorted().collect(Collectors.toList()));;
	}
	
	public static void main(String[] args) 
	{
		ClasssStreamApiA obj=new ClasssStreamApiA();
		//obj.meth1();
		//obj.meth2();
		//obj.meth3();
		obj.meth4();
		
	}
}

