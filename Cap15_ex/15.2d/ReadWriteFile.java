// Exercise. 15.2a and 15.2c: ReadWriteFile.java
// Class to read old file and write on a new file its contents.

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadWriteFile {
    private static Scanner inOldMaster;
    static ArrayList<Account> accounts = new ArrayList<>();

    public static void main(String[] args) {
        openFileAndReadContents();
        try {
            createNewFileAndWriteContents();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        closeFile();
    }

    // open file oldmast.txt and read its contents
    public static void openFileAndReadContents() {
        try {
            inOldMaster = new Scanner(Paths.get("oldmast.txt"));

            while (inOldMaster.hasNext()) {
                Account acc = new Account();

                acc.setAccount(inOldMaster.nextInt());
                acc.setFirstName(inOldMaster.next());
                acc.setLastName(inOldMaster.next());
                acc.setBalance(inOldMaster.nextDouble());

                accounts.add(acc);
            }

        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        } 
        // Use finally block to proccess previous created resources
        finally {
            for (Account account : accounts)
                System.out.println(account.toString());
        }
    }

    public static void createNewFileAndWriteContents() throws FileNotFoundException {
        Formatter outNewMaster = new Formatter("newmast.txt");
        
        // While oldmast.txt has contents, read the file
        while (inOldMaster.hasNext()) {
            try {
                outNewMaster.format("%d %s %s %.3f",
                inOldMaster.nextInt(),
                inOldMaster.next(),
                inOldMaster.next(),
                inOldMaster.nextDouble());
            } catch (FormatterClosedException formatterClosedException)
            {
               System.err.println("Error writing to file. Terminating.");
               break;
            } 
            catch (NoSuchElementException elementException)
            {
               System.err.println("Invalid input. Please try again.");
               inOldMaster.nextLine(); // discard input so user can try again
            }
            // Use finally block to close previous used resources
            finally {
                outNewMaster.close();
            }
        }
    }

    public static void closeFile() {
        System.out.printf("Closing file");
        if (inOldMaster != null)
            inOldMaster.close();
    }
}
