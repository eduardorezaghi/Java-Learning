// Escreva declara��es, instru��es ou coment�rios que realizem cada uma das tarefas a seguir:
// a) Declare que um programa calcular� o produto de tr�s inteiros.
// b) Crie um Scanner chamado input que leia valores a partir da entrada padr�o.
// c) Declare as vari�veis x, y, z e result como tipo int.
// d) Solicite que o usu�rio insira o primeiro inteiro.
// e) Leia o primeiro inteiro digitado pelo usu�rio e armazene-o na vari�vel x .
// f) Solicite que o usu�rio insira o segundo inteiro.
// g) Leia o segundo inteiro digitado pelo usu�rio e armazene-o na vari�vel y.
// h) Solicite que o usu�rio insira o terceiro inteiro.
// i) Leia o terceiro inteiro digitado pelo usu�rio e armazene-o na vari�vel z.
// j) Compute o produto dos tr�s inteiros contidos nas vari�veis x, y e z e atribua o resultado � vari�vel result.
// k) Use System.out.printf para exibir a mensagem �Product is� seguida pelo valor da vari�vel result.


// Esse programa calcula o produto de tr�s inteiros.

import java.util.Scanner;

public class Program2
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int x, y, z, result;

        System.out.print("Insira o primeiro inteiro: ");
        x = input.nextInt();

        System.out.print("Insira o segundo inteiro: ");
        y = input.nextInt();

        System.out.print("Insira o terceiro inteiro: ");
        z = input.nextInt();

        result = x*y*z;
        System.out.printf("%s%s%n","O Produto �: ",result);
    }
}
