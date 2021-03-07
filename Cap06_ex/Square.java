public class Square {
    private static void squareOfAsterisks(int side)
    {
        for(int i = 1; i<= side; i++)
        {                
            for(int j = 1; j<= side; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        squareOfAsterisks(2);
    }
}
