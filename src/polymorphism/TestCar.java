package polymorphism;

public class TestCar {
    public static void main(String[] args) {
        Honda h = new Honda();
        h.start();//when method are common iin child and parent.child gets called
        h.sensor();

        Car c1 = new Honda();//common methods and car methods only
        c1.start();
        c1.park();


    }
}
