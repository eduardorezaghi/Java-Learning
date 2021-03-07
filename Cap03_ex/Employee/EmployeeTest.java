public class EmployeeTest {
    public static void main(String[] args) {
        Employee empregado01 = new Employee("Jose", "Rodrigues", 2600.00);
        Employee empregado02 = new Employee("Janaia", "Moraes", 8650.50);

        System.out.printf("%s %s: $%.2f%n","Salario Mensal do","empregado01",empregado01.getSalarioMensal());
        System.out.printf("%s %s: $%.2f%n","Salario Mensal do","empregado02",empregado02.getSalarioMensal());
        System.out.println();

        empregado01.salarioMensal *= 1.10;
        empregado02.salarioMensal *= 1.10;

        System.out.printf("%s %s %s: $%.2f%n","Salario Mensal do","empregado01","depois do aumento",empregado01.getSalarioMensal());
        System.out.printf("%s %s %s: $%.2f%n","Salario Mensal do","empregado02","depois do aumento",empregado02.getSalarioMensal());
    }
}
