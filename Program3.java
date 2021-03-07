// 2.14 Escreva um aplicativo que exiba os números 1 a 4 na mesma linha, com cada par de adjacentes separados por um espaço. Use as seguintes
// técnicas:
// a) Uma instrução System.out.println .
// b) Quatro instruções System.out.print.
// c) Uma instrução System.out.printf.

// 2.15 (Aritmética) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e imprima sua soma, produto,
// diferença e quociente (divisão). Utilize as técnicas mostradas na Figura 2.7.

// 2.16 (Comparando inteiros) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e exiba o número
// maior seguido pelas palavras “is larger". Se os números forem iguais, imprima a mensagem “These numbers are equal". Utilize
// as técnicas mostradas na Figura 2.15.

// 2.17 (Aritmética, menor e maior) Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto e os
// números menores e maiores. Utilize as técnicas mostradas na Figura 2.15. [Observação: o cálculo da média neste exercício deve resultar
// em uma representação de inteiro. Assim, se a soma dos valores for 7, a média deverá ser 2, não 2,3333...]

import java.util.Scanner;

public class Program3
{
    public static void main(String[] args) 
    {
        System.out.println("1 2 3 4");
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4\n");
        System.out.printf("%s %s %s %s%n",1,2,3,4);

        Scanner input = new Scanner(System.in);

        int value1, value2;
        
        System.out.print("Digite um 1º numero inteiro: ");
        value1  = input.nextInt();

        System.out.print("Digite um 2º numero inteiro: ");
        value2  = input.nextInt();

        System.out.printf("%s: %s%n%s: %s%n%s: %s%n","Soma",(value1+value2),"Média",((value1+value2)/2),"Produto",(value1*value2));
        if (value1 > value2)
        {
            System.out.printf("%s %s%n",value1," é o valor maior");
            System.out.printf("%s %s%n",value2," é o valor menor ou igual");
        }
        else if (value1 < value2)
        {
            System.out.printf("%s %s%n",value2," é o valor maior");
            System.out.printf("%s %s%n",value1," é o valor menor");
        }
        else {
            System.out.println("Os valores são iguais");
        }
        
        input.close();
    }
}