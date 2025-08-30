import java.util.Scanner;

public class SimpleLogin {

    public static void main(String[] args) {
        // Predefined username and password for demonstration
        String correctUsername = "user123";
        String correctPassword = "password123";

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Simple Login System ---");

        // Get username input
        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();

        // Get password input
        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        // Authenticate credentials
        if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
            System.out.println("Login successful! Welcome, " + enteredUsername + ".");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }

        scanner.close(); // Close the scanner to release resources
    }
}
