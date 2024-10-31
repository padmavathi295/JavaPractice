package pack1;

public class  ComparatorA//POJO CLASS
{
	   private String empName;
	   private int empId;
	   private String empDept;
	   
	   public ComparatorA(String empName, int empId, String empDept)
	   {
	       this.empName = empName;
	       this.empId = empId;
	       this.empDept = empDept;
	   }
	   @Override
	   public String toString()
	   {
	       return empName + " " + empId + " " + empDept ;
	   }
	   public String getEmpName()
	   {
	       return empName;
	   }
	   public int getEmpId()
	   {
	       return empId;
	   }
	   public String getEmpDept()
	   {
	       return empDept;
	   }

}
