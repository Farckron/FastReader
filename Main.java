import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Main is running.");
        File file = new File("input.txt");

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);
        thread2.start();

        int wpm = HandlingInputOutput.userInputWpm(scanner);
        DataReading dataReading = new DataReading(); // ??
        dataReading.fileOutput(file, thread2, wpm);

        System.out.println("Total word count: " + dataReading.textObject.getTotalWordCount());
        
    }
}
