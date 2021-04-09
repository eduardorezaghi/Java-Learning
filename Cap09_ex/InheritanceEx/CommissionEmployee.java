// Exercício 9.14 - Hierarquia Employee
// Classe Employee -> CommissionEmployee - subclasse direta de Employee

public class CommissionEmployee extends Employee
{    
   private double grossSales; 
   private double commissionRate;
                                     
   public CommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, 
      double grossSales, 
      double commissionRate)
   {                
      super(firstName, lastName, socialSecurityNumber);                                                  
      if (grossSales < 0.0) 
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } 


   public void setGrossSales(double grossSales)
   {
      if (grossSales < 0.0) 
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

      this.grossSales = grossSales;
   } 

   public double getGrossSales()
   {
      return grossSales;
   } 

   public void setCommissionRate(double commissionRate)
   {
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.commissionRate = commissionRate;
   } 

   public double getCommissionRate()
   {
      return commissionRate;
   } 
               
   public double earnings()              
   {                                     
      return commissionRate * grossSales;
   } 
     
   @Override
   public String toString()                                             
   {                                                                    
      return String.format("%s%s: %.2f%n%s: %.2f",    
         super.toString(),              
         "gross sales", grossSales,                                     
         "commission rate", commissionRate);                           
   } 
}
