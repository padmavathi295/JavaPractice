package pack1;

import java.util.ArrayList;
import java.util.TreeSet;

public class ClassSorted 
{
	ArrayList<Integer> meth1(ArrayList<Integer> al1,ArrayList<Integer> al2)
	{/*
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(10);
		al1.add(30);
		al1.add(50);
		al1.add(70);
		al1.add(90);
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(20);
		al2.add(40);
		al2.add(60);
		al2.add(80);
		al2.add(100);
		System.out.println(al1);
		System.out.println(al2);
		al2.addAll(al1);
		System.out.println(al2);
		*/
		TreeSet<Integer> mergeset=new TreeSet<Integer>();
		mergeset.addAll(al1);
		mergeset.addAll(al2);
		ArrayList<Integer> mergelist=new ArrayList<Integer>(mergeset);
		
		return mergelist;
	}
	public static void main(String[] args) 
	{
		ClassSorted obj=new ClassSorted();
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(10);
		al1.add(30);
		al1.add(50);
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(20);
		al2.add(40);
		al2.add(60);
		ArrayList<Integer> list=obj.meth1(al1, al2);
		System.out.println(list);
		
		
	}

}
