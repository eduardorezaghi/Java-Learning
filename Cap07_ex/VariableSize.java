public class VariableSize 
{
    private static int product(int... numbers)
    {
        int result = 1;
        for (int i : numbers) 
            result *= i;
        return result;
    }
    public static void main(String[] args) {
        int x,y,z,w,h;
        
        x = 3; y = 4;
        System.out.printf("%s %d e %d = %2d%n",
        "Valor do produto de",x,y,product(x,y));
        
        x = 6; y = 12; z = 20;
        System.out.printf("%s %d, %d e %d = %,2d%n",
        "Valor do produto de",x,y,z,product(x,y,z));

        x = 12; y = 24; z = 40; w = 80; h = 120;
        System.out.printf("%s %d, %d, %d, %d e %d = %,2d%n",
        "Valor do produto de",x,y,z,w,h,product(x,y,z,w,h));
    }
}
