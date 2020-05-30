package exceptions;

public class TryNCatch {

    public static void main(String[] args) {

        try {
            int a = 2;
            int b = 0;
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("abc");


    }
}
