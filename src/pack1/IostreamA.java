package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IostreamA 
{
	void fileOperations1() throws Exception
	{
		System.out.println("Reading data from a file");
		FileInputStream fis=new FileInputStream("C:\\core\\file1.txt");
		System.out.println("connection created");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println("\ndata reterived");
		fis.close();
	}
	void fileOperations2() throws Exception
	{
		System.out.println("\nwriting data into a file");
		//FileOutputStream fos=new FileOutputStream("C:\\core\\file2.txt");
		FileOutputStream fos=new FileOutputStream("C:\\core\\file2.txt",true);
		System.out.println("connection created");
		String msg=" because it is Awesome";
		byte arr[]=msg.getBytes();
		fos.write(arr);
		System.out.println("data entered");
		fos.close();
	}
	void fileOperations3() throws Exception
	{
		System.out.println("\ncopying data ");
		FileInputStream fis=new FileInputStream("C:\\core\\file2.txt");
		FileOutputStream fos=new FileOutputStream("C:\\core\\file3.txt");
		System.out.println("connection created");
		int i;
		while((i=fis.read())!=-1)
		{
			fos.write(i);
		}
		System.out.println("data copied");
		fis.close();
		fos.close();
	}
	public static void main(String[] args) throws Exception 
	{
		IostreamA obj=new IostreamA();
	    obj.fileOperations1();
		//obj.fileOperations2();
		obj.fileOperations3();
	}

}
