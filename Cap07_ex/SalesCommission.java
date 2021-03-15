import java.util.Arrays;

// Exercício 7.10
// Classe SalesComission.java
/*
(Comissões de vendas) Utilize um array unidimensional para resolver o seguinte problema: uma empresa paga seu pessoal de vendas por comissão. O pessoal de vendas recebe R$ 200 por semana mais 9% de suas vendas brutas durante essa semana. Por exemplo, um vendedor que vende R$ 5.000 brutos em uma semana recebe R$ 200 mais 9% de R$ 5.000 ou um total de R$ 650. Escreva um aplicativo (utilizando um array de contadores) que determina quanto o pessoal de  vendas ganhou em cada um dos seguintes intervalos (suponha que o salário de cada vendedor foi  truncado para uma quantia inteira):
a) $200–299
b) $300–399
c) $400–499
d) $500–599
e) $600–699
f) $700–799
g) $800–899
h) $900–999
i) R$ 1.000 e acima
Resuma os resultados em formato tabular.

*/

public class SalesCommission {
    private static double[] sales = new double[5];
    private static double[] comission = new double[5];
    private static int[] comsRange = new int[12];

    public static void displayHeader(int num)
    {
        switch (num) {
        case 2:
            System.out.printf("$200-299        ");
            break;
        case 3:
            System.out.printf("$300-399        ");
            break;
        case 4:
            System.out.printf("$400-499        ");
            break;
        case 5:
            System.out.printf("$500-599        ");
            break;
        case 6:
            System.out.printf("$600-699        ");
            break;
        case 7:
            System.out.printf("$700-799        ");
            break;
        case 8:
            System.out.printf("$800-899        ");
            break;
        case 9:
            System.out.printf("$800-899        ");
            break;
        default:
            System.out.printf("$1,000 and over ");
        }
    }
    public static void main(String[] args) 
    {
        sales[0] = 1500.00;
        sales[1] = 1800.00;
        sales[2] = 3500.00;
        sales[3] = 7500.00;
        sales[4] = 10767.65;

        System.out.println(Arrays.toString(sales));

        for (int i = 0; i < sales.length; i++)
            comission[i] = Math.ceil(200 + ( 0.09 * sales[i]));
        
        System.out.println(Arrays.toString(comission));
     
        for (double sale : comission)
            ++comsRange[(int) Math.round(sale) / 100];
        
        // Displays results
        System.out.printf("%-15s No. of Salesman earned", "Range");
        System.out.println();
        for (int i = 2; i < comsRange.length; i++)
        {
            displayHeader(i);
            System.out.printf("%d%n", comsRange[i]);
        }
        
        
    }
    
}
