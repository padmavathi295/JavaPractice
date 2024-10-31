package pack1;

import java.util.Comparator;

public class ComparatorC implements Comparator<ComparatorA>
{

   @Override
   public int compare(ComparatorA o1, ComparatorA o2)
   {
       //return Integer.compare(o1.getEmpId(), o2.getEmpId()); // basing on empId
       //return o1.getEmpName().compareTo(o2.getEmpName());// basing on empName
       //return o1.getEmpDept().compareTo(o2.getEmpDept()); // basing on empDept
       return o2.getEmpDept().compareTo(o1.getEmpDept());// basing on empDept(DESCENDING ORDER)
   }    
}
