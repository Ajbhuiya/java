package Practice;

public class Arrays {

    public static void main(String[] args) {
        int[] myArray = new int[2];
        //  int [] myArray2={100,200}; another way to create array
        myArray[0] = 2;
        myArray[1] = 4;
        int[] smyArray = new int[2];

        for (int z : smyArray){
            System.out.println(z);

        }

            // System.out.println(myArray[1]);

        // System.out.println(myArray[1]);
        int len = myArray.length;
        for (int i = 0; i < len; i++) {
      //      System.out.println(myArray[i]);

            String [] myStrings= new String[2];
            myStrings[0]="bmw";
            myStrings[1]="benz";

            for(String str:myStrings){
                System.out.println(str);
            }

        }
        //////////from video
        int[] myIntArray1 = {100, 90};
		/*myIntArray1 = new int[10];

		myIntArray1[0] = 100;
		myIntArray1[1] = 90;*/

        System.out.println("0 index: " + myIntArray1[0]);
        System.out.println("1st index: " + myIntArray1[1]);
        //System.out.println("2nd index: " + myIntArray1[2]);

        String[] myStringArray1 = {"bmw", "audi", "honda"};
        System.out.println("0 index: " + myStringArray1[0]);
        System.out.println("1st index: " + myStringArray1[1]);
        System.out.println("2nd index: " + myStringArray1[2]);

        int len1 = myIntArray1.length;
        int len2 = myStringArray1.length;

        System.out.println("Int array length: " + len1);
        System.out.println("String array length: " + len2);

        for (int i = 0; i < len1; i++){
            System.out.println(myIntArray1[i]);
        }

        java.util.Arrays.sort(myIntArray1);

        for (int i = 0; i < len1; i++){
            System.out.println(myIntArray1[i]);
        }

        //System.arraycopy(src, srcPos, dest, destPos, length);

    }

}


