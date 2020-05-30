package abstraction;

public abstract class Food {

    //if one abstract method whole class is abstract
    //no object creation
    //we can create constructor
    //can have final methods and cannot be overwritten or called

    public Food(){
        System.out.println("food");
    }
    int food;
    String color = "red";


    public void eatFood() {//non abstract method
        System.out.println("I wanna eat food");
    }

    public abstract void heatFood();//abstract method

    public abstract void giveFood();
}
