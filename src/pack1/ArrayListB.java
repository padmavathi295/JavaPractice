package pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListB 
{
	void meth1()
	{
		ArrayList<String> al=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 strings: ");
		System.out.println("enter 1st string:");
		al.add(sc.next());
		System.out.println("enter 2nd string:");
		al.add(sc.next());
		System.out.println("enter 13rd string:");
		al.add(sc.next());
		System.out.println("enter 4th string:");
		al.add(sc.next());
		System.out.println("enter 5th string:");
		al.add(sc.next());
		System.out.println("\nuser entered strings are:"+al);
		sc.close();
		
	}
	public static void main(String[] args) 
	{
		ArrayListB obj=new ArrayListB();
		obj.meth1();
	}

}
