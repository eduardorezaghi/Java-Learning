import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumbers
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        SecureRandom rndGen = new SecureRandom();
        int number,guess;
        
        number = 1 + rndGen.nextInt(1000);

        System.out.print("Guess the number: ");
        guess  = scan.nextInt();

        while (guess != -1)
        {
            while(guess != number)
            {
                if (guess < number )
                {
                    System.out.println("Too low. Try again.");
                    guess  = scan.nextInt();
                }
                else if (guess > number )
                {
                    System.out.println("Too high. Try again.");
                    guess  = scan.nextInt();
                }
            }
            System.out.println("Congratulations! You guessed the number!");
            System.out.println("Guess another number or -1 to exit.");
            number = 1 + rndGen.nextInt(1000);
            guess = scan.nextInt();   
        }
        scan.close();   
    }
}
