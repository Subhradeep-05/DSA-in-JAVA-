
import java.util.*;

public class hollow_rectangle {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {          // Outer loop → Rows
            for (int j = 1; j <= cols; j++) {      // Inner loop → Columns
                // Border condition:
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to next line after each row
        }
    }
}

    
