// Exercise 14.4: StringSliceComparison.java
/* 
* Compare Strings slices.
*/

import java.util.Scanner;
public class StringSliceComparison {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter first string (firstString): ");
        String firstString = scanner.nextLine();
    
        System.out.println("Enter second string (secondString): ");
        String secondString = scanner.nextLine();
    
        System.out.println("Enter # of characters to compare: ");
        int totalCharacters = scanner.nextInt();
        System.out.println("Enter initial comparison index: ");
        int initialIndex = scanner.nextInt();

        if (firstString.regionMatches(true, initialIndex, secondString, initialIndex, totalCharacters)) {
            System.out.println("The compared slices of two strings are the same.");
        } 
        else System.out.println("The compared slices of two strings are the different.");
    }
}
