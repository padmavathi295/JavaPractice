package pack1;

import java.util.Arrays;

public class Arraypi 
{
	public int[] makepi()
	{
		return new int[] {3,1,4};
	}
	public static void main(String[] args) 
	{
		Arraypi aobj=new Arraypi();
		int result[]=aobj.makepi();
		System.out.println(Arrays.toString(result));
		
	}

}
