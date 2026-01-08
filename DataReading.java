import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReading {
    /*
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    */

    public static void FileOutput(File file, Thread thread, int wpm) {
        ArrayList<String> WordList = new ArrayList<>();
        try(Scanner fileScanner = new Scanner(file);) {
            while (fileScanner.hasNext()) {
                String word = fileScanner.next();
                WordList.add(word);
            }
            ArrayListOutput(WordList, wpm);
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

    public static void ArrayListOutput(ArrayList<String> WordList, int wpm) {
        for (String word : WordList) {
            System.out.println(word);
            try {
                Thread.sleep(60000 / wpm); // Sleep based on words per minute
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}