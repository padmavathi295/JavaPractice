package pack1;

import java.util.Scanner;

public class Rectangle extends Shape
{
	int length;
	int width;
	Scanner sc=new Scanner(System.in);
	
	public void calArea()
	{
		System.out.println("enter length:");
	    length=sc.nextInt();
	    System.out.println("enter width:");
	    width=sc.nextInt();
		int area=length*width;
		System.out.println("Area of rectangle is:"+area);
	}

}
