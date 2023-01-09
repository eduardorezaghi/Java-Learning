// Exercise 14.3: StringComparison.java
/* 
* Compare Strings lexicographically.
*/

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string (firstString): ");
        String firstString = scanner.nextLine();
    
        System.out.println("Enter second string (secondString): ");
        String secondString = scanner.nextLine();

        int comparison = firstString.compareTo(secondString);
        
        System.out.println();
        if (comparison < 0) 
            System.out.println("Either characters or lengths of strings are different (lexicographically lesser case).");
        else if (comparison > 0) 
            System.out.println("Either characters or lengths of strings are different (lexicographically greater case).");
        else
            System.out.println("Both strings are equal.");
    } 
}