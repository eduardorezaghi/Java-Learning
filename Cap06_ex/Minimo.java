import java.util.Scanner;

public class Minimo {
    public static double minimum3(double x, double y, double z)
    {
        return Math.min(x, Math.min(y, z));
    }
    public static void main(String[] args)
    {
        double n1,n2,n3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira três numeros reais para comparação: ");
        n1 = scan.nextDouble();
        n2 = scan.nextDouble();
        n3 = scan.nextDouble();

        System.out.printf("O menor entre eles é     %.2f", minimum3(n1, n2, n3));

        scan.close();
    }
}
