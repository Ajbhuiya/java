package datastructure;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> alist = new ArrayList<Integer>();
        alist.add(1);
        alist.add(2);
        alist.add(3);

       // System.out.println(alist.get(0));

        System.out.println(alist);
        for(int array : alist){
            System.out.println(array);
        }

    }
}









































/*


        //List<Double> myArray = new ArrayList<Double>();

        myArray.add(1.0);
        myArray.add(2.0);
        myArray.add(3.0);


        myArray.remove(1);
        System.out.println(myArray);
        int size = myArray.size();
        System.out.println(size);

        for (int i = 0; i < size; i++)
            System.out.println(myArray.get(i));


 for(int newArray:myArray){
            System.out.println(newArray);
        }
*


 }



 ArrayList<String> myArray = new ArrayList<String>();
        myArray.add("bmw");
        myArray.add("honda");
        myArray.add("nissan");

        for (String array : myArray) {
            System.out.println(array);
        }

    }

}


        //from video
        ArrayList<String> cars = new ArrayList<String>();
        //adding
        cars.add("Bmw");
        cars.add("honda");
        cars.add("benz");

        //size
        int size = cars.size();// gives size of array list
        System.out.println(size);

        //print out index one
        System.out.println(cars.get(1));

        //iteration
        for(int i =0;i<size;i++){
            System.out.println(cars.get(i));
        }

cars.remove();
        System.out.println(cars);

*/
