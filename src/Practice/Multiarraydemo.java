package Practice;

public class Multiarraydemo {
    public static void main(String[] args) {

        //to make a table or need coordinates
        int first[][] = {{8, 9, 10}, {12, 13, 14}};              //first [] is for row second for column
        int second[][] = {{30, 31, 32}, {43}, {4, 5, 6}};

        displayArray(first);
        System.out.println("****************");
        displayArray(second);

        System.out.println(first[0][0]);//will be 8
    }
        public static void displayArray(int x[][]){
            for (int row =0;row<x.length;row++){//loop to loop rows
             for(int column =0; column<x[row].length;column++)  {//another loop thru columns
                 System.out.print(x[row][column]+"\t");//prints row
             }
                System.out.println();//move down new line
        }

    }
}
