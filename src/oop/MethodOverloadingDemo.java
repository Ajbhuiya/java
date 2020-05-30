package oop;

public class MethodOverloadingDemo {

    public void increaseSpeed(int speed) {
        System.out.println("my car speeds");
    }

    public void increaseSpeed(int speed, String mph) {
        System.out.println("my car speeds and goes fast");
    }

    public void increaseSpeed(String mph, int speed) {
        System.out.println("my car speeds and goes fast");


    }
}
