package ProgramPractice;

import java.util.Random;

public class maxMin {
    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt(10);
        System.out.println("The first random values is: " + x);
        int y = rand.nextInt(10);
        System.out.println("The second random value is: " +y);
        int z = rand.nextInt(10);
        System.out.println("The third random value is: " +z);
        if (x > y && x > z) {
            System.out.println("The first value is greater than second and third value");
        } else if (y > x && y > z) {
            System.out.println("The second value is greater than first and third value");
        }
        else
            System.out.println("The third value is greater than first and second value");

    }
}
