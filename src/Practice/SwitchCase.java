package Practice;

public class SwitchCase {

    public static void main(String[] args) {

        String food = "Pizza";

        switch (food){
            case "Pizza":
                System.out.println("this is the food");
                break;
            case "gyro":
                break;
            case "burgers":
                System.out.println("maybe tmr");
                break;
            default:
                System.out.println("no foood today");
                break;
        }


    }
}
