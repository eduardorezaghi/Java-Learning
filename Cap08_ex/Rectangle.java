/*
(Classe Rectangle) Crie uma classe Rectangle com os atributos length e width, cada um dos quais assume o padrão de 1. Forneça os métodos que calculam o perímetro e a área do retângulo. A classe tem métodos set e get para o comprimento (length) e a largura (width). Os métodos set devem verificar se length e width são, cada um, números de ponto flutuante maiores que 0,0 e menores que 20,0. Escreva um programa para testar a classe Rectangle.
*/
public class Rectangle{
    private double altura = 1.0;
    private double largura = 1.0;

    public Rectangle(double altura, double largura){
        if ((altura <= 0.0 || altura >= 20.0) && (largura <= 0.0 || largura >= 20.0))
            throw new IllegalArgumentException("Valores do construtor maiores que o permitido");
        this.altura = altura;
        this.largura = largura;
    }

    public void setAltura(double altura){
        if (altura <= 0.0 || altura >= 20.0)
            throw new IllegalArgumentException("Valor da altura maior que o permitido");
        this.altura = altura;
    }
    public void setLargura(double largura){
        if (largura <= 0.0 || largura >= 20.0)
            throw new IllegalArgumentException("Valor da largura maior que o permitido");
        this.largura = largura;
    }
    public double getAltura(){
        return altura;
    }
    public double getLargura(){
        return largura;
    }

    public double perimetro(){
        return altura*2 + largura*2;
    }
    public double area(){
        return altura * largura;
    }
}

class RectangleTest{
    public static void main(String[] args) {
        Rectangle ret1 = new Rectangle(10.0, 2.0);
        Rectangle ret2 = new Rectangle(15.453534536, Math.E);
        try {
            Rectangle ret3 = new Rectangle(20.0, 30.0);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.printf("Valor do perimetro de ret1 = %.3f%n",ret1.perimetro());
        System.out.printf("Valor do perimetro de ret2 = %.3f%n",ret2.perimetro());
        System.out.printf("Valor da area de ret1 = %.3f%n",ret1.area());
        System.out.printf("Valor da area de ret2 = %.3f%n",ret2.area());
        try {
            ret1.setAltura(20.0);
            ret1.setLargura(20.0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}