package pack1;

import java.util.Arrays;

public class ClassParllelSorting 
{
	void meth1()
	{
		int arr[]= {7,3,4,2,7,5,9,1,8};
		System.out.println("Before sorting:"+Arrays.toString(arr));
		//Arrays.sort(arr);
		
		Arrays.parallelSort(arr,2,6);
		System.out.println("Before sorting:"+Arrays.toString(arr));
		Arrays.parallelSort(arr,0,2);
		Arrays.parallelSort(arr,6,9);
		System.out.println("\nBefore sorting:"+Arrays.toString(arr));
	}
	public static void main(String[] args) 
	{
		new ClassParllelSorting().meth1();
	}

}
