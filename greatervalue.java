// Take two int values from user and print greatest among them.

import java.util.Scanner;

public class greatervalue {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int i = sc.nextInt();
            if (n > i) {
                System.out.println(n + "  greater no.");
            } else {
                System.out.println(i + " greater no.");
            }
        }
    }
}
