// Exercício 29
// Sequência de Fibonacci em Java
public class Fibonacci {
    public static void fibonacci(double n){
        double iTerm = 0;
        double jTerm = 1;
        for (int i = 0; i < n; i++){
            System.out.printf("%.2f, ",iTerm);
            double nextTerm = iTerm + jTerm;
            iTerm = jTerm;
            jTerm = nextTerm;
        }  
    }
    public static void main(String[] args) {
        fibonacci(10);
    }
}
