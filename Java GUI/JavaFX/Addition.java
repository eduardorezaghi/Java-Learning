// Fig. 2.7: Addition.java
// Addition program that displays the sum of two numbers.
import java.util.Scanner; // program uses class Scanner
import javax.swing.JOptionPane;

public class Addition 
{
   // main method begins execution of Java application
   public static void main(String[] args)
   {
      // create a Scanner to obtain input from the command window
      

      int number1; // first number to add
      int number2; // second number to add
      int sum; // sum of number1 and number2


      number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first integer")); // prompt & read first number from user
      number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second integer")); // prompt & read second number from user

      sum = number1 + number2; // add numbers, then store total in sum

      String mensagem = String.format("Sum is %d%n", sum); //string 'mensagem'

      JOptionPane.showMessageDialog(null, mensagem); // display 'mensagem' containing sum

   } // end method main
} // end class Addition
