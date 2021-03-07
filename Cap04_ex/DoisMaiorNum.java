import java.util.Scanner;

public class DoisMaiorNum
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int number = 0;
        int largest = -998;
        int scndLargest = -999;

        while(counter <= 10)
        {
            System.out.print("Insira um número: ");
            number = input.nextInt();

            if (largest >= number);
            else{
                scndLargest = largest;
                largest = number;
            } 

            System.out.printf("O maior número até agora = %d%n",largest);
            System.out.printf("O segundo maior número até agora = %d%n",scndLargest);
            counter++;
        }
    }
}