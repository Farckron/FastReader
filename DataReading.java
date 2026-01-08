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


   TextObject textObject = new TextObject();
   //int totalWordCount = textObject.getTotalWordCount();


    public void fileOutput(File file, Thread thread, int wpm) {
        ArrayList<String> WordList = new ArrayList<>();
        try(Scanner fileScanner = new Scanner(file);) {
            while (fileScanner.hasNext()) {
                String word = fileScanner.next();
                WordList.add(word);
                textObject.incrementWordCount();
            }
            System.out.println("Total word count: " + textObject.getTotalWordCount() + "\n");
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

    public void ArrayListOutput(ArrayList<String> WordList, int wpm) {
        int wordCounter = 0;
        for (String word : WordList) {
            double pct = ((double) wordCounter / (double) textObject.getTotalWordCount()) * 100.0;
            System.out.printf("  [%4.2f%%]    %s%n", pct, word);
            try {
                Thread.sleep((long)(60000 / wpm)); // Sleep based on words per minute
                textObject.incrementTimeMilliseconds(60000.0 / wpm);
                wordCounter++;
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
        TotalTimeElapsedSeconds(textObject);
    }

    public void TotalTimeElapsedSeconds(TextObject textObject) {
        // double totalTime = textObject.getTotalTimeMilliseconds();
        double totalTimeSeconds = textObject.getTotalTimeMilliseconds() / 1000.0;
        System.out.printf("\nTotal reading time: [%.2f seconds]%n", totalTimeSeconds);
        double secondsPerWord = totalTimeSeconds / textObject.getTotalWordCount();
        System.out.printf("Average time per word: [%.2f seconds/word]%n", secondsPerWord);
    }
}