package javaprac;

public class CastingDemo {
    public static void main(String[] args) {

        int x = (int) 100.00;
        System.out.println(x);

        int y = 200;
        double newy = y;
        System.out.println(newy);

        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
    }
    }
