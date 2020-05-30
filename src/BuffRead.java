import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffRead {
    public static void main(String[] args) throws IOException {
         //take input from user using buffered reader
        //when using buff reader u ask urself 3 questions what data where and what format.
        System.out.println("enter a number");

        //step 1 create input stream reader before the buffered reader
        InputStreamReader isr = new InputStreamReader(System.in);//takes input from keyboard and convert to string
        BufferedReader br = new BufferedReader(isr);//now it comes here

        int n = Integer.parseInt(br.readLine());// to convert we use parseint to convert string to int
        System.out.println(n);
    }
}
