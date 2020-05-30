package abs;

public class Honda extends Car {


    @Override
    public void stopEngine() {
        System.out.println("car starts");
    }

    @Override
    void parkCar() {
        System.out.println("car parks");

    }
    public void goFast(){
        System.out.println("car speeds");
    }
}