import java.util.Scanner;

public class ParOuImpar 
{
    private static final int FLAG = -1;
    private static boolean isEven(long x)
    {
        return (x%2==0)?true:false;
    }
    public static void main(String[] args) 
    {
        long number = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um numero ou -1 para sair: ");
        number = scan.nextLong();
        while(number != FLAG)        
        {
            if (isEven(number))
                System.out.println(number + " é par");
            else    
                System.out.println(number + " é impar");

            System.out.print("Insira outro numero ou -1 para sair: ");
            number = scan.nextLong();
        }
        scan.close();
    }   
}