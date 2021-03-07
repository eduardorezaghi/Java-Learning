import java.security.SecureRandom;

public class IntervaloNumeros 
{
    public static void main(String[] args) 
    {
    //int number = valorDeDeslocamento + randomNumbers.nextInt(fatorDeEscalonamento);

        SecureRandom rndGen = new SecureRandom();
        int rndInteiro1 = 1 + rndGen.nextInt(2);
        int rndInteiro2 = 1 + rndGen.nextInt(100);
        int rndInteiro3 = rndGen.nextInt(9);
        int rndInteiro4 = 1000 + rndGen.nextInt(13);
        int rndInteiro5 = -1 + rndGen.nextInt(2);
        int rndInteiro6 = -3 + rndGen.nextInt(11);

        System.out.println("rndInteiro1 = " + rndInteiro1 );
        System.out.println("rndInteiro2 = " + rndInteiro2 );
        System.out.println("rndInteiro3 = " + rndInteiro3 );
        System.out.println("rndInteiro4 = " + rndInteiro4 );
        System.out.println("rndInteiro5 = " + rndInteiro5 );
        System.out.println("rndInteiro6 = " + rndInteiro6 );
    }
}
