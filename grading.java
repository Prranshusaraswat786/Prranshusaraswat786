// A school has following rules for grading system:
// a. Below 25 - F
// b. 25 to 45 - E
// c. 45 to 50 - D
// d. 50 to 60 - C
// e. 60 to 80 - B
// f. Above 80 - A
// Ask user to enter marks and print the corresponding grade.

import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of students");
            int n = sc.nextInt();
            if (n > 80) {
                System.out.println("A");
            } else if (n < 80 && n > 60) {
                System.out.println("B");
            } else if (n < 60 && n > 50) {
                System.out.println("C");
            } else if (n < 50 && n > 45) {
                System.out.println("D");
            } else if (n < 445 && n > 25) {
                System.out.println("E");
            } else if (n < 25) {
                System.out.println("F");
            }
        }

    }
}
