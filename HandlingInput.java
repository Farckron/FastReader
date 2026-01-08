import java.util.Scanner;

public class HandlingInput {

    private int wpm;
    public static int UserInputWpm(Scanner scanner) {
        System.out.println("Please enter reading speed (wpm): ");
        int wpm = scanner.nextInt();
        if (wpm <= 0) {
            System.out.println("Invalid input. Please enter a positive integer for wpm.");
            return UserInputWpm(scanner);
        }
        System.out.println("You entered: " + wpm + " wpm"); 
        return wpm;
    }

    public int getWpm() {
        return wpm;
    }
}