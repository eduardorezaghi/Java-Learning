/*
(Imprimindo o equivalente decimal de um número binário) Escreva um aplicativo que insere um número inteiro que contém so-
mente 0s e 1s (isto é, um número inteiro binário) e imprime seu equivalente decimal. [Dica: utilize os operadores de resto e divisão para
pegar os dígitos do número binário um de cada vez da direita para a esquerda. No sistema de números decimais, o dígito mais à direita
tem um valor posicional de 1 e o próximo dígito à esquerda um valor posicional de 10, depois 100, depois 1.000 e assim por diante. O
número decimal 234 pode ser interpretado como 4 * 1 + 3 * 10 + 2 * 100. No sistema de número binário, o dígito mais à direita tem um
valor posicional de 1, o próximo dígito à esquerda um valor posicional de 2, depois 4, depois 8 e assim por diante. O equivalente decimal
do binário 1.101 é 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 ou 1 + 0 + 4 + 8 ou 13.]

Entrada de Dados
    Inicializar binaryNumber como 0
    Inicializar decimalNumber como 0
    
Processamento
    Para cada algarismo do binaryNumber, realizar a conversão com base no valor posicional (2⁴ + 2³ + 2² + 2¹ + 2⁰) 
    e somando o valor decimal (10000+1000+100+10+1) para ter a conversão correta do número.
    Ex: 0100|0011|1001|0001
        0100 = 0+4+0+0 = 4
        0011 = 0+0+2+1 = 3
        1001 = 8+0+0+1 = 9
        0001 = 0+0+0+1 = 1
         4  |  3  |  9   |  1
    Salvar o resultado da conversão em decimalNumber.
*/
import java.util.Scanner;
public class BinarioDecimal {
    public static long toDecimal(long binary)
    {
        int decimalNumber = 0, bIndex = 0;;
        while( binary > 0)
        {
            decimalNumber += ((binary % 10) * Math.pow(2, bIndex));
            binary /= 10;
            bIndex++;
        }
        return decimalNumber;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long binaryNumber = 0; 

        System.out.print("Insira um número binário: ");
        binaryNumber =  Long.parseLong( scan.nextLine() );
       
        System.out.printf("Número decimal resultante: %d\n",toDecimal(binaryNumber));
    }
}
