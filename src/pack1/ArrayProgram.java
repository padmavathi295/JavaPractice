package pack1;

import java.util.Arrays;

public class ArrayProgram
{
	String[] meth1(int arr1[],char arr2[])
	{
		int revarr[]=new int[arr1.length];
		/*for(int i=arr1.length-1;i>=0;i--)
		{
			revarr[(arr1.length-1)-i]=arr1[i];
		}
		*/
		for(int i=0;i<=arr1.length-1;i++)
		{
			revarr[i]=arr1[(arr1.length-1)-i];
		}
		System.out.println("arr1:"+Arrays.toString(arr1));
		System.out.println("revarr:"+Arrays.toString(revarr));
		System.out.println("-----------------------------");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		for(int i=arr2.length-1;i>=0;i--)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		for(char c:arr2)
		{
			System.out.print(c+" ");
		}
		System.out.println("\n--------------------------------");
		return new String[] {"java","oracle","html","spring","devops"};
	}
	public static void main(String[] args) 
	{
		ArrayProgram aobj=new ArrayProgram();
		String result[]=aobj.meth1(new int[] {10,20,30},new char[] {'A','B','C'});
		
		if(result.length%2==0)
		{
			for(int i=0;i<result.length/2;i++)
			{
				System.out.println(result[i]);
			}
		}
		else
		{
			System.out.println(result[result.length-2]+" "+result[result.length-1]);
			
		}
		
		
		
		
	}
	
}
