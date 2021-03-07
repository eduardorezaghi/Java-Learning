import java.util.Scanner;

public class ConversaoTemperatura {
    private static double fahrenheit(double celsius)
    {
        return  9.0 / 5.0 * celsius + 32;
    }
    private static double celsius(double fahrenheit)
    {
        return 5.0 / 9.0 * (fahrenheit-32);
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira uma temperatura em Celsius: ");
        double temperatura = scan.nextDouble();
        System.out.printf("Temperatura Celsius em Fahrenheit: %.2f°F%n",fahrenheit(temperatura));

        System.out.print("Agora insira uma temperatura em Fahrenheit: ");
        temperatura = scan.nextDouble();
        System.out.printf("Temperatura Fahrenheit em Celsius: %.2f°C%n",celsius(temperatura));

        scan.close();
    }
}