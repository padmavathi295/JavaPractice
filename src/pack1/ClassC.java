package pack1;

import java.util.Scanner;

public class ClassC 
{
	public void meth1() throws CloneNotSupportedException
	{
		Scanner sc=new Scanner(System.in);
		ClassB aobj=new ClassB();
		
		System.out.println("\nenter empName:");
		aobj.setEmpName(sc.next());
		
		System.out.println("\nenter empId:");
		aobj.setEmpId(sc.nextInt());
		
		System.out.println("\nenter empSal:");
		aobj.setEmpSal(sc.nextInt());
		
		System.out.println("\nenter empExp:");
		aobj.setEmpExp(sc.nextInt());
		
		System.out.println("\nprinting employee details");
		System.out.println("Employee Name:"+aobj.getEmpName());
		System.out.println( "Employee Id:"+aobj.getEmpId());
		System.out.println( "Employee Salary:"+aobj.getEmpSal());
		System.out.println( "Employee Experience:"+aobj.getEmpExp());
		
		ClassB aobj1=aobj.show();
		System.out.println("\nprinting clone object employee details");
		System.out.println("Employee Name:"+aobj1.getEmpName());
		System.out.println( "Employee Id:"+aobj1.getEmpId());
		System.out.println( "Employee Salary:"+aobj1.getEmpSal());
		System.out.println( "Employee Experience:"+aobj1.getEmpExp());
		
		System.out.println("\nenter empName:");
		aobj1.setEmpName(sc.next());
		
		System.out.println("\nenter empId:");
		aobj1.setEmpId(sc.nextInt());
		
		System.out.println("\nenter empSal:");
		aobj1.setEmpSal(sc.nextInt());
		
		System.out.println("\nenter empExp:");
		aobj1.setEmpExp(sc.nextInt());
		
		System.out.println("\nprinting clone object employee details");
		System.out.println("Employee Name:"+aobj1.getEmpName());
		System.out.println( "Employee Id:"+aobj1.getEmpId());
		System.out.println( "Employee Salary:"+aobj1.getEmpSal());
		System.out.println( "Employee Experience:"+aobj1.getEmpExp());
		sc.close();	
	}
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		new ClassC().meth1();
	}

}
