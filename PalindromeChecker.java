import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or number: ");
        String input = sc.next();  // Taking input

        String reversed = ""; // Variable to store reversed string

        // Reversing the string manually using a loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Checking if original and reversed are the same
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("Not a palindrome.");
        }
    }
}
