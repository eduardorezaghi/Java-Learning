import java.util.Scanner;

public class ComissaoVendas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int itemVendido = 0;
        double salarioVendas = 0.0;
        double vendasBrutas = 0;

        System.out.print("Insira o código do item vendido ou -1 para sair: ");
        itemVendido = input.nextInt();

        while (itemVendido != -1)
        {
            if (itemVendido == 1)
                vendasBrutas += 239.99;
            else if (itemVendido == 2)
                vendasBrutas += 129.79;
            else if (itemVendido == 3)
                vendasBrutas += 99.95;
            else 
                vendasBrutas += 350.89;
            
            System.out.print("Insira o código do item vendido ou -1 para sair: ");
            itemVendido = input.nextInt();
        }

        if (vendasBrutas == 0) 
            System.out.println("Os dados foram inseridos incorretamente.");
        else 
        {
            salarioVendas = vendasBrutas + (200 + ( (0.09 * vendasBrutas) ) );
            System.out.printf("A comissão do vendedor é: %.2f",salarioVendas);
        }
        input.close();
    }
}
