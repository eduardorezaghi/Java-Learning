import java.util.Scanner;

public class DigitSeparator {
    public static int divisaoInteira(int a, int b)
    {
        return (int) a/b;
    }
    
    public static int divisaoResto(int a, int b)
    {
        return a % b;
    }

    public static void displayDigits(int numero)
    {
        int digito1 = divisaoResto(numero, 10) ; // unidade
        int digito2 = divisaoInteira( divisaoResto(numero, 100), 10) ; // dezena
        int digito3 = divisaoInteira( divisaoResto(numero, 1000), 100); // centena
        int digito4 = divisaoInteira( divisaoResto(numero, 10000), 1000); // milhar
        int digito5 = divisaoInteira( numero, 10000); // dezena de milhar

        System.out.printf("Os dígitos são    %d    %d    %d    %d    %d",
                                digito5, digito4, digito3, digito2, digito1);
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        

        scan.close();
    }
}