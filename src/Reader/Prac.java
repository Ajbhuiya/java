package Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prac {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("C:\\Users\\firoz_000\\Desktop\\search.xlsx");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line=br.readLine()) !=null) {
            System.out.println(line);
        }



    }
}
