public class TriangleHypo 
{
    private static double hypotenuse(double side1,double  side2)
    {
        double hypotenuse;
        hypotenuse = Math.sqrt( (Math.pow(side1, 2) + Math.pow(side2, 2)) );
        return hypotenuse;
    }
    public static void main(String[] args) 
    {
        System.out.printf("Hipotenusa de um triângulo 3 e 4 = %.2f%n",hypotenuse(3.0, 4.0));
        System.out.printf("Com o método Math.hypot = %.2f%n",Math.hypot(3.0, 4.0));
        System.out.printf("Hipotenusa de um triângulo 5 e 12 = %.2f%n",hypotenuse(5.0, 12.0));
        System.out.printf("Com o método Math.hypot = %.2f%n",Math.hypot(5.0, 12.0));
        System.out.printf("Hipotenusa de um triângulo 3 e 4 = %.2f%n",hypotenuse(8.0, 15.0));
        System.out.printf("Com o método Math.hypot = %.2f%n",Math.hypot(8.0, 15.0));
    }
}
