package javaprac;

public class ExceptionsDemo {

    public static void main(String[] args) {

        int[] myArray = {2,4,5};
        try{
        System.out.println(myArray[3]);}
        catch (Exception e){
            System.out.println("this is out of index");}
        finally {
            System.out.println("this will always print");
        }














      /*  // TODO Auto-generated method stub
        Account acc = new Account();
        try {
            System.out.println("1st line");
            acc.withdraw(100);
            System.out.println("After trying the withdraw method");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            //System.out.println(e.getMessage());
            System.out.println("Try again at some other point");
        }
        finally {
            System.out.println("Allways executes");
        }
*/
    }

}


