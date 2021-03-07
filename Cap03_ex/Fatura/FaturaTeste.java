// FaturaTeste.java
// Programa para testar as capacidades da classe Fatura

import java.util.Scanner;

public class FaturaTeste
{
    public static void main(String[] args) 
    {
        Fatura fatura01 = new Fatura("001", "Fatura de numero 001", 10, 2.25);
        Fatura fatura02 = new Fatura();
        Scanner scan = new Scanner(System.in);

        System.out.println("A fatura " + fatura01.getNumFatura() + " tem " + fatura01.getQntItem() + " itens.");

        System.out.print("Digite um numero de fatura: ");
        fatura02.setNumFatura( scan.next() );

        System.out.println();
        
        System.out.print("Digite uma descricao para a fatura: ");
        fatura02.setDescFatura( "Fatura de Numero 002" );

        System.out.println();

        System.out.print("Digite a qnt de itens na fatura: ");
        fatura02.setQntItem( scan.nextInt() );

        System.out.println();

        System.out.print("Digite o preco dos itens na fatura: ");
        fatura02.setPrcItem( scan.nextDouble() );

        System.out.printf("%s %s: %.2f%n","Valor total da fatura",fatura01.getNumFatura(),fatura01.getFaturaValor(fatura01.qntItem,fatura01.prcItem));
        System.out.printf("%s %s: %.2f%n","Valor total da fatura",fatura02.getNumFatura(),fatura02.getFaturaValor(fatura02.qntItem,fatura02.prcItem));

    }
}