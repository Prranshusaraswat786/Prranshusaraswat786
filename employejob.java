import java.util.Scanner;

// Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
// if employee is female, then she will work only in urban areas.

// if employee is a male and age is in between 20 to 40 then he may work in anywhere

// if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

// And any other input of age should print "ERROR".
public class employejob {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();
            String sex = sc.next();
            String status = sc.next();
            if (sex == "F") {
                System.out.println("work in Urban area");
            } else if (sex == "male" && (20 < age << 40)) {
                System.out.println("work in anywhere");
            } else if (sex == "male" && age > 40) {
                System.out.println("work in Urban area");
            }
            // else {
            // System.out.println("ERROR");
            // }
        }
    }
}
