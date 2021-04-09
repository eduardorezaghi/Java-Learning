
public class BPCommissionEmployee
{
   private CommissionEmployee employee;
   private double baseSalary; // base salary per week

   public BPCommissionEmployee(CommissionEmployee employee, double baseSalary)
   {
      this.employee = employee;                 

      if (baseSalary < 0.0)                   
         throw new IllegalArgumentException("Base salary must be >= 0.0");  
      this.baseSalary = baseSalary;
   }
   
   public void setBaseSalary(double baseSalary)
   {
      if (baseSalary < 0.0) 
         throw new IllegalArgumentException("Base salary must be >= 0.0");  
      this.baseSalary = baseSalary;                
   } 

   public double getBaseSalary()
   {
      return baseSalary;
   }

   public String toString()
   {
       return String.format("%s\n%s %.2f ", employee, 
               "Base Salary:", getBaseSalary());
   }
} // end class BasePlusCommissionEmployee