package oop;

public class InterfaceDemo implements CarInterface, BmwCarInt {
    // this class is implementing multiple interfaces


    //we ahve to implement only methods not the variables
    public void setSpeed(int speed) {
        System.out.println("this is implementation");
    }

    @Override
    public void navigation() {

    }
}
