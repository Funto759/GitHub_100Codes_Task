package GitHub_100_daysTask;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class largest_numbers {
    private static final int LENGTH = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");   // the The_Lottery.lottery picks are chosen
        String count = scanner.nextLine();
        String[] arrayy = count.split("\\s+"); // prints the numbers a strings in an array

        System.out.println("The  3 largest numbers are : ");
        for (int i =0; i < LENGTH; i++){
            Arrays.sort(arrayy, Collections.reverseOrder());
            System.out.println(arrayy[i] + "");
        }
    }
}
