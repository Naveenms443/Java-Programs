import java.util.Scanner;

public class LeftTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user for number of rows
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Printing spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();  // Move to next line
        }
    }
}
