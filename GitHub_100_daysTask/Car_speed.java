package GitHub_100_daysTask;

import java.util.Scanner;

public class Car_speed {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("what is the type of car");
        String index1 = in.next();

        System.out.println("What is the speed of the car");
        int index2 = in.nextInt();

        Car_speed car = new Car_speed();
        car.carType(index1);
        car.maxSpeed(index2);
    }

    public void carType(String car){
        System.out.println("The car is a " + car);
    }
    public void maxSpeed(int speed ){
        System.out.println("Max speed is " + speed + " miles per hour.");
    }
}
