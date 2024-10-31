package pack1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class IostreamB 
{
	void meth1() throws Exception
	{
		System.out.println("please select are you a teacher or student");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		switch(i)
		{
		case 1:
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\core\\file4.txt",true));
			sc.nextLine();
			String que=sc.nextLine();
			byte arr[]=que.getBytes();
			bos.write(arr);
			bos.close();
		
		case 2:
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\core\\file4.txt"));
			int i1;
			while((i1=bis.read())!=-1)
			{
				System.out.print((char)i1);
			}
			System.out.println("\n");
			BufferedOutputStream bos2=new BufferedOutputStream(new FileOutputStream("C:\\core\\file4.txt",true));
			sc.nextLine();
			String ans=sc.nextLine();
			byte arr1[]=ans.getBytes();
			bos2.write(arr1);
			bos2.close();
			bis.close();
			bos2.close();
		
			
		}
		sc.close();
		
	}
	public static void main(String[] args) throws Exception 
	{
		IostreamB obj=new IostreamB();
		obj.meth1();
		
	}

}
