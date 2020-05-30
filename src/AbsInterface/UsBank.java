package AbsInterface;

public interface UsBank {
//int has no method body only method dec.
    //can not create object
    //no static methods
    //we can declare variable;
    //100% abstraction- just declaring but 100% abs having in child class


    int money = 10;
    int bank =3;

    public abstract void deposit();

    public void withdraw();

    public void credit();

    public void invest();

}
