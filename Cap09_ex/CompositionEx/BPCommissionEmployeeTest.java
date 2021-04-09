// BasePlusCommissionEmployeeTest.java
// Testing class BasePlusCommissionEmployee.

public class BasePlusCommissionEmployeeTest
{
   public static void main(String[] args) 
   {
      // instantiate BasePlusCommissionEmployee object
      CommissionEmployee employee = 
         new CommissionEmployee
          ("Bob", "Lewis", "333-33-3333", 5000, .04);
      
      double salary = 5000;

      BPCommissionEmployee bemployee = new BPCommissionEmployee(employee, salary);
      
      System.out.printf(bemployee.toString());
   } // end main
} // end class BasePlusCommissionEmployeeTest
