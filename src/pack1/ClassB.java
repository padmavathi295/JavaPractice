package pack1;

public class ClassB implements Cloneable
{
	private String empName;
	private int empId;
	private int empSal;
	private int empExp;
	
	
	public String getEmpName() 
	{
		return empName;
	}
	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	public int getEmpId() 
	{
		return empId;
	}
	public void setEmpId(int empId) 
	{
		this.empId = empId;
	}
	public int getEmpSal() 
	{
		if(empExp>=5)
		{
			int incre=(empSal*10)/100;
			return empSal+incre;
		}
		return empSal;
	}
	public void setEmpSal(int empSal) 
	{
		this.empSal = empSal;
	}
	public int getEmpExp() 
	{
		return empExp;
	}
	public void setEmpExp(int empExp) 
	{
		this.empExp = empExp;
	}
	
	ClassB show()throws CloneNotSupportedException
	{
		return (ClassB)super.clone();
	}
	
	
}
