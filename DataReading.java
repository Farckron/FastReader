import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataReading {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void FileOutput(File file, Thread thread, int wpm) {
        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNext()) {
                String word = fileScanner.next();
                System.out.println(word);
                Thread.sleep(60000 / wpm); // Sleep based on words per minute
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
          catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
          }
          finally {
            System.out.println("Execution finished successfully.");
          }
    }
}