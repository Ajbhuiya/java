package Practice;

public class EnumDemo {  //first change to enum

    public enum Flavors{
        VANILLA,CHOCOLATE,STRAWBERRY;

        public static void main(String[] args) {
            Flavors fav =Flavors.CHOCOLATE;

            if(fav== fav.CHOCOLATE){
                System.out.println("My fav falvor");
            }else
                System.out.println("not my flavor");
        }





















}
}


       /* enum Flavor {//list of things that dont change*/

       /* CHOCOLATE, VANILLA, STRAWBERRY;
    }

    public static void main(String[] args) {
        Flavor flav = Flavor.VANILLA;

        if (flav == flav.VANILLA) {
            System.out.println("its vanilla");
        } else if (flav == flav.CHOCOLATE) {
            System.out.println("its chocolate");
        } else if (flav == flav.CHOCOLATE) {
            System.out.println("its chocolate");
        }

    }


}

*/
/*//enum outside of class
enum levels{
    LOW, MEDIUM, HIGH;
}
//we use enum for things that dont change its cleaner then array
public class EnumDemo {  //first change to enum

    public static void main(String[] args) {

    //enums are constants that are also objects , class and array mix
    //enum is used to declare constants or variables never change
        levels l = levels.LOW;

        switch(l) {
            case LOW:
                System.out.println("low level");
                break;
            case MEDIUM:
                System.out.println("medium level");
                break;
            case HIGH:
                System.out.println("high level");
                break;
        }

    }

}
*/
