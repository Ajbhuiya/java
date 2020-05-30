package abstraction;

public class Pizza extends Food {

    public static void main(String[] args) {
        Pizza food = new Pizza();
        food.eatFood();
        food.heatFood();

        Gyro gyro = new Gyro();
        gyro.heatFood();

    }


    public void heatFood() {
        System.out.println("I like to heat food before eating");

    }

    @Override
    public void giveFood() {
        System.out.println("give food");
    }
}
