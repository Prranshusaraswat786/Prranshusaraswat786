import java.util.Scanner;

public class medicalcause {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("he/she has medical cause or not\n" + "yes ==1  & no ==0");
        int a = sc.nextInt();
        // if (a == 1) {
        // System.out.println("allow to student sit");
        // } else {
        // System.out.println("deny to student sit");
        // }
        String b = (a == 1) ? "allow to student sit" : "deny to student sit";
        System.out.println(b);
    }
}
