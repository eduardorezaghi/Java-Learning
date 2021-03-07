import java.util.Scanner;

public class CalcConsumo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int viagens = 0;
        int quilometros = 0;
        int litros = 0;
        int contador = 1;
        int totalQuilom = 0;
        int totalGasol = 0;

        System.out.print("Insira a qntd. de viagens: ");
        viagens = scan.nextInt();

        while (contador <= viagens)
        {
            System.out.printf("Insira os kms. dirigidos na %dª viagem: ", contador);
            quilometros = scan.nextInt();
            System.out.printf("Insira o consumo de gasolina na %dª viagem: ", contador);
            litros = scan.nextInt();

            System.out.printf("Na %dª viagem, o consumo é: %.2f%n", contador, ( (double) quilometros/litros) );

            totalQuilom += quilometros;
            totalGasol += litros;
            contador++;
        }

        System.out.println("Quilometragem total: " + totalQuilom);
        System.out.println("Consumo total: " + totalGasol);
    }
}
