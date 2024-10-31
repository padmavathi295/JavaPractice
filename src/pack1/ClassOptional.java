package pack1;

import java.util.Arrays;
import java.util.Optional;

public class ClassOptional 
{
	void meth1()
	{
		String arr[]=new String[5];
		arr[1]="paddu";
		arr[3]="pandu";
		//System.out.println("values are:"+Arrays.toString(arr));
		//System.out.println(arr[0].toUpperCase());
		Optional<String> o=Optional.ofNullable(arr[1]);//It should not consider NULL as value
		System.out.println(o);
		if(o.isPresent())
		{
			System.out.println("data is present");
			System.out.println(o.get());
		}
		else
		{
			System.out.println("data i not present& it's empty");
		}
		for(String s:arr)
		{
			Optional<String> o1=Optional.ofNullable(s);
			if(o1.isPresent())
			{
				System.out.println( o1.get().toUpperCase());
			}
			else
			{
				System.out.println("it's empty");
			}
		}
		/*
		for(String s:arr)
		{
			System.out.println(s.toUpperCase());//Generates NULLPOINTEREXCEPTION
		}*/
	}
	public static void main(String[] args) 
	{
		ClassOptional obj=new ClassOptional();
		obj.meth1();
	}
	
}
