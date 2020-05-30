package abs;

public abstract class Car {

    int wheels;
    String model = "toyota";

    public void startEngine(){
        System.out.println(" car starts ");
    }
    public abstract void stopEngine();

    abstract void parkCar();



}
