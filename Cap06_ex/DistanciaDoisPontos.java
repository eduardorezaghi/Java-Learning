import java.util.Scanner;

public class DistanciaDoisPontos 
{
    public static double distanciaEntreDoisPontos(double x1,double y1, double x2,double y2)
    {   //          √((x2 - x1)2 + (y2 - y1)2
        return Math.sqrt( (Math.pow( (x2-x1),2)) + (Math.pow((y2-y1),2)) );
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        double x1,x2,y1,y2;
        
        System.out.print("Insira os pontos (x1, y1, x2, y2), separados por espaço: ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();

        System.out.printf("Distância entre os dois pontos x(%.2f,%.2f) e y(%.2f,%.2f) = %04.2f",
        x1,x2,y1,y2,distanciaEntreDoisPontos(x1,y1,x2,y2));
        scan.close();
    }
}
