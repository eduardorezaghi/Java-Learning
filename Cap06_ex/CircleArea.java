import java.util.Scanner;

public class CircleArea {
    static double circleAreaCalc(double raio)
    {
        return (Math.PI * Math.pow(raio, 2.0));
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Insira o raio: ");
        double raio = scan.nextDouble();
        
        System.out.printf("%s%.2f%n","Área do círculo = ",CircleArea.circleAreaCalc(raio));
        scan.close();
    }
}
