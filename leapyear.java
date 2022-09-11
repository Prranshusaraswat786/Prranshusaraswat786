import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
            if (a % 400 == 0) {
                if (a % 100 == 0) {
                    if (a % 4 == 0) {
                        System.out.println(a + " leap year");
                    } else {
                        System.out.println("is not leap year ");
                    }
                } else {
                    System.out.println("is the leap year");
                }
            } else {
                System.out.println("is not leap year");
            }
            String s = (a % 400 == 0) || (a % 4 == 0 && a % 100 == 0) ? "leap year" : " not leap year";
            System.out.println(s);
        }

    }
}
