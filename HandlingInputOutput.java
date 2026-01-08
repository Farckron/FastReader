import java.util.Scanner;

public class HandlingInputOutput {


    public static int userInputWpm(Scanner scanner) {
        System.out.println("Please enter reading speed (wpm): ");
        int wpm = scanner.nextInt();
        if (wpm <= 0) {
            System.out.println("Invalid input. Please enter a positive integer for wpm.");
            return userInputWpm(scanner);
        }
        System.out.println("You entered: " + wpm + " wpm"); 
        return wpm;
    }

    public static void wordsOutput() {
        
    }

}