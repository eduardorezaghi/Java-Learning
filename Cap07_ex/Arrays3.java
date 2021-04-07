// Exercício 7.11
import java.security.SecureRandom;
import java.util.Arrays;
public class Arrays3 
{
    public static int[] generateIntArray(int length)
    {
        int[] array = new int[length];
        SecureRandom rng = new SecureRandom();
        for (int i = 0; i < array.length; i++) 
            array[i] = 1 + rng.nextInt(20);
        return array;
    }

    public static void main(String[] args) 
    {
        int[] counts = new int[10];
        int[] bonus = generateIntArray(15);
        int[] bestScores = generateIntArray(5);

        for (int i = 0; i < counts.length; i++) 
            counts[i] = 0;
        System.out.println(Arrays.toString(counts));

        System.out.println(Arrays.toString(bonus));
        for (int i = 0; i < bonus.length; i++) 
            bonus[i] += 1;
        System.out.println(Arrays.toString(bonus));

        System.out.println("Valores armazenados em bestScores: ");
        for (int i = 0; i < bestScores.length; i++) {
            System.out.printf("bestScores[%d] = %5d%n",i,bestScores[i]);
        }
        
    }    
}
