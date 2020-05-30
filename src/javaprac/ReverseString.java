/*
package javaprac;

public class ReverseString {

    public static void main(String[] args) {

        String input = "This is a String";
        String output = reverse(input);
        System.out.println(output);
    }

    public static String reverse(String input) {
        String reverse = "";


        if (input.isEmpty() || input == null) {//checking if its empty or null
            System.out.println("String is not valid");
        }


        if (input.length() <= 1) {//if its single character its the same
            reverse = input;
        } else {//if its more than one character we take it in a array

            String[] originalArrray = input.split("\\s+");//we split with the spaces
            for (String item : originalArrray) {//we iterate over array ex this, is , a, test, string
                reverse = item + " " + reverse;//we add in reverse orderex
            }
        }

            return reverse.trim();

        }
    }


}
*/

