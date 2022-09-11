
// Take input of age of 3 people by user and determine oldest and youngest among them.

import java.util.Scanner;

public class oldestandoungest {
    public static void main(String[] args) {
        try (Scanner x = new Scanner(System.in)) {
            System.out.println("enter the age of user1");
            int age_user1 = x.nextInt();

            System.out.println("enter the age of user2");
            int age_user2 = x.nextInt();

            System.out.println("enter the age of user3");
            int age_user3 = x.nextInt();

            if (age_user1 > age_user2 && age_user1 > age_user3) {
                System.out.println("user1 has greatest age");
            } else if (age_user2 > age_user3 && age_user2 > age_user1) {
                System.out.println("user2 has gretest age");
            }

            else {
                System.out.println("user3 has greatest age");
            }
        }
    }
}
