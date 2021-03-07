// Exercício 2.3 do capítulo 2 do livro "Java Como Programar"

import java.util.Scanner;

public class Program1
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); 
        
        int c, thisIsAVariable, q76354, number=0, value;
        
        System.out.print("Digite um numero inteiro: ");
        value  = input.nextInt();

        System.out.println("This is a Java program!");

        System.out.printf("%s%n%s%n", "This is a Java","program!");
        if (number != 7) 
        {
            System.out.println("The variable number is not equal to 7");
        }
    }
}