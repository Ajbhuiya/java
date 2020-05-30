package Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileScanner {
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("src/Reader/example.txt");
        Scanner sc = new Scanner(f);

        while (sc.hasNext()){
            System.out.println(sc.nextLine());

        }












        //with try catch

       /* File fileName = new File("src/Reader/example.txt");//to read a file
        Scanner sc = null;//we do this to put in try and catch

       *//* try {
            sc = new Scanner(fileName);

            while (sc.hasNext()){
                System.out.println(sc.nextLine());

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
*//*
*/
    }
}
