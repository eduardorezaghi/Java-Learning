// Exercício 7.3, 7.4 & 7.5
public class Arrays1 
{
    private static final int ARRAY_SIZE = 10;
    private static final int TABLE_SIZE = 3;
    private static double[] fractions = new double[ARRAY_SIZE];
    private static int[][] table = new int[TABLE_SIZE][TABLE_SIZE];

    private static void arrayFractions()
    {
        for (int i = 0; i < fractions.length; i++) 
            fractions[i] = 0.0;
                
        double FourthElement = fractions[4];
        fractions[9] = 1.667;
        double NinethElement = fractions[9];

        fractions[6] = 3.333;
        double SixthElement = fractions[6];

        double arraySum = 0.0;
        for (int x = 0; x < fractions.length; x++)
            arraySum += fractions[x];

        System.out.printf("4º elemento = %.3f%n9º elemento = %.3f%n6º elemento = %.3f%nSoma do Array = %.3f%n",
            FourthElement, NinethElement, SixthElement, arraySum);
        System.out.println();
    }
    private static void arrayTable() 
    {
        for (int x = 0; x < table.length; x++) // linhas da tabela
            for (int y = 0; y < table[x].length; y++)  // colunas da tabela
                table[x][y] = x + y;    // inicializa cada elemento com a soma dos índices
        
        // exibe a tabela
        System.out.println("Tabela table[][]");
        for (int linha = 0; linha < table.length; linha++)
        {
            for (int coluna = 0; coluna < table[linha].length; coluna++)
                System.out.printf("%d   ", table[linha][coluna]);
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        /* 7.3
        Realize as seguintes tarefas para um array chamado fractions:
        a) Declare uma constante ARRAY_SIZE que é inicializada como 10.
        b) Declare um array com ARRAY_SIZE elementos do tipo double e os inicialize como 0 .
        c) Referencie o elemento 4 do array.
        d) Atribua o valor 1.667 ao elemento 9 do array.
        e) Atribua o valor 3.333 ao elemento 6 do array.
        f) Some todos os elementos do array, utilizando uma instrução for. Declare a variável inteira x como uma variável de controle para o
        loop. 
        */
        arrayFractions();
        
        /*  7.4
        Realize as seguintes tarefas para um array chamado table: 
        a) Declare e crie o array como um array de inteiros que tem três linhas e três colunas. Suponha que a constante ARRAY_SIZE foi declarada como 3. 
        b) Quantos elementos o array contém?     R: 9 elementos
        c) Utilize uma instrução for para inicializar cada elemento do array com a soma de seus índices. 
        Suponha que as variáveis inteiras x e y sejam declaradas como variáveis de controle.
         */
        arrayTable();

        /*  7.5
        Localize e corrija o erro em cada um dos seguintes segmentos de programa:
        a) final int ARRAY_SIZE = 5;
            ARRAY_SIZE = 10;
        b) Suponha:
            int[] b = new int[10];
            for (int i = 0; i <= b.length; i++)
                b[i] = 1;
        c) Suponha:
            int[][] a = {{1, 2}, {3, 4}};
            a[1, 1] = 5; 

        a) Resposta: Constante inicializada e depois modificada.
        b) Resposta: Atribuição de 1 à um elemento fora do índice aceitável (10).
        c) Resposta: Atribuição de 5 feita de forma errada. O correto é a[1][1] = 5.
        */
    }
}