import java.util.Scanner;

public class MaiorNum
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int number = 0;
        int largest = -999;

        while(counter <= 10)
        {
            System.out.print("Insira um número: ");
            number = input.nextInt();
            if (largest >= number);
            else
                largest = number;
            System.out.printf("O maior número até agora = %d%n",largest);
            counter++;
        }
    }
}