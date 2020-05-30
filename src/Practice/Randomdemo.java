package Practice;

import java.util.Random;

public class Randomdemo {

    public static void main(String[] args) {
        //to generate random # ex rolling a dice
        //first import java util random
        Random dice = new Random();
        int num;//temp variable. stores the # outouts on dice

        //to roll dice 10x create for loop
        for(int counter =1; counter<=10;counter++){
            num = 1+dice.nextInt(6);//next int cuz we gettinginteger then we type 6 for 6 numbers on dice. we add 1+ becuase 6 goes from 0-5
            System.out.println(num);

        }

    }
}
