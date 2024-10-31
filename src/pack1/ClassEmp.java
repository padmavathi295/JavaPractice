package pack1;

import java.util.Scanner;

public class ClassEmp 
{
	int eId;
	String eName;
	int eSalary;
	String eAddress;
	
	void meth1()
	{
		System.out.println("enter employee details");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter EMP Id");
		eId=sc.nextInt();
		System.out.println("enter EMP Name");
		eName=sc.next();
		System.out.println("enter EMP Salary");
		eSalary=sc.nextInt();
		System.out.println("enter EMP Address");
		eAddress=sc.nextLine();	
		sc.close();
	}
	public static void main(String[] args) 
	{
		ClassEmp obj=new ClassEmp();
		obj.meth1();
		System.out.println(obj.eId+","+obj.eName+","+obj.eSalary+","+obj.eAddress);
	}

}
