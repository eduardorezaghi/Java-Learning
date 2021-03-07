import java.util.Scanner;

public class AnySquare 
{
    private static void squareOfAnything(int side, char fillCharacter)
    {
        for(int i = 1; i<= side; i++)
        {                
            for(int j = 1; j<= side; j++)
            {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        char fill = input.next().charAt(0);
        squareOfAnything(2, fill);
        input.close();
    }
}
