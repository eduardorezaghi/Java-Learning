import java.util.Scanner;

public class RoundNumber
{
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        double number;

        System.out.print("Insira um valor para arrendondar: ");
        number = scan.nextDouble();

        System.out.printf("Numero original: %.3f%nNumero arredondado: %.2f%n",number,Math.floor( (double) number + 0.5 ));
        scan.close();
    }
}