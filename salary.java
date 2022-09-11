import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int h = sc.nextInt();
            if (h > 8) {
                float bal = (float) ((100 * h) * (1.25));
                System.out.println("salary  " + bal);
            } else {
                System.out.println("salary   " + h * 100);
            }
        }
    }
}