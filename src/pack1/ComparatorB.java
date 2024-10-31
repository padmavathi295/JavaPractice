package pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorB 
{
	  void meth1()
	   {
	       System.out.println("Implementing Comparable Interface");
	       
	       ArrayList<ComparatorA> al=new ArrayList<ComparatorA>();
	       
	       ComparatorA emp1=new ComparatorA("Kishan", 103, "Java");
	       ComparatorA emp2=new ComparatorA("Aliya", 102, "Oracle");
	       ComparatorA emp3=new ComparatorA("Cristine", 104, "AWS");
	       
	       al.add(emp1);
	       al.add(emp2);
	       al.add(emp3);
	       al.add(new ComparatorA("John", 101, "Spring"));
	       
	       System.out.println("\nReteriving the data");        
	       
	       Iterator<ComparatorA> i=al.iterator();
	       while(i.hasNext())
	       {
	           System.out.println(i.next());
	       }
	       
	       Collections.sort(al,new ComparatorC());
	       
	       System.out.println("\nReteriving the data after sorting");
	       
	       Iterator<ComparatorA> i2=al.iterator();
	       while(i2.hasNext())
	       {
	           System.out.println(i2.next());
	       }        
	   }    
	   public static void main(String[] args)
	   {
		   ComparatorB bobj=new ComparatorB();        
	       bobj.meth1();
	       //bobj.meth2();
	   }

}
