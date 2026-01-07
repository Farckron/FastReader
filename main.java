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

        System.out.println("Please enter reading speed (wpm): ");
        int wpm = scanner.nextInt();
        System.out.println("You entered: " + wpm + " wpm");

        DataReading.FileOutput(file, thread2, wpm);
        
    }
}