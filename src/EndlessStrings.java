import java.util.Scanner;

public class EndlessStrings {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";

        do {
            System.out.println("Echo (Type \"Stop\" to finish.): ");
            userInput = keyboard.nextLine();
            if (!(userInput.equalsIgnoreCase("Stop"))) {
                System.out.println(userInput);
            }
        } while (!(userInput.equalsIgnoreCase("STOP")));
    }
}