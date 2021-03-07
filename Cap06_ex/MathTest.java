import java.security.SecureRandom;

public class MathTest
{
	public static double sphereVolume(double raio)
	{
		return (4.0/3.0) * Math.PI * Math.pow(raio,3);
	}

	public static void main(String args[])
	{
		java.util.Scanner scan = new java.util.Scanner(System.in);
		SecureRandom rndGen = new SecureRandom();

		System.out.println("Minimo entre dois numeros reais aleatorios = " + Math.min(rndGen.nextInt(1025), rndGen.nextInt(1025)) );
		System.out.printf("Potencia entre dois numeros reais aleatorios = %.2f%n",Math.pow(rndGen.nextDouble(),rndGen.nextDouble()) );
		System.out.printf("Seno (rad) de x (aleatorio) = %.2f%n",Math.sin(rndGen.nextDouble()) );
		System.out.printf("Raiz quadrada de x (aleatorio) = %.2f%n",Math.sqrt(rndGen.nextDouble()) );
		System.out.printf("Tangente (rad) de x (aleatorio) = %.2f%n",Math.tan(rndGen.nextDouble()) );
		
		System.out.print("Insira o raio da esfera: ");
		int raio = scan.nextInt();
		double volume = MathTest.sphereVolume(raio);
		System.out.printf("Volume da esfera = %.3f", volume);
		scan.close();
	}
}