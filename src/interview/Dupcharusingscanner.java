package interview;

import java.util.Scanner;

public class Dupcharusingscanner {

public static void main(String[] args)
    {

//String str = "Nitin";

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char d = 0;
        int count = 0;
/* for(int i=0;i<str.length();i++)
{

char c = str.charAt(i);
System.out.println(c);
}*/
        for (int i = 0; i < str.length(); i++)
        {

            for (int j = i+1; j < str.length(); j++)
            {


                if (str.charAt(i)==str.charAt(j))
                {
                    if(d!=str.charAt(i))
                    {
                        count++;

                        d = str.charAt(i);

                        System.out.println("Duplicate Charaacter is "+d);
                        break;
                    }

                }
            }
        }
        System.out.println("Number of duplicate character is "+count);
    }

}


