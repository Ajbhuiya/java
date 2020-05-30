package javaprac;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilereaderDemo {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\firoz_000\\Desktop\\Mobile3\\UdemyPractice\\src\\javaprac\\test.properties");

        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }


    }
}
