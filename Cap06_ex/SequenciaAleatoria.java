import java.security.SecureRandom;

public class SequenciaAleatoria 
{
    public static void main(String[] args) 
    {
        // int number = valorDeDeslocamento + diferençaEntreValores * randomNumbers.nextInt(fatorDeEscalonamento);
        SecureRandom rndGen = new SecureRandom();
        int sequenciaAleatoria1 = 2 + 2 * rndGen.nextInt(4);
        int sequenciaAleatoria2 = 3 + 2 * rndGen.nextInt(4);
        int sequenciaAleatoria3 = 6 + 4 * rndGen.nextInt(4);

        System.out.println("sequenciaAleatoria1 = " + sequenciaAleatoria1 );
        System.out.println("sequenciaAleatoria2 = " + sequenciaAleatoria2 );
        System.out.println("sequenciaAleatoria3 = " + sequenciaAleatoria3 );
    }
}
