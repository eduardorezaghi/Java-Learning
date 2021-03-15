// Exercício 7.8 e 7.9
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays2 
{
    private static Random rndGen = new Random(); // gerador de número aleatório
    private static int[]    f = new int[7];
    private static int[]    g = new int[5];
    private static double[] c = new double[100];
    private static int[]    a = new int[11];
    private static int[]    b = new int[34];
    private static double[] w = new double[99];
    private static int[][]  t = { {3,6,8}, {6,12,16} };

    public static void displayDoubleArray(double[] array)
    {
        for (double value : array)
            System.out.printf("%.2f ", value);
        System.out.println();
    }
    public static void displayMultiArray(int[][] array)
    {
        for (int column = 0; column < array.length; column++)
        {
            for (int  element : array[column]) 
                System.out.printf("%d   ",element);
        System.out.println();
        }
    }
    public static void tabularListing(int array[][]) 
    {
        for (int columns = 0; columns < array[0].length; columns++) 
            System.out.printf("    %d",columns);
        System.out.println();

        for (int line = 0; line < array.length; line++) 
        {
            System.out.printf("%d    ", line);
            for (int element : array[line]) 
                System.out.printf("%d    ", element);
            System.out.println();
        }
    }

    private static void basicArrays()
    {
        System.out.println("Array f[] = " + Arrays.toString(f));
        System.out.printf("f[6] = %d%n",f[6]);
        
        Arrays.fill(g, 8);
        System.out.println("Array g[] = " + Arrays.toString(g));

        
        for (int i = 0; i < w.length; i++)
            c[i] = rndGen.nextDouble();
        double total = 0.0;
        for (int i = 0; i < c.length; i++)
            total += c[i];
        System.out.println("Array c total = " + total);


        for (int i = 0; i < a.length; i++)
            a[i] = 1 + rndGen.nextInt(10);
        System.out.println("Array a[] = " + Arrays.toString(a));
        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println("Array b[] = " + Arrays.toString(b));


        System.out.println();


        for (int i = 0; i < w.length; i++)
            w[i] = rndGen.nextDouble();
        displayDoubleArray(w);
        double minimum = w[0], maximum = w[w.length-1];
        for (double number : w) 
            if (number < minimum) minimum = number;
        for (double number : w)
            if (number > maximum) maximum = number;
        System.out.printf("w[] minimum = %.2f%nw[] maximum = %.2f%n",minimum,maximum);
    }
    private static void multiArrays() 
    {
        displayMultiArray(t);

        t[0][1] = 12;

        t[0][0] = 0;
        t[0][1] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;

        for (int i = 0; i < t.length; i++) 
            for (int j = 0; j < t[0].length; j++) 
                t[i][j] = 0;
        
        displayMultiArray(t);
            
        System.out.println("Insira os itens de uma matriz: ");
        for (int i = 0; i < t.length; i++)
        {
            Scanner scan = new Scanner(System.in); 
            for (int j = 0; j < t[0].length; j++)
            {
                System.out.printf("Insira o elemento t[%d][%d]: ",i,j);
                t[i][j] = scan.nextInt();
            } 
        }
        System.out.println("Depois da inserção: ");
        displayMultiArray(t);

        int lowestNumber = t[0][0];
        for (int linha = 0; linha < t.length; linha++) 
            for (int element : t[linha]) 
            {
                if (element < lowestNumber)
                    lowestNumber = element;
            }
        
        int maximumNumber = t[t.length-1][t[t.length-1].length-1];
        for (int linha = 0; linha < t.length; linha++) 
            for (int element : t[linha]) 
            {
                if (element > maximumNumber)
                    maximumNumber = element;
            }
        
        System.out.printf("Menor número = %d%nMaior número = %d%n",lowestNumber,maximumNumber);
        
        for (int colunas = 0; colunas < t[0].length; colunas++) 
            System.out.printf("t[0][%d] = %d%n",colunas,t[0][colunas]);
        
        System.out.printf("t[0][2] + t[1][2] = %d%n", (t[0][2] + t[1][2]) );

        tabularListing(t);

    }
    

    public static void main(String[] args) 
    {
        /* 
        7.8
        Escreva instruções Java para realizar cada uma das seguintes tarefas:
        a) Exiba o valor do elemento 6 do array f.
        b) Inicialize cada um dos cinco elementos de array de inteiros unidimensional g como 8.
        c) Some os 100 elementos do array de ponto flutuante c.
        d) Copie o array a de 11 elementos para a primeira parte de array b, que contém 34 elementos.
        e) Determine e exiba os maiores e menores valores contidos no array de ponto flutuante w de 99 elementos.
        */
        // basicArrays();

        /*
        7.9
        Considere um array de inteiros dois por três t.
        a) Escreva uma instrução que declara e cria t. R: private static int[][] t  = new int[2][3];
        b) Quantas linhas tem t?    R: 2 linhas.
        c) Quantas colunas tem t?   R: 3 colunas.
        d) Quantos elementos tem t?     R: 2x3 = 6 elementos.
        e) Escreva expressões de acesso para todos os elementos na linha 1 de t.
        f) Escreva expressões de acesso para todos os elementos na coluna 2 de t.
        g) Escreva uma única instrução que configura o elemento de t na linha 0 e na coluna 1 como zero.
        h) Escreva instruções individuais para inicializar cada elemento de t para zero.
        i) Escreva uma instrução for aninhada que inicializa cada elemento de t como zero.
        j) Escreva uma instrução for aninhada que insere os valores para os elementos de t a partir do usuário.
        k) Escreva uma série de instruções que determina e exibe o valor menor em t.
        l) Escreva uma única instrução printf que exibe os elementos da primeira linha de t.
        m) Escreva uma instrução que soma os elementos da terceira coluna de t. Não utilize repetição.
        n) Escreva uma série de instruções que exibe o conteúdo de t no formato tabular. Liste os índices de coluna como títulos na parte superior e liste os índices de linha à esquerda de cada linha.
        */
        multiArrays();

    }
}
