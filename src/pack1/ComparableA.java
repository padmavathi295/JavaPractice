package pack1;

public class ComparableA implements Comparable<ComparableA>
{
	    String empName;
	    int empId;
	    String empDept;
	   
	   public ComparableA(String empName, int empId, String empDept)
	   {
	       this.empName = empName;
	       this.empId = empId;
	       this.empDept = empDept;
	   }
	   @Override
	   public String toString()
	   {
		   return empName+" "+empId+" "+empDept;
	   }
	@Override
	public int compareTo(ComparableA o) 
	{
		//return Integer.compare(this.empId, o.empId);//basing on empId
		//return this.empName.compareTo(o.empName);//basing on empName
		//return this.empDept.compareTo(o.empDept);//basing on empDept
		return o.empName.compareTo(this.empName);//basing on empName(Descending order)
	}

}
