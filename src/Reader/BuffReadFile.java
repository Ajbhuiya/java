package Reader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BuffReadFile {
    public static void main(String[] args) throws IOException {

        File f = new File("src/Reader/example.txt");
        Scanner sc = new Scanner(f);//scans each line either in console or file

        //to export to a new file
        String filecontents="";
        while (sc.hasNextLine()) {
            filecontents = filecontents.concat(sc.nextLine());
        }
        FileWriter writer = new FileWriter("C:\\Users\\firoz_000\\Desktop\\newfile.txt");
        writer.write(filecontents);
        writer.close();
            // to read fille
       /* while (sc.hasNextLine()){
            System.out.println(sc.nextLine());

        }
*/
        }


    }
