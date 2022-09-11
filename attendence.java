import java.util.Scanner;

public class attendence {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("a==");
            int a = sc.nextInt();
            System.out.print("h==");
            int h = sc.nextInt();
            double c = (a / h) * 100;
            if (c <= 75) {
                System.out.println("valid for exam  " + c);
            } else {
                System.out.println("invalid for exam  " + c);
            }
        }
    }
}
