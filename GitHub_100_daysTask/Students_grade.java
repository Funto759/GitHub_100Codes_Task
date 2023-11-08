package GitHub_100_daysTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Students_grade {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("What is the individuals score");
        int index1 = in.nextInt();

        Students_grade course = new Students_grade();
        course.score(index1);
    }
    public void score (int a){
        Map<Integer , String> status = new HashMap<>();
        status.put(1, "He has scored a A in this course");
        status.put(2, "He has scored a B in this course");
        status.put(3, "He has scored a C in this course");
        status.put(4, "He has scored a D in this course");
        status.put(5, "He has scored a F in this course");

        if (a >= 75) {
            System.out.println(status.get(1));
        } else if (a >= 60 && a< 75) {
            System.out.println(status.get(2));
        } else if (a >= 50 && a < 60) {
            System.out.println(status.get(3));
        } else if (a >= 40 && a < 50) {
            System.out.println(status.get(4));
        } else if (a >= 0 && a < 40) {
            System.out.println(status.get(5));
        }
    }
}
