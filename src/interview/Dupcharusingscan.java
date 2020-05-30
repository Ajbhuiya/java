package interview;

import java.util.Scanner;

public class Dupcharusingscan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a string");
        String s = sc.nextLine();
        int count=1;
        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<s.length(); j++) {
                if(s.charAt(i)==s.charAt(j)) {
                    count++;
                    System.out.println(s.charAt(i)+": "+count);
                }
            }
            count=1;
        }
    }
}


