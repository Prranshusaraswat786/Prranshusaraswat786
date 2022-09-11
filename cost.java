// A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
// Ask user for quantity
// Suppose, one unit will cost 100.
// Judge and print total cost for user.

import java.util.Scanner;

public class cost {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n > 10) {
                float pr = 100 * n;
                float p = pr * 10 / 100;
                System.out.println(p);
            } else {
                float pr = 100 * n;
                System.out.println(pr);
            }

        }

    }
}
