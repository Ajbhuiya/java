package javaprac;

public class ExcdeptionPrac {
    public static void main(String[] args) {

        int a =2;
        int b=0;


        try{int c =a/b;
            System.out.println(c);}
        catch(Exception e){
            System.out.println("cant divide by zero");

        }


















/*
        int a = 2;
        int b = 0;
        //int c = a / b;

        try {
            int c = a / b;
            System.out.println(c);
        }

            catch(ArithmeticException e){
                System.out.println("this cannot be divided by 0");*/
        }



















        /*int[] myArray = {1, 2, 3};

       try{ for(int i =0; i<=5; i++){
            System.out.println(myArray[i]);}
        }
        catch(Exception  e){
            System.out.println("out of bounds array");

           }finally{
           System.out.println("always prints");
       }
*/












       /* try {
            for(int i =0; i<=3; i++){
                System.out.println(myArray[i]);
            }
            //System.out.println(myArray[3]);
            System.out.println("nice try");
        } catch (Exception e) {
            System.out.println("array does not have 3rd index");
        }
        finally {
            System.out.println("this always executes");
        }

*/
















       /* try {
            int a = 2;
            int b = 0;
            int c;
            c = a / b;
            System.out.println(c);
        }catch (Exception e) {
            System.out.println("cannot divide by zero");
        }*/

    }
