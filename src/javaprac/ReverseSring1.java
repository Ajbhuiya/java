package javaprac;

public class ReverseSring1 {
    //Using built in reverse() method of the StringBuilder class:
    // String class does not have reverse() method,
    // we need to convert the input string to StringBuilder,
    // which is achieved by using the append method of StringBuilder.
    // After that, print out the characters of the reversed string by scanning from the first till the last index.

    public static void main(String[] args) {
        String input = "Geeks for Geeks";

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1 = input1.reverse();

        // print reversed String
        System.out.println(input1);

    }
}



//another way
// Java program to Reverse a String using ListIterator
/*another way
import java.lang.*;
        import java.io.*;
        import java.util.*;

// Class of ReverseString
class ReverseString
{
    public static void main(String[] args)
    {

    1. We copy String contents to an object
   of ArrayList.
1. We create a ListIterator object by using
   the listIterator() method on the ArrayList
   object.
2. ListIterator object is used to iterate over
   the list.
3. ListIterator object helps us to iterate
   over the reversed list and print it one
   by one to the output screen.


        String input = "Geeks For Geeks";
        char[] hello = input.toCharArray();
        List<Character> trial1 = new ArrayList<>();

        for (char c: hello)
            trial1.add(c);

        Collections.reverse(trial1);
        ListIterator li = trial1.listIterator();
        while (li.hasNext())
            System.out.print(li.next());
    }
}
*/
