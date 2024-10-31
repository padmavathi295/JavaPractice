package pack1;

public class Array2 
{
	int meth1(int[] arr)
	{
		if(arr.length>=2)
			return arr[0]+arr[1];
		else if(arr.length==1)
			return arr[0];
		else
			return 0;
		
	}
	public static void main(String[] args) 
	{
		Array2 aobj=new Array2();
		int input1[]= {2,3,4,5};
		int result=aobj.meth1(input1);
	System.out.println(result);	
	}	
	

}
