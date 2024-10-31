package pack1;
import java.util.Arrays;

public class Array1 
{
	int[] meth1()
	{
		int arr[]= {2,3,4};
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==2 && arr[i+1]==3)
			{
					arr[i+1]=0;
			}
		}
		return arr;
	}
	public static void main(String[] args) 
	{
		Array1 aobj=new Array1();
		int result[]=aobj.meth1();
		System.out.println(Arrays.toString(result));
		
	}

}
