package pack1;

import java.util.ArrayList;
import java.util.Iterator;

public class Exam1 
{
	 ArrayList<String> meth1(ArrayList<Integer>al1,ArrayList<Boolean> al2, char arr[])
	   {
	       for(int i=0;i<al1.size();i++)        
	           System.out.print(al1.get(i)+" ");
	       
	       System.out.println("\n\n--------------");
	   
	       Iterator<Boolean> i=al2.iterator();
	       while(i.hasNext())
	           System.out.print(i.next()+" ");
	       
	       System.out.println("\n\n--------------");
	       
	       for(char c:arr)        
	           System.out.print(c+" ");    
	       System.out.println("\n\n--------------");
	       
	       ArrayList<String> al3=new ArrayList<String>();
	       al3.add("hi");
	       al3.add("hello");
	       return al3;
	       
	   }
	   public static void main(String[] args)
	   {
	       Exam1 aobj=new Exam1();
	       
	       ArrayList<Integer> input1=new ArrayList<Integer>();
	       input1.add(10);
	       input1.add(20);
	       
	       ArrayList<Boolean> input2=new ArrayList<Boolean>();
	       input2.add(false);
	       input2.add(true);
	       
	       ArrayList<String> result=aobj.meth1(input1,input2,new char[] {'J','a','v','a'});
	       for(int i=0;i<result.size();i++)
	       {
	           System.out.print(result.get(i)+" ");
	       }
	       System.out.println("\n\n");
	       for(int i=result.size()-1;i>=0;i--)
	       {
	           System.out.print(result.get(i)+" ");
	       }
	   }
	}


