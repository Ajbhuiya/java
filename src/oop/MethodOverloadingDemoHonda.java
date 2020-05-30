package oop;

public class MethodOverloadingDemoHonda {
    public static void main(String[] args) {
        MethodOverloadingDemoHonda myHonda = new MethodOverloadingDemoHonda();
        myHonda.increaseSpeed(20);
    }

    public void increaseSpeed(int speed) {
        System.out.println("my car speeds high");
    }
}