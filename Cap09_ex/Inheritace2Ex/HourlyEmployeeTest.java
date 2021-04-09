// Exercício 9.14 - Hierarquia Employee
// Teste para HourlyEmployee.

public class HourlyEmployeeTest {
   public static void main(String[] args) 
   {
      HourlyEmployee empregado = new HourlyEmployee("John", "Smith", "555-666", 1000.00, 5.0);
      
      System.out.println(
         "Informação do empregado obtida por métodos get():");
      System.out.printf("%n%s %s%n", "Primeiro nome é",
         empregado.getFirstName());
      System.out.printf("%s %s%n", "Último nome é", 
         empregado.getLastName());
      System.out.printf("%s %s%n", "Num. de Segurança Social é", 
         empregado.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Salário é", 
         empregado.getSalario());
      System.out.printf("%s %.2f%n", "Horas trabalhadas é",
         empregado.getHoras());

      empregado.setSalario(5000.00); 
      empregado.setHoras(168); 
      
      System.out.printf("%n%s:%n%n%s%n",                                
         "Informação do empregado atualizada obtida por toString()", empregado);
   }
}
