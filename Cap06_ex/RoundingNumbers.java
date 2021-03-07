import java.util.Scanner;

public class RoundingNumbers {
    public static int roundParaInteiro(double number)
    {
        return (int) Math.floor( (number + 0.5) );
    }
    public static double roundParaDecimos(double number)
    {
        return Math.floor( (number*10+0.5)) / 10 ;
    }
    public static double roundParaCentesimos(double number) 
    {
        return Math.floor( number*100+0.5 ) / 100;
    }
    public static double roundParaMilesimos(double number) 
    {
        return Math.floor( (number*1000+0.5) ) / 1000;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number;
        System.out.print("Insira um numero real: ");
        number = scan.nextDouble();

        System.out.printf("Valor original = %f\t Numero arredondado para inteiro = %d%n",number,roundParaInteiro(number));
        System.out.printf("Valor original = %f\t Numero arredondado para a 1a casa decimal = %.1f%n",number, roundParaDecimos(number));
        System.out.printf("Valor original = %f\t Numero arredondado para a 2a casa decimal = %.2f%n",number, roundParaCentesimos(number));
        System.out.printf("Valor original = %f\t Numero arredondado para a 3a casa decimal = %.3f%n",number, roundParaMilesimos(number));
        scan.close();
    }
}
