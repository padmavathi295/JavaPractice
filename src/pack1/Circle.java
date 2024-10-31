package pack1;

import java.util.Scanner;

public class Circle extends Shape
{
	int radius;
	Scanner sc=new Scanner(System.in);
	
	public void calArea()
	{
		System.out.println("enter radius:");
		radius=sc.nextInt();
		double area=3.14*radius*radius;
		System.out.println("Area of circle is:"+area);
	}
	

}
