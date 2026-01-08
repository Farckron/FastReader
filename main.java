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

        int wpm = HandlingInput.UserInputWpm(scanner);
        DataReading.FileOutput(file, thread2, wpm);
        
    }
}