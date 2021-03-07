import java.util.Scanner;

public class ParkingFee
{
    public static double calculateCharges(int horas)
    {
        double tarifa;
        if (horas <= 3)
                return 2.00;
        else
           tarifa  = 2.00 + (horas * 0.5);
            if (tarifa > 10)
                    return 10.00;
            else return tarifa;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int horas = 0;
        double cobranca = 0.0, recibo = 0.0;
        
        System.out.print("Insira o nº de horas estacionadas: ");
        horas = scan.nextInt();

        cobranca = ParkingFee.calculateCharges(horas);
        recibo += cobranca;

        System.out.printf("Valor da tarifa: %.2f%n",cobranca);
        System.out.printf("Valor do recibo: %.2f%n",recibo);
        scan.close();
    }
}
