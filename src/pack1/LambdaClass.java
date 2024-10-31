package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Map.Entry;

public class LambdaClass
{
	void method1()
	{
	
		LambdaInterfaceA p=(int n, ArrayList al)->
		{
			//System.out.println(al);
			System.out.println(n);
			Iterator<Integer> i=al.iterator();
			while(i.hasNext())
			{
				System.out.print(i.next()+" ");
			}
			
		};
	
	    ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		p.meth1(5,al);
	}
	void method2()
	{
		LambdaInterfaceB q=(int a,String s,char c)->
		{
           return a+" "+c+" "+s;
		};
		String result=q.meth2(2,"Java", 'A');
		System.out.println(result);
	}
	void Method3()
	{
		LambdaInterfaceC r=(int a,ClassS b)->
		{
			System.out.println(a+"\n"+b);
		};
	
		r.meth3(10,new ClassS(101,"Paddu"));
	}
	void method4()
	{
		LambdaInterfaceD s=(HashMap hm,ArrayList al)->
		{
			//System.out.println(hm+"\n"+al);
			ArrayList al2=new ArrayList(hm.entrySet());
			Iterator i=al2.iterator();
			while(i.hasNext())
			{
				Entry e=(Entry)i.next();
				System.out.println(e.getKey()+" "+e.getValue());
			}
			Iterator i1=al.iterator();
			while(i1.hasNext())
			{
				System.out.println(i1.next());
			}
		};
		HashMap<Object,Object> hm1=new HashMap<Object,Object>();
		hm1.put(101,"Java");
		hm1.put(102, "Aws");
		hm1.put(103,".Net");
		ArrayList<Object> al1=new ArrayList<Object>(hm1.keySet());
		//al1.add(10);
		//al1.add(20);
		s.meth4(hm1, al1);
	}
	void method5()
	{
		LambdaInterfaceE t=(int arr[],TreeSet ts)->
		{
			//System.out.println("ts:"+ts);
			Iterator x=ts.iterator();
			while(x.hasNext())
			{
				System.out.print(x.next()+" ");
			}
			System.out.println();
			
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return new int[] {3,2,5};
			
		};
		//int arr1[]=new int[] {20,50,30,10,40};
		TreeSet<Object>ts1=new TreeSet<Object>();
		ts1.add(35);
		ts1.add(15);
		ts1.add(25);
		//int[] result=t.meth5(arr1, ts1);
		int[] result=t.meth5(new int[] {20,50,30,10,40}, ts1);
		System.out.println("result:"+Arrays.toString(result));
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Implementing diiferent types of Lambda Functions/Lambda Expressions");
		LambdaClass obj=new LambdaClass();
		//obj.method1();
		//obj.method2();
		//obj.Method3();
		//obj.method4();
		obj.method5();
		
	}

}
