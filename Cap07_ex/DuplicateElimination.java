import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {

    private static boolean linearSearch(int[] array, int number)
    {   
        // 5 4 3 2 6
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i])
                flag = true;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] intArray = new int[5];
        int novoElemento = 0;

        System.out.print("Insira um novo elemento no array: ");
        novoElemento = scan.nextInt();
        for (int i = 0; i < intArray.length; i++) 
        {
            while (!linearSearch(intArray, novoElemento)){
                System.out.println("Elemento já existente. Insira outro.");
                novoElemento = scan.nextInt();
            }
            System.out.print("Insira outro elemento no array: ");
            intArray[i] = scan.nextInt();
            System.out.printf("Elementos previamente inseridos: %s%n",Arrays.toString(intArray));
        }
        System.out.printf("Todos os elementos inseridos: %s%n",Arrays.toString(intArray));
    }
}
