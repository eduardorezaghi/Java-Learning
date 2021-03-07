// 2.14 Escreva um aplicativo que exiba os n�meros 1 a 4 na mesma linha, com cada par de adjacentes separados por um espa�o. Use as seguintes
// t�cnicas:
// a) Uma instru��o System.out.println .
// b) Quatro instru��es System.out.print.
// c) Uma instru��o System.out.printf.

// 2.15 (Aritm�tica) Escreva um aplicativo que solicite ao usu�rio inserir dois inteiros, obtenha dele esses n�meros e imprima sua soma, produto,
// diferen�a e quociente (divis�o). Utilize as t�cnicas mostradas na Figura 2.7.

// 2.16 (Comparando inteiros) Escreva um aplicativo que solicite ao usu�rio inserir dois inteiros, obtenha dele esses n�meros e exiba o n�mero
// maior seguido pelas palavras �is larger". Se os n�meros forem iguais, imprima a mensagem �These numbers are equal". Utilize
// as t�cnicas mostradas na Figura 2.15.

// 2.17 (Aritm�tica, menor e maior) Escreva um aplicativo que insira tr�s inteiros digitados pelo usu�rio e exiba a soma, m�dia, produto e os
// n�meros menores e maiores. Utilize as t�cnicas mostradas na Figura 2.15. [Observa��o: o c�lculo da m�dia neste exerc�cio deve resultar
// em uma representa��o de inteiro. Assim, se a soma dos valores for 7, a m�dia dever� ser 2, n�o 2,3333...]

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
        
        System.out.print("Digite um 1� numero inteiro: ");
        value1  = input.nextInt();

        System.out.print("Digite um 2� numero inteiro: ");
        value2  = input.nextInt();

        System.out.printf("%s: %s%n%s: %s%n%s: %s%n","Soma",(value1+value2),"M�dia",((value1+value2)/2),"Produto",(value1*value2));
        if (value1 > value2)
        {
            System.out.printf("%s %s%n",value1," � o valor maior");
            System.out.printf("%s %s%n",value2," � o valor menor ou igual");
        }
        else if (value1 < value2)
        {
            System.out.printf("%s %s%n",value2," � o valor maior");
            System.out.printf("%s %s%n",value1," � o valor menor");
        }
        else {
            System.out.println("Os valores s�o iguais");
        }
        
        input.close();
    }
}