import java.util.Scanner;

public class Potenciacao {
    private static int integerPower(int base,int exponent) 
    {
        int result = 1;
        for(int i = 1; i<=exponent; i++)
            result *= base;
        return result;
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Insira uma base e um expoente: ");
        int base = scan.nextInt();
        int exponent = scan.nextInt();
        System.out.printf("Potência de %d elevado a %d = %d%n",base,exponent,Potenciacao.integerPower(base, exponent));
        scan.close();
    }
}
