// Take values of length and breadth of a rectangle from user and check if it is square or not.

import java.util.Scanner;

public class squareornot {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter length of box");
            int n = in.nextInt();
            System.out.println("Enter breath of box");
            int k = in.nextInt();
            if (n == k) {
                System.out.println("YES is square");
            } else {
                System.out.println("NO is not square");
            }
        }
    }
}
