package GitHub_100_daysTask;

import java.util.Scanner;

public class Age_status {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your age");
        int index1 = in.nextInt();
        Age_status status = new Age_status();
        status.age(index1);
    }

    private void age(int a) {
        if (a < 18) {
            System.out.println("Sorry you are not eligible for this site");
        } else {
            System.out.println("congrats you are eligible for this site");

        }
    }
}