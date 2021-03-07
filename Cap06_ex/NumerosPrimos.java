import java.util.Scanner;

public class NumerosPrimos 
{
    public static boolean isPrime(long number)
    {
        if (number <= 1) 
            return false;
        for (int i = 2; i < (number/2); i++)
        {
            if (number % i == 0)
                return false;
        }
        return true;
    }
    public static boolean isPrimeSquareRoot(long number)
    {
        if (number <= 1) 
            return false;
        for (int i = 2; i < Math.sqrt((double) number); i++)
        {
            if (number % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        long number;
        
        System.out.print("Insira um número: ");
        number = scan.nextLong();

        System.out.println(number + " é primo?");
        System.out.printf("Teste de primalidade com método number/2 = %b%n",isPrime(number));
        System.out.printf("Teste de primalidade com método da raiz quadrada = %b%n",isPrimeSquareRoot(number));
        scan.close();
    }
}
