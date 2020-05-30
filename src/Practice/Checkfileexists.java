package Practice;

import java.io.File;

public class Checkfileexists {
    public static void main(String[] args) {
        File x = new File("C:\\Users\\firoz_000\\Desktop\\Mobile3\\UdemyPractice\\src\\javaprac\\test.properties");

        if (x.exists()){
            System.out.println(x.getName() + " exists");}
            else
            System.out.println("doesnt exist");

        }
    }
