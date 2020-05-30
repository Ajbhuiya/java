package abstraction;

public class Gyro extends Food{

    public void heatFood() {
        System.out.println("I like eating Gyro");

    }

    @Override
    public void giveFood() {
        System.out.println("give food to all");
    }
}
