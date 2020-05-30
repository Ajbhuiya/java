package javaprac;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\firoz_000\\Desktop\\Mobile3\\UdemyPractice\\src\\javaprac\\test.properties";
        Properties pro = new Properties();
        FileInputStream fs = new FileInputStream(path);
        pro.load(fs);
        System.out.println(pro.getProperty("course"));


















       /* String path = "C:\\Users\\firoz_000\\Desktop\\Mobile3\\UdemyPractice\\src\\javaprac\\test.properties";
        Properties pro = new Properties();
        FileInputStream fs = new FileInputStream(path);
        pro.load(fs);
        System.out.println(pro.getProperty("name"));
*/











    }

    }

        /*String path = "C:\\Users\\firoz_000\\Desktop\\Mobile3\\UdemyPractice\\src\\javaprac\\test.properties";

        Properties pro = new Properties();
        FileInputStream fs = new FileInputStream(path);
        pro.load(fs);
        System.out.println(pro.getProperty("name"));

















    }

*/       /* String path= "C:\\Users\\firoz_000\\Desktop\\Mobile3\\UdemyPractice\\src\\javaprac\\test.properties";
        Properties prop = new Properties();
        FileInputStream fs = new FileInputStream(path);
        prop.load(fs);
        System.out.println(prop.getProperty("name"));


    }
*/










 /*   public static void main(String[] args) throws IOException {
        String path ="C:\\Users\\firoz_000\\Desktop\\Mobile3\\UdemyPractice\\src\\javaprac\\test.properties";

        Properties prop = new Properties();//it load values from properties file
        FileInputStream fs = new FileInputStream(path);//reads the files all files have to have.properties
        prop.load(fs);//reads file in memory
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("course"));
    }
}
*/