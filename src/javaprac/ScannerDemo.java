package javaprac;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner bucky = new Scanner(System.in);
        int num1, num2, answer;
        System.out.println("Enter first number");
        num1=bucky.nextInt();//what type to be stored in variable
        System.out.println("Enter second number");
        num2=bucky.nextInt();
        answer= num1 + num2;
        System.out.println(answer);














        /*Scanner sc = new Scanner(System.in);//sys in is basically what we type and holds in sc variable
        System.out.println("what is your age");
        int age = sc.nextInt();
        System.out.println(age);
        System.out.println("what is your name ");
        String s = sc.nextLine();
        System.out.println(s);
*/


















      /*  Scanner sc = new Scanner(System.in);
        System.out.println("what is you name");
        String name = sc.nextLine();
        System.out.println(name);*/
    }


}



//reading files
  /*  public static void main (String [] args) throws FileNotFoundException {
        File filename = new File("C:\\Users\\firoz_000\\Desktop\\Mobile3\\UdemyPractice\\src\\javaprac\\java.html");
        Scanner sc = new Scanner(filename);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());}
    }
}*/