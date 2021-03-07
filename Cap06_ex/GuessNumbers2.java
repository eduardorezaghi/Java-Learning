import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumbers2
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        SecureRandom rndGen = new SecureRandom();
        int number,guess,guesses=0;
        
        number = 1 + rndGen.nextInt(1000);

        System.out.print("Guess the number: ");
        guess  = scan.nextInt();

        while (guess != -1)
        {
            while(guess != number)
            {
                if (guess < number )
                {
                    System.out.printf("Too low. Try again. This is your %dst guess.%n",++guesses);
                    guess  = scan.nextInt();
                }
                else if (guess > number )
                {
                    System.out.printf("Too high. Try again. This is your %dst guess.%n",++guesses);
                    guess  = scan.nextInt();
                }
            }
            if (guesses <= 10)
                System.out.printf("Either you know the secret or you are lucky! (%d guesses)%n", guesses);
            
            if (guesses == 10)
                System.out.printf("Aha! You know the secret! (%d guesses)%n", guesses);
            
            else System.out.printf("You should be able to do better! (%d guesses)%n", guesses);

            System.out.printf("Congratulations! You guessed the number in %d guesses!%n", guesses);
            System.out.println("Guess another number or -1 to exit.");
            number = 1 + rndGen.nextInt(1000);
            guess = scan.nextInt();   
        }
        scan.close();
    }
}
