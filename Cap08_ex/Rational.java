public class Rational {
    private int numerador;
    private int denominador;
    
    public Rational(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    private void simplificar() {
    }

    public static Rational somar(){
        return new Rational()
    }
}
