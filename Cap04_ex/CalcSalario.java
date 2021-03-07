import java.util.Scanner;

public class CalcSalario {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int qntEmpregados = 0;
        int numHoras = 0;
        int horasTrab = 0;
        double salarioBruto = 0.0;
        double salarioHora = 0.0;
        int counter = 1;

        System.out.print("Insira a qntd. de empregados: ");
        qntEmpregados = scan.nextInt();

        while ( counter <= qntEmpregados )
        {
            System.out.printf("Insira o num. horas. trabalhadas do  %dº empregado: ", counter);
            numHoras = scan.nextInt();
            System.out.printf("Insira o sal./hora do  %dº empregado: ", counter);
            salarioHora = scan.nextDouble();
            salarioBruto = salarioHora * 40 + ((horasTrab - 40) * 0.5);
            System.out.printf("O salário do %dº empregado é: $%.2f%n",counter,salarioBruto);
            counter++;
        }
    }
}
